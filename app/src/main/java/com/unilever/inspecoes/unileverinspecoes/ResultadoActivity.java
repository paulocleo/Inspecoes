package com.unilever.inspecoes.unileverinspecoes;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
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
import com.itextpdf.text.Element;
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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class ResultadoActivity extends AppCompatActivity {

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

                txtAvisoAguarde.setVisibility(View.VISIBLE);
                criandoPdf();
            }
        });
    }

    private void criandoPdf() {

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
//            Image imageResperado = carregarImagemDrawble(R.drawable.resultado_esperado_img);
//            document.add(imageResperado);

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



            Toast.makeText(this, "Relatorio enviado com sucesso!", Toast.LENGTH_SHORT).show();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
            txtAvisoAguarde.setVisibility(View.INVISIBLE);
        }

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
}
