package com.unilever.inspecoes.unileverinspecoes;

import android.graphics.Color;
import android.graphics.Typeface;
import android.icu.math.BigDecimal;
import android.renderscript.Double4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView txtResultado;
    int valorResult;
    CheckBox checkSim;
    CheckBox checkNao;
    ImageView imgAlerta;
    TextView txtAlerta;

    Button btEnviarRelatorio;

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

            }
        });
    }
}
