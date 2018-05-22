package com.unilever.inspecoes.unileverinspecoes;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetalheFotoActivity extends AppCompatActivity {

    Button btTirarFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_foto);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            int codCamera = bundle.getInt("btCamera_1_1");
        }

        btTirarFoto = (Button)findViewById(R.id.btTirarFotoID);

        btTirarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(in, 0);
            }
        });

    }
}
