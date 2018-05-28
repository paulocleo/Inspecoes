package com.unilever.inspecoes.unileverinspecoes;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class DetalheFotoActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_CAMERA = 1;
    private static final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 2;
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

        imageViewCamera.setVisibility(View.INVISIBLE);

        btTirarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //region PERMISSAO ARMAZENAMENTO
                if (ContextCompat.checkSelfPermission(DetalheFotoActivity.this,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED) {

                    if (ActivityCompat.shouldShowRequestPermissionRationale(DetalheFotoActivity.this,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

                        ActivityCompat.requestPermissions(DetalheFotoActivity.this,
                                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                                MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);

                    } else {

                        ActivityCompat.requestPermissions(DetalheFotoActivity.this,
                                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                                MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
                    }
                }
                //endregion

                //region PERMISSAO CAMERA
                if (ContextCompat.checkSelfPermission(DetalheFotoActivity.this,
                        Manifest.permission.CAMERA)
                        != PackageManager.PERMISSION_GRANTED) {

                    if (ActivityCompat.shouldShowRequestPermissionRationale(DetalheFotoActivity.this,
                            Manifest.permission.CAMERA)) {

                        ActivityCompat.requestPermissions(DetalheFotoActivity.this,
                                new String[]{Manifest.permission.CAMERA},
                                MY_PERMISSIONS_REQUEST_CAMERA);

                        ActivityCompat.requestPermissions(DetalheFotoActivity.this,
                                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                                MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);

                    } else {

                        ActivityCompat.requestPermissions(DetalheFotoActivity.this,
                                new String[]{Manifest.permission.CAMERA},
                                MY_PERMISSIONS_REQUEST_CAMERA);
                    }
                }
                else
                {
                    Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(in, 0);
                }
                //endregion
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
        imageViewCamera.setVisibility(View.VISIBLE);

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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_CAMERA: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(in, 0);

                } else {

                    Toast.makeText(this, "Eh necessario permissao da CAMERA para tirar foto.", Toast.LENGTH_LONG).show();
                }
                return;
            }

            case MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    //nada por enquanto

                } else {

                    Toast.makeText(this, "Eh necessario permissao de ARMAZENAMENTO DA FOTO.", Toast.LENGTH_LONG).show();
                }
                return;
            }

        }
    }
}
