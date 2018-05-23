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

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle bundle = getIntent().getExtras();

        Double resultado = bundle.getDouble("resultado");

        String arredondado = String.format("%.2f", resultado).replace(",", ".");

        txtResultado = (TextView) findViewById(R.id.resultadoID);
        checkSim = (CheckBox) findViewById(R.id.checkBoxSim);
        checkNao = (CheckBox) findViewById(R.id.checkBoxNao);
        txtAlerta = (TextView) findViewById(R.id.idTextAlerta);
        imgAlerta = (ImageView) findViewById(R.id.idImgAlerta);
        btEnviarRelatorio = (Button) findViewById(R.id.btResultadoId);
        txtAvisoAguarde = (TextView) findViewById(R.id.txtAvisoAguarde);

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

            Drawable drawableImgEsperado = getResources().getDrawable(R.drawable.resultado_esperado_img);

            Bitmap bitmapImgEsperado = ((BitmapDrawable)drawableImgEsperado).getBitmap();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bitmapImgEsperado.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] imagemResperadoByte = stream.toByteArray();
            Image imageResperado = Image.getInstance(imagemResperadoByte);
            document.add(imageResperado);

            String imagePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/MinhasInspecoes/foto1.png";
            Image image = Image.getInstance(imagePath);
            //image.setAbsolutePosition(165f, 465f);
            image.scaleToFit(290f,290f);
            document.add(image);

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
}
