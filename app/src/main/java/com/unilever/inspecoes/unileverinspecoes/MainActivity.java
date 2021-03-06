package com.unilever.inspecoes.unileverinspecoes;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button s01Button;
    Button s02Button;
    Button s03Button;
    Button s04Button;

    ProgressDialog progress = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s01Button = (Button)  findViewById(R.id.S01button);
        s02Button = (Button)  findViewById(R.id.S02button);
        s03Button = (Button)  findViewById(R.id.S03button);
        s04Button = (Button)  findViewById(R.id.S04button);

        s01Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Linha nao disponivel.", Toast.LENGTH_LONG).show();
            }
        });

        s02Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Linha nao disponivel.", Toast.LENGTH_LONG).show();
            }
        });

        s03Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load();
                Intent in = new Intent(MainActivity.this, S03Activity.class);
                startActivity(in);
            }
        });

        s04Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Linha nao disponivel.", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void load() {
        progress = new ProgressDialog(MainActivity.this);
        progress.setTitle("Aviso");
        progress.setMessage("Aguarde...");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(progress != null){
            progress.dismiss();
        }
    }
}
