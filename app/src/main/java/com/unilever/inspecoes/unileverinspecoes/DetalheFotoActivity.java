package com.unilever.inspecoes.unileverinspecoes;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

public class DetalheFotoActivity extends AppCompatActivity {

    Button btTirarFoto;
    Button btApagarFoto;
    Button btVoltar;
    ImageView imageViewCamera;

    String codCamera = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_foto);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            codCamera = bundle.getString("btCamera");
        }

        inicializaComponentes();

        btTirarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(in, 0);
            }
        });

        btApagarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable dw = getResources().getDrawable(R.drawable.imgsemimagem);
                imageViewCamera.setImageDrawable(dw);
            }
        });

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    private void inicializaComponentes() {

        btTirarFoto = (Button)findViewById(R.id.btTirarFotoID);
        btApagarFoto = (Button) findViewById(R.id.btApagarFotoID);
        btVoltar = (Button) findViewById(R.id.btVoltarFotoID);

        imageViewCamera = (ImageView)findViewById(R.id.imageViewCamera);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        imageViewCamera.setImageBitmap(bitmap);

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] imagem = stream.toByteArray();

        Date date = new Date();
        int dataHoje = date.getDate();
        int mesHoje = date.getMonth();
        int anoHoje = date.getYear();

        try {
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/MinhasInspecoes/Inspecao" + dataHoje + mesHoje + anoHoje;
            File file = new File(path, "fotoInspecao_"+ dataHoje + mesHoje + anoHoje + "_" +codCamera+".png");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
            }

            OutputStream os = new FileOutputStream(file);
            os.write(imagem);
            os.close();

        } catch (IOException e) {
            Log.w("ExternalStorage", "Error writing", e);
        }
    }
}
