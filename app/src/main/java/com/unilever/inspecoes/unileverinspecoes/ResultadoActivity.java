package com.unilever.inspecoes.unileverinspecoes;

import android.Manifest;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class ResultadoActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 2;
    TextView txtResultado;
    int valorResult;
    CheckBox checkSim;
    CheckBox checkNao;
    ImageView imgAlerta;
    TextView txtAlerta;
    TextView txtAvisoAguarde;

    Button btEnviarRelatorio;

    Document document;
    ArrayList<String> listaCheckNao;

    ListEnum listaEnumCheckAll = new ListEnum();

    Date date = new Date();
    int dataHoje = date.getDate();
    int mesHoje = date.getMonth();
    int anoHoje = date.getYear();

    Image imageX = null;
    Image imageCheck = null;

    AlertDialog.Builder alerta;
    boolean isEnvio = false;
    ProgressDialog progress = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //imageX     = carregarImagemDrawble(R.drawable.nok);
        //imageCheck = carregarImagemDrawble(R.drawable.check);

        Bundle bundle = getIntent().getExtras();

        listaCheckNao = bundle.getStringArrayList("listaCheckNao");
        Double resultado = bundle.getDouble("resultado");

        String arredondado = String.format("%.2f", resultado).replace(",", ".");

        txtResultado      = (TextView) findViewById(R.id.resultadoID);
        checkSim          = (CheckBox) findViewById(R.id.checkBoxSim);
        checkNao          = (CheckBox) findViewById(R.id.checkBoxNao);
        txtAlerta         = (TextView) findViewById(R.id.idTextAlerta);
        imgAlerta         = (ImageView) findViewById(R.id.idImgAlerta);
        btEnviarRelatorio = (Button) findViewById(R.id.btResultadoId);
        txtAvisoAguarde   = (TextView) findViewById(R.id.txtAvisoAguarde);

        txtAvisoAguarde.setVisibility(View.INVISIBLE);

        if(resultado != null) {

            Double aux = Double.parseDouble(arredondado) * 100;

            valorResult = aux.intValue();

            txtResultado.setTypeface(null, Typeface.BOLD);

            if (valorResult >= 95) {
                txtResultado.setBackgroundColor(Color.parseColor("#00ff00"));
                checkSim.setChecked(false);
                checkNao.setChecked(true);
                txtAlerta.setVisibility(View.INVISIBLE);
                imgAlerta.setVisibility(View.INVISIBLE);
            } else if (valorResult >= 80 && valorResult <= 94) {
                txtResultado.setBackgroundColor(Color.parseColor("#c7cc00"));
                checkSim.setChecked(false);
                checkNao.setChecked(true);
                txtAlerta.setVisibility(View.INVISIBLE);
                imgAlerta.setVisibility(View.INVISIBLE);
            } else {
                txtResultado.setBackgroundColor(Color.parseColor("#ff0000"));
                checkSim.setChecked(true);
                checkNao.setChecked(false);
                txtAlerta.setVisibility(View.VISIBLE);
                imgAlerta.setVisibility(View.VISIBLE);

            }
        }
        txtResultado.setText(valorResult + "%");

        btEnviarRelatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                prepararArquivos();
            }
        });
    }

    private void prepararArquivos() {

        if(isOnline()){

            progress = new ProgressDialog(ResultadoActivity.this);
            progress.setTitle("Enviando");
            progress.setMessage("Aguarde, enviando relatorio...");
            progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
            progress.show();

            criandoPdf();

            new EnvioEmailThread().execute();

            //txtAvisoAguarde.setVisibility(View.VISIBLE);
        }
        else
        {
            progress.dismiss();
            Toast.makeText(this, "Sem conexao com a INTERNET", Toast.LENGTH_LONG).show();
        }
    }

    private boolean enviarEmail() {
        Mail m = new Mail("webpcruz@gmail.com", "Cruz2401");

        String[] toArr = {"paulocac_1@hotmail.com", "eduardavero@gmail.com"};
        m.setTo(toArr);

        m.setFrom("inspecoes@unilever.com.br");
        m.setSubject("Email de teste do seu app");
        m.setBody("teste recebeu um email com sucesso!");

        try {
            String filePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/MinhasInspecoes/InspecoesPlanejadas.pdf";
            m.addAttachment(filePath);//anexo opcional
            isEnvio = m.send();

            return isEnvio;

        }
        catch(RuntimeException rex){ }//erro ignorado
        catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Erro ao enviar email! (" + e.getMessage() + ")", Toast.LENGTH_LONG).show();
        }

        return false;
    }

    private boolean isOnline() {

        try {
            ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getActiveNetworkInfo();
            return netInfo != null && netInfo.isConnectedOrConnecting();
        }
        catch(Exception ex){
            Toast.makeText(getApplicationContext(), "Erro ao verificar se estava online! (" + ex.getMessage() + ")", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void criandoPdf() {

        //region PERMISSAO ARMAZENAMENTO
        if (ContextCompat.checkSelfPermission(ResultadoActivity.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(ResultadoActivity.this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

                ActivityCompat.requestPermissions(ResultadoActivity.this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);

            } else {

                ActivityCompat.requestPermissions(ResultadoActivity.this,
                        new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
            }
        }
        else
        {
            //Entra aqui apos realizacao da permissao de armazenamento.
            try {

                String filename = "InspecoesPlanejadas.pdf";

                document = new Document(PageSize.A4);

                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/MinhasInspecoes";

                File dir = new File(path, filename);
                if (!dir.exists()) {
                    dir.getParentFile().mkdirs();
                }

                FileOutputStream fOut = new FileOutputStream(dir);
                fOut.flush();

                PdfWriter.getInstance(document, fOut);
                document.open();
                document.add(new Paragraph("INSPECAO PLANEJADA"));
                document.add(new Paragraph("Resultado"));
                document.add(new Paragraph(String.valueOf(valorResult) + "%"));

                //region TABLE RESULTADO ESPERADO
                String[][] tableResultadoEsperado =
                        {{"0% a 79%", "INACEITAVEL"}
                                ,{"80% a 94%", "BOA"}
                                ,{"95% a 100%", "EXCELENTE"}
                        };
                PdfPTable tableResultadoEsperadoPDF = new PdfPTable(2);
                PdfPCell cellItemPorcentam;
                PdfPCell cellItemDescricao;

                for (int x=0; x < tableResultadoEsperado.length; x++)
                {
                    cellItemPorcentam = new PdfPCell(new Phrase(tableResultadoEsperado[x][0]));
                    cellItemDescricao = new PdfPCell(new Phrase(tableResultadoEsperado[x][1]));
                    if(x==0)
                    {
                        cellItemPorcentam.setBackgroundColor(BaseColor.RED);
                        cellItemDescricao.setBackgroundColor(BaseColor.RED);
                    }
                    else if(x==1)
                    {
                        cellItemPorcentam.setBackgroundColor(BaseColor.YELLOW);
                        cellItemDescricao.setBackgroundColor(BaseColor.YELLOW);
                    }
                    else
                    {
                        cellItemPorcentam.setBackgroundColor(BaseColor.GREEN);
                        cellItemDescricao.setBackgroundColor(BaseColor.GREEN);
                    }

                    tableResultadoEsperadoPDF.addCell(cellItemPorcentam);
                    tableResultadoEsperadoPDF.addCell(cellItemDescricao);
                }

                document.add(tableResultadoEsperadoPDF);
                //endregion

                adicionarCheckListPDF();

//            String imagePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/MinhasInspecoes/foto1.png";
//            Image image = Image.getInstance(imagePath);
//            //image.setAbsolutePosition(165f, 465f);
//            image.scaleToFit(290f,290f);
//            document.add(image);
//
//            Toast.makeText(this, "Relatorio enviado com sucesso!", Toast.LENGTH_SHORT).show();

            } catch (DocumentException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                document.close();
                //txtAvisoAguarde.setVisibility(View.INVISIBLE);
            }
        }
        //endregion
    }

    private void adicionarCheckListPDF() throws DocumentException {

        //CheckList 1
        addChecklist(listaEnumCheckAll.CheckList_1);
        addChecklist(listaEnumCheckAll.CheckList_2);

    }

    private void addChecklist(String[][] checkList) throws DocumentException {

        PdfPTable table = new PdfPTable(6);
        PdfPCell cellItem;
        PdfPCell cellImgCheck;
        PdfPCell cellFoto;

        for(int i=0; i<checkList.length; i++)
        {
            if(i==0)
            {
                cellItem = new PdfPCell(new Phrase(checkList[i][0]));
                cellItem.setColspan(6);
                cellItem.setBorder(Rectangle.NO_BORDER);
                table.addCell(cellItem);
            }
            else
            {
                boolean existeItemNao = false;
                for (String itemNao:listaCheckNao) {
                    if(itemNao.equals(checkList[i][1]))
                    {
                        cellImgCheck = new PdfPCell(new Phrase(new Chunk("X", FontFactory.getFont(FontFactory.TIMES_BOLD, 16, Font.BOLD))));
                        cellImgCheck.setBorder(Rectangle.NO_BORDER);
                        cellImgCheck.setBackgroundColor(BaseColor.RED);
                        cellItem = new PdfPCell(new Phrase(checkList[i][0]));
                        cellItem.setColspan(5);
                        cellItem.setBorder(Rectangle.NO_BORDER);
                        table.addCell(cellImgCheck);
                        table.addCell(cellItem);

                        Image foto = carregarFoto(checkList[i][1]);
                        if(foto != null)
                        {
                            cellFoto = new PdfPCell(foto);
                            cellFoto.setColspan(6);
                            cellFoto.setBorder(Rectangle.NO_BORDER);
                            table.addCell(cellFoto);
                        }

                        existeItemNao = true;
                        break;
                    }
                }

                if(!existeItemNao)
                {
                    cellImgCheck = new PdfPCell(new Phrase("OK"));
                    cellImgCheck.setBorder(Rectangle.NO_BORDER);
                    cellImgCheck.setBackgroundColor(BaseColor.GREEN);
                    cellItem = new PdfPCell(new Phrase(checkList[i][0]));
                    cellItem.setColspan(5);
                    cellItem.setBorder(Rectangle.NO_BORDER);
                    table.addCell(cellImgCheck);
                    table.addCell(cellItem);
                }
            }
        }

        table.setWidthPercentage(100f);
        document.add(table);
    }

//    private Image carregarImagemDrawble(int idDrawableImagem) {
//
//        try {
//            Drawable drawableImg = getResources().getDrawable(idDrawableImagem);
//            Bitmap bitmapImg = ((BitmapDrawable)drawableImg).getBitmap();
//            ByteArrayOutputStream stream = new ByteArrayOutputStream();
//            bitmapImg.compress(Bitmap.CompressFormat.PNG, 50, stream);
//            byte[] imagemByte = stream.toByteArray();
//
//            return Image.getInstance(imagemByte);
//
//        } catch (BadElementException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    private Image carregarFoto(String codCamera) {

        try {
            String caminhoFotoTirada = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/MinhasInspecoes/Inspecao" + dataHoje + mesHoje + anoHoje + "/" + "fotoInspecao_"+ dataHoje + mesHoje + anoHoje + "_" +codCamera+".png";
            Image foto = Image.getInstance(caminhoFotoTirada);
            foto.scaleToFit(290f,290f);

            return foto;

        } catch (BadElementException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {

            case MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    criandoPdf();

                } else {

                    Toast.makeText(this, "Eh necessario permissao de ARMAZENAMENTO DO ARQUIVO.", Toast.LENGTH_LONG).show();
                }
                return;
            }

        }
    }

    class EnvioEmailThread extends AsyncTask<Void, Void, Boolean> {


        @Override
        protected Boolean doInBackground(Void... voids) {

            boolean retorno = enviarEmail();
            progress.dismiss();

            return retorno;
        }

        @Override
        protected void onPostExecute(Boolean s) {
            super.onPostExecute(s);

            if(s)
            {
                alerta = new AlertDialog.Builder(ResultadoActivity.this);
                alerta.setTitle("SUCESSO");
                alerta.setMessage("Relatorio enviado com sucesso");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                alerta.create();
                alerta.show();
            }
        }
    }
}
