package com.unilever.inspecoes.unileverinspecoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class S03Activity extends AppCompatActivity {

    //region DECLARACAO BUTTON
    Button obterResultado;
    Button btSelecionaCK1;
    Button btSelecionaCK2;
    Button btSelecionaCK3;
    Button btSelecionaCK4;
    Button btSelecionaCK5;
    Button btSelecionaCK6;
    Button btSelecionaCK7;
    Button btSelecionaCK8;
    Button btSelecionaCK9;
    Button btSelecionaCK10;
    Button btSelecionaCK11;
    Button btSelecionaCK12;
    Button btSelecionaCK13;
    Button btSelecionaCK14;
    //endregion

    //region DECLARACAO CHECKBOX

    //region DECLARACAO CHECKBOX LISTA 1
    CheckBox checkBox_1_1;
    CheckBox checkBox_1_2;
    CheckBox checkBox_1_3;
    CheckBox checkBox_1_1_nao;
    CheckBox checkBox_1_2_nao;
    CheckBox checkBox_1_3_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 2
    CheckBox checkBox_2_1;
    CheckBox checkBox_2_2;
    CheckBox checkBox_2_3;
    CheckBox checkBox_2_1_nao;
    CheckBox checkBox_2_2_nao;
    CheckBox checkBox_2_3_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 3
    CheckBox checkBox_3_1;
    CheckBox checkBox_3_2;
    CheckBox checkBox_3_3;
    CheckBox checkBox_3_4;
    CheckBox checkBox_3_5;
    CheckBox checkBox_3_6;
    CheckBox checkBox_3_7;
    CheckBox checkBox_3_8;
    CheckBox checkBox_3_1_nao;
    CheckBox checkBox_3_2_nao;
    CheckBox checkBox_3_3_nao;
    CheckBox checkBox_3_4_nao;
    CheckBox checkBox_3_5_nao;
    CheckBox checkBox_3_6_nao;
    CheckBox checkBox_3_7_nao;
    CheckBox checkBox_3_8_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 4
    CheckBox checkBox_4_1;
    CheckBox checkBox_4_2;
    CheckBox checkBox_4_3;
    CheckBox checkBox_4_4;
    CheckBox checkBox_4_5;
    CheckBox checkBox_4_6;
    CheckBox checkBox_4_7;
    CheckBox checkBox_4_8;
    CheckBox checkBox_4_1_nao;
    CheckBox checkBox_4_2_nao;
    CheckBox checkBox_4_3_nao;
    CheckBox checkBox_4_4_nao;
    CheckBox checkBox_4_5_nao;
    CheckBox checkBox_4_6_nao;
    CheckBox checkBox_4_7_nao;
    CheckBox checkBox_4_8_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 5
    CheckBox checkBox_5_1;
    CheckBox checkBox_5_2;
    CheckBox checkBox_5_3;
    CheckBox checkBox_5_1_nao;
    CheckBox checkBox_5_2_nao;
    CheckBox checkBox_5_3_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 6
    CheckBox checkBox_6_1;
    CheckBox checkBox_6_2;
    CheckBox checkBox_6_3;
    CheckBox checkBox_6_4;
    CheckBox checkBox_6_5;
    CheckBox checkBox_6_6;
    CheckBox checkBox_6_7;
    CheckBox checkBox_6_1_nao;
    CheckBox checkBox_6_2_nao;
    CheckBox checkBox_6_3_nao;
    CheckBox checkBox_6_4_nao;
    CheckBox checkBox_6_5_nao;
    CheckBox checkBox_6_6_nao;
    CheckBox checkBox_6_7_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 7
    CheckBox checkBox_7_1;
    CheckBox checkBox_7_2;
    CheckBox checkBox_7_1_nao;
    CheckBox checkBox_7_2_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 8
    CheckBox checkBox_8_1;
    CheckBox checkBox_8_2;
    CheckBox checkBox_8_3;
    CheckBox checkBox_8_1_nao;
    CheckBox checkBox_8_2_nao;
    CheckBox checkBox_8_3_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 9
    CheckBox checkBox_9_1;
    CheckBox checkBox_9_2;
    CheckBox checkBox_9_1_nao;
    CheckBox checkBox_9_2_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 10
    CheckBox checkBox_10_1;
    CheckBox checkBox_10_2;
    CheckBox checkBox_10_3;
    CheckBox checkBox_10_4;
    CheckBox checkBox_10_5;
    CheckBox checkBox_10_6;
    CheckBox checkBox_10_7;
    CheckBox checkBox_10_8;
    CheckBox checkBox_10_9;
    CheckBox checkBox_10_10;
    CheckBox checkBox_10_11;
    CheckBox checkBox_10_12;
    CheckBox checkBox_10_13;
    CheckBox checkBox_10_14;
    CheckBox checkBox_10_15;
    CheckBox checkBox_10_1_nao;
    CheckBox checkBox_10_2_nao;
    CheckBox checkBox_10_3_nao;
    CheckBox checkBox_10_4_nao;
    CheckBox checkBox_10_5_nao;
    CheckBox checkBox_10_6_nao;
    CheckBox checkBox_10_7_nao;
    CheckBox checkBox_10_8_nao;
    CheckBox checkBox_10_9_nao;
    CheckBox checkBox_10_10_nao;
    CheckBox checkBox_10_11_nao;
    CheckBox checkBox_10_12_nao;
    CheckBox checkBox_10_13_nao;
    CheckBox checkBox_10_14_nao;
    CheckBox checkBox_10_15_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 11
    CheckBox checkBox_11_1;
    CheckBox checkBox_11_2;
    CheckBox checkBox_11_3;
    CheckBox checkBox_11_4;
    CheckBox checkBox_11_5;
    CheckBox checkBox_11_6;
    CheckBox checkBox_11_1_nao;
    CheckBox checkBox_11_2_nao;
    CheckBox checkBox_11_3_nao;
    CheckBox checkBox_11_4_nao;
    CheckBox checkBox_11_5_nao;
    CheckBox checkBox_11_6_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 12
    CheckBox checkBox_12_1;
    CheckBox checkBox_12_2;
    CheckBox checkBox_12_3;
    CheckBox checkBox_12_4;
    CheckBox checkBox_12_5;
    CheckBox checkBox_12_1_nao;
    CheckBox checkBox_12_2_nao;
    CheckBox checkBox_12_3_nao;
    CheckBox checkBox_12_4_nao;
    CheckBox checkBox_12_5_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 13
    CheckBox checkBox_13_1;
    CheckBox checkBox_13_2;
    CheckBox checkBox_13_3;
    CheckBox checkBox_13_4;
    CheckBox checkBox_13_1_nao;
    CheckBox checkBox_13_2_nao;
    CheckBox checkBox_13_3_nao;
    CheckBox checkBox_13_4_nao;
    //endregion

    //region DECLARACAO CHECKBOX LISTA 14
    CheckBox checkBox_14_1;
    CheckBox checkBox_14_2;
    CheckBox checkBox_14_1_nao;
    CheckBox checkBox_14_2_nao;
    //endregion

    //endregion

    //region DECLARACAO DOUBLE
    Double resultadoTotal;
    Double resultado_check1;
    Double resultado_check2;
    Double resultado_check3;
    Double resultado_check4;
    Double resultado_check5;
    Double resultado_check6;
    Double resultado_check7;
    Double resultado_check8;
    Double resultado_check9;
    Double resultado_check10;
    Double resultado_check11;
    Double resultado_check12;
    Double resultado_check13;
    Double resultado_check14;
    //endregion

    //region DECLARACAO EDITTEXT
    EditText editTextResponsavel;
    EditText editTextData;
    EditText editTextCIPA;
    //endregion

    //region DECLARACAO IMAGEVIEW

    //region DECLARACAO BT CAMERA LISTA 1
    ImageView btCamera_1_1;
    ImageView btCamera_1_2;
    ImageView btCamera_1_3;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 2
    ImageView btCamera_2_1;
    ImageView btCamera_2_2;
    ImageView btCamera_2_3;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 3
    ImageView btCamera_3_1;
    ImageView btCamera_3_2;
    ImageView btCamera_3_3;
    ImageView btCamera_3_4;
    ImageView btCamera_3_5;
    ImageView btCamera_3_6;
    ImageView btCamera_3_7;
    ImageView btCamera_3_8;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 4
    ImageView btCamera_4_1;
    ImageView btCamera_4_2;
    ImageView btCamera_4_3;
    ImageView btCamera_4_4;
    ImageView btCamera_4_5;
    ImageView btCamera_4_6;
    ImageView btCamera_4_7;
    ImageView btCamera_4_8;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 5
    ImageView btCamera_5_1;
    ImageView btCamera_5_2;
    ImageView btCamera_5_3;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 6
    ImageView btCamera_6_1;
    ImageView btCamera_6_2;
    ImageView btCamera_6_3;
    ImageView btCamera_6_4;
    ImageView btCamera_6_5;
    ImageView btCamera_6_6;
    ImageView btCamera_6_7;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 7
    ImageView btCamera_7_1;
    ImageView btCamera_7_2;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 8
    ImageView btCamera_8_1;
    ImageView btCamera_8_2;
    ImageView btCamera_8_3;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 9
    ImageView btCamera_9_1;
    ImageView btCamera_9_2;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 10
    ImageView btCamera_10_1;
    ImageView btCamera_10_2;
    ImageView btCamera_10_3;
    ImageView btCamera_10_4;
    ImageView btCamera_10_5;
    ImageView btCamera_10_6;
    ImageView btCamera_10_7;
    ImageView btCamera_10_8;
    ImageView btCamera_10_9;
    ImageView btCamera_10_10;
    ImageView btCamera_10_11;
    ImageView btCamera_10_12;
    ImageView btCamera_10_13;
    ImageView btCamera_10_14;
    ImageView btCamera_10_15;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 11
    ImageView btCamera_11_1;
    ImageView btCamera_11_2;
    ImageView btCamera_11_3;
    ImageView btCamera_11_4;
    ImageView btCamera_11_5;
    ImageView btCamera_11_6;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 12
    ImageView btCamera_12_1;
    ImageView btCamera_12_2;
    ImageView btCamera_12_3;
    ImageView btCamera_12_4;
    ImageView btCamera_12_5;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 13
    ImageView btCamera_13_1;
    ImageView btCamera_13_2;
    ImageView btCamera_13_3;
    ImageView btCamera_13_4;
    //endregion

    //region DECLARACAO BT CAMERA LISTA 14
    ImageView btCamera_14_1;
    ImageView btCamera_14_2;
    //endregion
    //endregion

    List<String> listaComNao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s03);

        listaComNao = new ArrayList<>();

        inicializarComponentes();

        //region EVENTO CLICK BOTAO SELECIONA TUDO
        btSelecionaCK1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_1_1.setChecked(true);
                checkBox_1_2.setChecked(true);
                checkBox_1_3.setChecked(true);
            }
        });

        btSelecionaCK2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_2_1.setChecked(true);
                checkBox_2_2.setChecked(true);
                checkBox_2_3.setChecked(true);
            }
        });

        btSelecionaCK3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_3_1.setChecked(true);
                checkBox_3_2.setChecked(true);
                checkBox_3_3.setChecked(true);
                checkBox_3_4.setChecked(true);
                checkBox_3_5.setChecked(true);
                checkBox_3_6.setChecked(true);
                checkBox_3_7.setChecked(true);
                checkBox_3_8.setChecked(true);
            }
        });

        btSelecionaCK4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_4_1.setChecked(true);
                checkBox_4_2.setChecked(true);
                checkBox_4_3.setChecked(true);
                checkBox_4_4.setChecked(true);
                checkBox_4_5.setChecked(true);
                checkBox_4_6.setChecked(true);
                checkBox_4_7.setChecked(true);
                checkBox_4_8.setChecked(true);
            }
        });

        btSelecionaCK5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_5_1.setChecked(true);
                checkBox_5_2.setChecked(true);
                checkBox_5_3.setChecked(true);
            }
        });

        btSelecionaCK6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_6_1.setChecked(true);
                checkBox_6_2.setChecked(true);
                checkBox_6_3.setChecked(true);
                checkBox_6_4.setChecked(true);
                checkBox_6_5.setChecked(true);
                checkBox_6_6.setChecked(true);
                checkBox_6_7.setChecked(true);
            }
        });

        btSelecionaCK7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_7_1.setChecked(true);
                checkBox_7_2.setChecked(true);
            }
        });

        btSelecionaCK8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_8_1.setChecked(true);
                checkBox_8_2.setChecked(true);
                checkBox_8_3.setChecked(true);
            }
        });

        btSelecionaCK9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_9_1.setChecked(true);
                checkBox_9_2.setChecked(true);
            }
        });

        btSelecionaCK10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_10_1.setChecked(true);
                checkBox_10_2.setChecked(true);
                checkBox_10_3.setChecked(true);
                checkBox_10_4.setChecked(true);
                checkBox_10_5.setChecked(true);
                checkBox_10_6.setChecked(true);
                checkBox_10_7.setChecked(true);
                checkBox_10_8.setChecked(true);
                checkBox_10_9.setChecked(true);
                checkBox_10_10.setChecked(true);
                checkBox_10_11.setChecked(true);
                checkBox_10_12.setChecked(true);
                checkBox_10_13.setChecked(true);
                checkBox_10_14.setChecked(true);
                checkBox_10_15.setChecked(true);
            }
        });

        btSelecionaCK11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_11_1.setChecked(true);
                checkBox_11_2.setChecked(true);
                checkBox_11_3.setChecked(true);
                checkBox_11_4.setChecked(true);
                checkBox_11_5.setChecked(true);
                checkBox_11_6.setChecked(true);
            }
        });

        btSelecionaCK12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_12_1.setChecked(true);
                checkBox_12_2.setChecked(true);
                checkBox_12_3.setChecked(true);
                checkBox_12_4.setChecked(true);
                checkBox_12_5.setChecked(true);
            }
        });

        btSelecionaCK13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_13_1.setChecked(true);
                checkBox_13_2.setChecked(true);
                checkBox_13_3.setChecked(true);
                checkBox_13_4.setChecked(true);
            }
        });

        btSelecionaCK14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBox_14_1.setChecked(true);
                checkBox_14_2.setChecked(true);
            }
        });
        //endregion

        //region OCULTA CAMERAS
        btCamera_1_1.setVisibility(View.INVISIBLE);
        btCamera_1_2.setVisibility(View.INVISIBLE);
        btCamera_1_3.setVisibility(View.INVISIBLE);

        btCamera_2_1.setVisibility(View.INVISIBLE);
        btCamera_2_2.setVisibility(View.INVISIBLE);
        btCamera_2_3.setVisibility(View.INVISIBLE);

        btCamera_3_1.setVisibility(View.INVISIBLE);
        btCamera_3_2.setVisibility(View.INVISIBLE);
        btCamera_3_3.setVisibility(View.INVISIBLE);
        btCamera_3_4.setVisibility(View.INVISIBLE);
        btCamera_3_5.setVisibility(View.INVISIBLE);
        btCamera_3_6.setVisibility(View.INVISIBLE);
        btCamera_3_7.setVisibility(View.INVISIBLE);
        btCamera_3_8.setVisibility(View.INVISIBLE);

        btCamera_4_1.setVisibility(View.INVISIBLE);
        btCamera_4_2.setVisibility(View.INVISIBLE);
        btCamera_4_3.setVisibility(View.INVISIBLE);
        btCamera_4_4.setVisibility(View.INVISIBLE);
        btCamera_4_5.setVisibility(View.INVISIBLE);
        btCamera_4_6.setVisibility(View.INVISIBLE);
        btCamera_4_7.setVisibility(View.INVISIBLE);
        btCamera_4_8.setVisibility(View.INVISIBLE);

        btCamera_5_1.setVisibility(View.INVISIBLE);
        btCamera_5_2.setVisibility(View.INVISIBLE);
        btCamera_5_3.setVisibility(View.INVISIBLE);

        btCamera_6_1.setVisibility(View.INVISIBLE);
        btCamera_6_2.setVisibility(View.INVISIBLE);
        btCamera_6_3.setVisibility(View.INVISIBLE);
        btCamera_6_4.setVisibility(View.INVISIBLE);
        btCamera_6_5.setVisibility(View.INVISIBLE);
        btCamera_6_6.setVisibility(View.INVISIBLE);
        btCamera_6_7.setVisibility(View.INVISIBLE);

        btCamera_7_1.setVisibility(View.INVISIBLE);
        btCamera_7_2.setVisibility(View.INVISIBLE);

        btCamera_8_1.setVisibility(View.INVISIBLE);
        btCamera_8_2.setVisibility(View.INVISIBLE);
        btCamera_8_3.setVisibility(View.INVISIBLE);

        btCamera_9_1.setVisibility(View.INVISIBLE);
        btCamera_9_2.setVisibility(View.INVISIBLE);

        btCamera_10_1.setVisibility(View.INVISIBLE);
        btCamera_10_2.setVisibility(View.INVISIBLE);
        btCamera_10_3.setVisibility(View.INVISIBLE);
        btCamera_10_4.setVisibility(View.INVISIBLE);
        btCamera_10_5.setVisibility(View.INVISIBLE);
        btCamera_10_6.setVisibility(View.INVISIBLE);
        btCamera_10_7.setVisibility(View.INVISIBLE);
        btCamera_10_8.setVisibility(View.INVISIBLE);
        btCamera_10_9.setVisibility(View.INVISIBLE);
        btCamera_10_10.setVisibility(View.INVISIBLE);
        btCamera_10_11.setVisibility(View.INVISIBLE);
        btCamera_10_12.setVisibility(View.INVISIBLE);
        btCamera_10_13.setVisibility(View.INVISIBLE);
        btCamera_10_14.setVisibility(View.INVISIBLE);
        btCamera_10_15.setVisibility(View.INVISIBLE);

        btCamera_11_1.setVisibility(View.INVISIBLE);
        btCamera_11_2.setVisibility(View.INVISIBLE);
        btCamera_11_3.setVisibility(View.INVISIBLE);
        btCamera_11_4.setVisibility(View.INVISIBLE);
        btCamera_11_5.setVisibility(View.INVISIBLE);
        btCamera_11_6.setVisibility(View.INVISIBLE);

        btCamera_12_1.setVisibility(View.INVISIBLE);
        btCamera_12_2.setVisibility(View.INVISIBLE);
        btCamera_12_3.setVisibility(View.INVISIBLE);
        btCamera_12_4.setVisibility(View.INVISIBLE);
        btCamera_12_5.setVisibility(View.INVISIBLE);

        btCamera_13_1.setVisibility(View.INVISIBLE);
        btCamera_13_2.setVisibility(View.INVISIBLE);
        btCamera_13_3.setVisibility(View.INVISIBLE);
        btCamera_13_4.setVisibility(View.INVISIBLE);

        btCamera_14_1.setVisibility(View.INVISIBLE);
        btCamera_14_2.setVisibility(View.INVISIBLE);
        //endregion

        //region CHECKLIST 1
        checkBox_1_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_1_1_nao.setChecked(false);
                    btCamera_1_1.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_1_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_1_2_nao.setChecked(false);
                    btCamera_1_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_1_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_1_3_nao.setChecked(false);
                    btCamera_1_3.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_1_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                addRemoveCheckNao(b, "1_1");
                if(b){
                    checkBox_1_1.setChecked(false);
                    btCamera_1_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_1_1.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_1_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                addRemoveCheckNao(b, "1_2");
                if(b){
                    checkBox_1_2.setChecked(false);
                    btCamera_1_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_1_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_1_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                addRemoveCheckNao(b, "1_3");
                if(b){
                    checkBox_1_3.setChecked(false);
                    btCamera_1_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_1_3.setVisibility(View.INVISIBLE);
                }
            }
        });

        //region EVENTO CLICK BT CAMERA LISTA 1
        //BT CAMERA 1_1
        btCamera_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "1_1");
                startActivity(in);
            }
        });

        //BT CAMERA 1_2
        btCamera_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "1_2");
                startActivity(in);
            }
        });

        //BT CAMERA 1_3
        btCamera_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "1_3");
                startActivity(in);
            }
        });
        //endregion

        //endregion

        //region CHECKLIST 2
        checkBox_2_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_2_1_nao.setChecked(false);
                    btCamera_2_1.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_2_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_2_2_nao.setChecked(false);
                    btCamera_2_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_2_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_2_3_nao.setChecked(false);
                    btCamera_2_3.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_2_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                addRemoveCheckNao(b, "2_1");
                if(b){
                    checkBox_2_1.setChecked(false);
                    btCamera_2_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_2_1.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_2_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                addRemoveCheckNao(b, "2_2");
                if(b){
                    checkBox_2_2.setChecked(false);
                    btCamera_2_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_2_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox_2_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                addRemoveCheckNao(b, "2_3");
                if(b){
                    checkBox_2_3.setChecked(false);
                    btCamera_2_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_2_3.setVisibility(View.INVISIBLE);
                }
            }
        });

        //region EVENTO CLICK BT CAMERA LISTA 2
        btCamera_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "2_1");
                startActivity(in);
            }
        });
        btCamera_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "2_2");
                startActivity(in);
            }
        });
        btCamera_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "2_3");
                startActivity(in);
            }
        });
        //endregion

        //endregion

        //region CHECKLIST 3
        checkBox_3_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_1_nao.setChecked(false);
                    btCamera_3_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_2_nao.setChecked(false);
                    btCamera_3_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_3_nao.setChecked(false);
                    btCamera_3_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_4_nao.setChecked(false);
                    btCamera_3_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_5_nao.setChecked(false);
                    btCamera_3_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_6_nao.setChecked(false);
                    btCamera_3_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_7_nao.setChecked(false);
                    btCamera_3_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_3_8_nao.setChecked(false);
                    btCamera_3_8.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_1");
                if(b){
                    checkBox_3_1.setChecked(false);
                    btCamera_3_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_2");
                if(b){
                    checkBox_3_2.setChecked(false);
                    btCamera_3_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_3");
                if(b){
                    checkBox_3_3.setChecked(false);
                    btCamera_3_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_4");
                if(b){
                    checkBox_3_4.setChecked(false);
                    btCamera_3_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_5_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_5");
                if(b){
                    checkBox_3_5.setChecked(false);
                    btCamera_3_5.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_6_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_6");
                if(b){
                    checkBox_3_6.setChecked(false);
                    btCamera_3_6.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_7_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_7");
                if(b){
                    checkBox_3_7.setChecked(false);
                    btCamera_3_7.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_3_8_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "3_8");
                if(b){
                    checkBox_3_8.setChecked(false);
                    btCamera_3_8.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_3_8.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_1");
                startActivity(in);
            }
        });
        btCamera_3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_2");
                startActivity(in);
            }
        });
        btCamera_3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_3");
                startActivity(in);
            }
        });
        btCamera_3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_4");
                startActivity(in);
            }
        });
        btCamera_3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_5");
                startActivity(in);
            }
        });
        btCamera_3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_6");
                startActivity(in);
            }
        });
        btCamera_3_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_7");
                startActivity(in);
            }
        });
        btCamera_3_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "3_8");
                startActivity(in);
            }
        });

        //endregion

        //region CHECKLIST 4
        checkBox_4_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_1_nao.setChecked(false);
                    btCamera_4_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_2_nao.setChecked(false);
                    btCamera_4_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_3_nao.setChecked(false);
                    btCamera_4_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_4_nao.setChecked(false);
                    btCamera_4_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_5_nao.setChecked(false);
                    btCamera_4_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_6_nao.setChecked(false);
                    btCamera_4_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_7_nao.setChecked(false);
                    btCamera_4_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_4_8_nao.setChecked(false);
                    btCamera_4_8.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_1");
                if(b){
                    checkBox_4_1.setChecked(false);
                    btCamera_4_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_2");
                if(b){
                    checkBox_4_2.setChecked(false);
                    btCamera_4_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_3");
                if(b){
                    checkBox_4_3.setChecked(false);
                    btCamera_4_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_4");
                if(b){
                    checkBox_4_4.setChecked(false);
                    btCamera_4_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_5_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_5");
                if(b){
                    checkBox_4_5.setChecked(false);
                    btCamera_4_5.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_6_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_6");
                if(b){
                    checkBox_4_6.setChecked(false);
                    btCamera_4_6.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_7_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_7");
                if(b){
                    checkBox_4_7.setChecked(false);
                    btCamera_4_7.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_4_8_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "4_8");
                if(b){
                    checkBox_4_8.setChecked(false);
                    btCamera_4_8.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_4_8.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_1");
                startActivity(in);
            }
        });
        btCamera_4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_2");
                startActivity(in);
            }
        });
        btCamera_4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_3");
                startActivity(in);
            }
        });
        btCamera_4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_4");
                startActivity(in);
            }
        });
        btCamera_4_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_5");
                startActivity(in);
            }
        });
        btCamera_4_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_6");
                startActivity(in);
            }
        });
        btCamera_4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_7");
                startActivity(in);
            }
        });
        btCamera_4_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "4_8");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 5
        checkBox_5_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_5_1_nao.setChecked(false);
                    btCamera_5_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_5_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_5_2_nao.setChecked(false);
                    btCamera_5_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_5_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_5_3_nao.setChecked(false);
                    btCamera_5_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_5_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "5_1");
                if(b){
                    checkBox_5_1.setChecked(false);
                    btCamera_5_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_5_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_5_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "5_2");
                if(b){
                    checkBox_5_2.setChecked(false);
                    btCamera_5_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_5_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_5_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "5_3");
                if(b){
                    checkBox_5_3.setChecked(false);
                    btCamera_5_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_5_3.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "5_1");
                startActivity(in);
            }
        });
        btCamera_5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "5_2");
                startActivity(in);
            }
        });
        btCamera_5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "5_3");
                startActivity(in);
            }
        });

        //endregion

        //region CHECKLIST 6
        checkBox_6_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_1_nao.setChecked(false);
                    btCamera_6_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_2_nao.setChecked(false);
                    btCamera_6_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_3_nao.setChecked(false);
                    btCamera_6_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_4_nao.setChecked(false);
                    btCamera_6_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_5_nao.setChecked(false);
                    btCamera_6_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_6_nao.setChecked(false);
                    btCamera_6_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_6_7_nao.setChecked(false);
                    btCamera_6_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_1");
                if(b){
                    checkBox_6_1.setChecked(false);
                    btCamera_6_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_2");
                if(b){
                    checkBox_6_2.setChecked(false);
                    btCamera_6_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_3");
                if(b){
                    checkBox_6_3.setChecked(false);
                    btCamera_6_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_4");
                if(b){
                    checkBox_6_4.setChecked(false);
                    btCamera_6_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_5_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_5");
                if(b){
                    checkBox_6_5.setChecked(false);
                    btCamera_6_5.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_6_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_6");
                if(b){
                    checkBox_6_6.setChecked(false);
                    btCamera_6_6.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_6_7_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "6_7");
                if(b){
                    checkBox_6_7.setChecked(false);
                    btCamera_6_7.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_6_7.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_1");
                startActivity(in);
            }
        });
        btCamera_6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_2");
                startActivity(in);
            }
        });
        btCamera_6_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_3");
                startActivity(in);
            }
        });
        btCamera_6_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_4");
                startActivity(in);
            }
        });
        btCamera_6_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_5");
                startActivity(in);
            }
        });
        btCamera_6_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_6");
                startActivity(in);
            }
        });
        btCamera_6_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "6_7");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 7
        checkBox_7_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_7_1_nao.setChecked(false);
                    btCamera_7_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_7_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_7_2_nao.setChecked(false);
                    btCamera_7_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_7_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "7_1");
                if(b){
                    checkBox_7_1.setChecked(false);
                    btCamera_7_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_7_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_7_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "7_2");
                if(b){
                    checkBox_7_2.setChecked(false);
                    btCamera_7_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_7_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "7_1");
                startActivity(in);
            }
        });
        btCamera_7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "7_2");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 8
        checkBox_8_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_8_1_nao.setChecked(false);
                    btCamera_8_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_8_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_8_2_nao.setChecked(false);
                    btCamera_8_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_8_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_8_2_nao.setChecked(false);
                    btCamera_8_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_8_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "8_1");
                if(b){
                    checkBox_8_1.setChecked(false);
                    btCamera_8_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_8_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_8_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "8_2");
                if(b){
                    checkBox_8_2.setChecked(false);
                    btCamera_8_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_8_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_8_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "8_3");
                if(b){
                    checkBox_8_3.setChecked(false);
                    btCamera_8_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_8_3.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "8_1");
                startActivity(in);
            }
        });
        btCamera_8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "8_2");
                startActivity(in);
            }
        });
        btCamera_8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "8_3");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 9
        checkBox_9_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_9_1_nao.setChecked(false);
                    btCamera_9_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_9_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_9_2_nao.setChecked(false);
                    btCamera_9_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_9_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "9_1");
                if(b){
                    checkBox_9_1.setChecked(false);
                    btCamera_9_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_9_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_9_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "9_2");
                if(b){
                    checkBox_9_2.setChecked(false);
                    btCamera_9_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_9_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "9_1");
                startActivity(in);
            }
        });
        btCamera_9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "9_2");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 10
        checkBox_10_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_1_nao.setChecked(false);
                    btCamera_10_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_2_nao.setChecked(false);
                    btCamera_10_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_3_nao.setChecked(false);
                    btCamera_10_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_4_nao.setChecked(false);
                    btCamera_10_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_5_nao.setChecked(false);
                    btCamera_10_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_6_nao.setChecked(false);
                    btCamera_10_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_7_nao.setChecked(false);
                    btCamera_10_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_8_nao.setChecked(false);
                    btCamera_10_8.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_9_nao.setChecked(false);
                    btCamera_10_9.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_10_nao.setChecked(false);
                    btCamera_10_10.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_11_nao.setChecked(false);
                    btCamera_10_11.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_12_nao.setChecked(false);
                    btCamera_10_12.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_13_nao.setChecked(false);
                    btCamera_10_13.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_14_nao.setChecked(false);
                    btCamera_10_14.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_10_15_nao.setChecked(false);
                    btCamera_10_15.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_1");
                if(b){
                    checkBox_10_1.setChecked(false);
                    btCamera_10_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_2");
                if(b){
                    checkBox_10_2.setChecked(false);
                    btCamera_10_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_3");
                if(b){
                    checkBox_10_3.setChecked(false);
                    btCamera_10_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_4");
                if(b){
                    checkBox_10_4.setChecked(false);
                    btCamera_10_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_5_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_5");
                if(b){
                    checkBox_10_5.setChecked(false);
                    btCamera_10_5.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_6_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_6");
                if(b){
                    checkBox_10_6.setChecked(false);
                    btCamera_10_6.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_7_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_7");
                if(b){
                    checkBox_10_7.setChecked(false);
                    btCamera_10_7.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_7.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_8_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_8");
                if(b){
                    checkBox_10_8.setChecked(false);
                    btCamera_10_8.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_8.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_9_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_9");
                if(b){
                    checkBox_10_9.setChecked(false);
                    btCamera_10_9.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_9.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_10_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_10");
                if(b){
                    checkBox_10_10.setChecked(false);
                    btCamera_10_10.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_10.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_11_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_11");
                if(b){
                    checkBox_10_11.setChecked(false);
                    btCamera_10_11.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_11.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_12_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_12");
                if(b){
                    checkBox_10_12.setChecked(false);
                    btCamera_10_12.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_12.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_13_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_13");
                if(b){
                    checkBox_10_13.setChecked(false);
                    btCamera_10_13.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_13.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_14_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_14");
                if(b){
                    checkBox_10_14.setChecked(false);
                    btCamera_10_14.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_14.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_10_15_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "10_15");
                if(b){
                    checkBox_10_15.setChecked(false);
                    btCamera_10_15.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_10_15.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_1");
                startActivity(in);
            }
        });
        btCamera_10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_2");
                startActivity(in);
            }
        });
        btCamera_10_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_3");
                startActivity(in);
            }
        });
        btCamera_10_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_4");
                startActivity(in);
            }
        });
        btCamera_10_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_5");
                startActivity(in);
            }
        });
        btCamera_10_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_6");
                startActivity(in);
            }
        });
        btCamera_10_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_7");
                startActivity(in);
            }
        });
        btCamera_10_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_8");
                startActivity(in);
            }
        });
        btCamera_10_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_9");
                startActivity(in);
            }
        });
        btCamera_10_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_10");
                startActivity(in);
            }
        });
        btCamera_10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_11");
                startActivity(in);
            }
        });
        btCamera_10_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_12");
                startActivity(in);
            }
        });
        btCamera_10_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_13");
                startActivity(in);
            }
        });
        btCamera_10_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_14");
                startActivity(in);
            }
        });
        btCamera_10_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "10_15");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 11
        checkBox_11_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_11_1_nao.setChecked(false);
                    btCamera_11_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_11_2_nao.setChecked(false);
                    btCamera_11_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_11_3_nao.setChecked(false);
                    btCamera_11_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_11_4_nao.setChecked(false);
                    btCamera_11_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_11_5_nao.setChecked(false);
                    btCamera_11_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_11_6_nao.setChecked(false);
                    btCamera_11_6.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "11_1");
                if(b){
                    checkBox_11_1.setChecked(false);
                    btCamera_11_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_11_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "11_2");
                if(b){
                    checkBox_11_2.setChecked(false);
                    btCamera_11_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_11_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "11_3");
                if(b){
                    checkBox_11_3.setChecked(false);
                    btCamera_11_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_11_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "11_4");
                if(b){
                    checkBox_11_4.setChecked(false);
                    btCamera_11_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_11_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_5_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "11_5");
                if(b){
                    checkBox_11_5.setChecked(false);
                    btCamera_11_5.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_11_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_11_6_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "11_6");
                if(b){
                    checkBox_11_6.setChecked(false);
                    btCamera_11_6.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_11_6.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_11_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "11_1");
                startActivity(in);
            }
        });
        btCamera_11_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "11_2");
                startActivity(in);
            }
        });
        btCamera_11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "11_3");
                startActivity(in);
            }
        });
        btCamera_11_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "11_4");
                startActivity(in);
            }
        });
        btCamera_11_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "11_5");
                startActivity(in);
            }
        });
        btCamera_11_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "11_6");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 12
        checkBox_12_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_12_1_nao.setChecked(false);
                    btCamera_12_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_12_2_nao.setChecked(false);
                    btCamera_12_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_12_3_nao.setChecked(false);
                    btCamera_12_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_12_4_nao.setChecked(false);
                    btCamera_12_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_12_5_nao.setChecked(false);
                    btCamera_12_5.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "12_1");
                if(b){
                    checkBox_12_1.setChecked(false);
                    btCamera_12_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_12_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "12_2");
                if(b){
                    checkBox_12_2.setChecked(false);
                    btCamera_12_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_12_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "12_3");
                if(b){
                    checkBox_12_3.setChecked(false);
                    btCamera_12_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_12_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "12_4");
                if(b){
                    checkBox_12_4.setChecked(false);
                    btCamera_12_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_12_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_12_5_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "12_5");
                if(b){
                    checkBox_12_5.setChecked(false);
                    btCamera_12_5.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_12_5.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_12_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "12_1");
                startActivity(in);
            }
        });
        btCamera_12_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "12_2");
                startActivity(in);
            }
        });
        btCamera_12_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "12_3");
                startActivity(in);
            }
        });
        btCamera_12_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "12_4");
                startActivity(in);
            }
        });
        btCamera_12_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "12_5");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 13
        checkBox_13_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_13_1_nao.setChecked(false);
                    btCamera_13_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_13_2_nao.setChecked(false);
                    btCamera_13_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_13_3_nao.setChecked(false);
                    btCamera_13_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_13_4_nao.setChecked(false);
                    btCamera_13_4.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "13_1");
                if(b){
                    checkBox_13_1.setChecked(false);
                    btCamera_13_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_13_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "13_2");
                if(b){
                    checkBox_13_2.setChecked(false);
                    btCamera_13_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_13_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_3_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "13_3");
                if(b){
                    checkBox_13_3.setChecked(false);
                    btCamera_13_3.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_13_3.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_13_4_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "13_4");
                if(b){
                    checkBox_13_4.setChecked(false);
                    btCamera_13_4.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_13_4.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "13_1");
                startActivity(in);
            }
        });
        btCamera_13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "13_2");
                startActivity(in);
            }
        });
        btCamera_13_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "13_3");
                startActivity(in);
            }
        });
        btCamera_13_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "13_4");
                startActivity(in);
            }
        });
        //endregion

        //region CHECKLIST 14
        checkBox_14_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_14_1_nao.setChecked(false);
                    btCamera_14_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_14_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkBox_14_2_nao.setChecked(false);
                    btCamera_14_2.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_14_1_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "14_1");
                if(b){
                    checkBox_14_1.setChecked(false);
                    btCamera_14_1.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_14_1.setVisibility(View.INVISIBLE);
                }
            }
        });
        checkBox_14_2_nao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                addRemoveCheckNao(b, "14_2");
                if(b){
                    checkBox_14_2.setChecked(false);
                    btCamera_14_2.setVisibility(View.VISIBLE);
                }
                else {
                    btCamera_14_2.setVisibility(View.INVISIBLE);
                }
            }
        });

        btCamera_14_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "14_1");
                startActivity(in);
            }
        });
        btCamera_14_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera", "14_2");
                startActivity(in);
            }
        });
        //endregion

        //region EVENTO CLICK BOTAO RESULTADO
        obterResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, ResultadoActivity.class);

                resultado_check1 = resultadochecklist1();
                resultado_check2 = resultadochecklist2();
                resultado_check3 = resultadochecklist3();
                resultado_check4 = resultadochecklist4();
                resultado_check5 = resultadochecklist5();
                resultado_check6 = resultadochecklist6();
                resultado_check7 = resultadochecklist7();
                resultado_check8 = resultadochecklist8();
                resultado_check9 = resultadochecklist9();
                resultado_check10 = resultadochecklist10();
                resultado_check11 = resultadochecklist11();
                resultado_check12 = resultadochecklist12();
                resultado_check13 = resultadochecklist13();
                resultado_check14 = resultadochecklist14();

                resultadoTotal = resultado_check1 + resultado_check2 + resultado_check3 +
                                resultado_check4 + resultado_check5 + resultado_check6 +
                                resultado_check7 + resultado_check8 + resultado_check9 + resultado_check10 +
                                resultado_check11 + resultado_check12 + resultado_check13 +
                                resultado_check14;

                resultadoTotal = resultadoTotal/14;

                ArrayList<String> arrayValidacao = new ArrayList<>();
                if(editTextResponsavel.getText().toString().equals(""))
                {
                    arrayValidacao.add("Campo: Responsável Pela Inspeção é obrigatório.\n");
                }
                if(editTextData.getText().toString().equals(""))
                {
                    arrayValidacao.add("Campo: Data da Inspeção é obrigatório. \n");
                }
                if(editTextCIPA.getText().toString().equals(""))
                {
                    arrayValidacao.add("Campo: CIPA é obrigatório.\n");
                }

                if(arrayValidacao.size() > 0)
                {
                    StringBuilder textoValidacao = new StringBuilder();
                    for (String msg : arrayValidacao)
                    {
                        textoValidacao.append(msg);
                    }
                    Toast.makeText(S03Activity.this, textoValidacao.toString(), Toast.LENGTH_LONG).show();
                }
                else
                {
                    in.putExtra("resultado", resultadoTotal);
                    in.putExtra("listaCheckNao", (ArrayList<String>)listaComNao);
                    startActivity(in);
                }
            }
        });

        //endregion

    }

    private void addRemoveCheckNao(boolean b, String codList) {

        if(b){
            listaComNao.add(codList);
        }
        else{
            for (String item: listaComNao) {
                if(item.equals(codList)){
                    listaComNao.remove(item);
                    break;
                }
            }
        }
    }

    private void inicializarComponentes() {

        obterResultado = (Button) findViewById(R.id.obterResultadoID);

        //region INICIALIZA BT SELECIONA
        btSelecionaCK1 = (Button) findViewById(R.id.btSelecionaCk1);
        btSelecionaCK2 = (Button) findViewById(R.id.btSelecionaCk2);
        btSelecionaCK3 = (Button) findViewById(R.id.btSelecionaCk3);
        btSelecionaCK4 = (Button) findViewById(R.id.btSelecionaCk4);
        btSelecionaCK5 = (Button) findViewById(R.id.btSelecionaCk5);
        btSelecionaCK6 = (Button) findViewById(R.id.btSelecionaCk6);
        btSelecionaCK7 = (Button) findViewById(R.id.btSelecionaCk7);
        btSelecionaCK8 = (Button) findViewById(R.id.btSelecionaCk8);
        btSelecionaCK9 = (Button) findViewById(R.id.btSelecionaCk9);
        btSelecionaCK10 = (Button) findViewById(R.id.btSelecionaCk10);
        btSelecionaCK11 = (Button) findViewById(R.id.btSelecionaCk11);
        btSelecionaCK12 = (Button) findViewById(R.id.btSelecionaCk12);
        btSelecionaCK13 = (Button) findViewById(R.id.btSelecionaCk13);
        btSelecionaCK14 = (Button) findViewById(R.id.btSelecionaCk14);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 1
        checkBox_1_1     = (CheckBox) findViewById(R.id.checkBox);
        checkBox_1_2     = (CheckBox) findViewById(R.id.checkBox2);
        checkBox_1_3     = (CheckBox) findViewById(R.id.checkBox3);
        checkBox_1_1_nao = (CheckBox) findViewById(R.id.checkBox1_1_nao);
        checkBox_1_2_nao = (CheckBox) findViewById(R.id.checkBox1_2_nao);
        checkBox_1_3_nao = (CheckBox) findViewById(R.id.checkBox1_3_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 2
        checkBox_2_1     = (CheckBox) findViewById(R.id.checkBox4);
        checkBox_2_2     = (CheckBox) findViewById(R.id.checkBox5);
        checkBox_2_3     = (CheckBox) findViewById(R.id.checkBox6);
        checkBox_2_1_nao = (CheckBox) findViewById(R.id.checkBox2_1_nao);
        checkBox_2_2_nao = (CheckBox) findViewById(R.id.checkBox2_2_nao);
        checkBox_2_3_nao = (CheckBox) findViewById(R.id.checkBox2_3_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 3
        checkBox_3_1     = (CheckBox) findViewById(R.id.checkBox7);
        checkBox_3_2     = (CheckBox) findViewById(R.id.checkBox8);
        checkBox_3_3     = (CheckBox) findViewById(R.id.checkBox9);
        checkBox_3_4     = (CheckBox) findViewById(R.id.checkBox10);
        checkBox_3_5     = (CheckBox) findViewById(R.id.checkBox11);
        checkBox_3_6     = (CheckBox) findViewById(R.id.checkBox12);
        checkBox_3_7     = (CheckBox) findViewById(R.id.checkBox13);
        checkBox_3_8     = (CheckBox) findViewById(R.id.checkBox14);
        checkBox_3_1_nao = (CheckBox) findViewById(R.id.checkBox3_1_nao);
        checkBox_3_2_nao = (CheckBox) findViewById(R.id.checkBox3_2_nao);
        checkBox_3_3_nao = (CheckBox) findViewById(R.id.checkBox3_3_nao);
        checkBox_3_4_nao = (CheckBox) findViewById(R.id.checkBox3_4_nao);
        checkBox_3_5_nao = (CheckBox) findViewById(R.id.checkBox3_5_nao);
        checkBox_3_6_nao = (CheckBox) findViewById(R.id.checkBox3_6_nao);
        checkBox_3_7_nao = (CheckBox) findViewById(R.id.checkBox3_7_nao);
        checkBox_3_8_nao = (CheckBox) findViewById(R.id.checkBox3_8_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 4
        checkBox_4_1     = (CheckBox) findViewById(R.id.checkBox15);
        checkBox_4_2     = (CheckBox) findViewById(R.id.checkBox16);
        checkBox_4_3     = (CheckBox) findViewById(R.id.checkBox17);
        checkBox_4_4     = (CheckBox) findViewById(R.id.checkBox18);
        checkBox_4_5     = (CheckBox) findViewById(R.id.checkBox19);
        checkBox_4_6     = (CheckBox) findViewById(R.id.checkBox20);
        checkBox_4_7     = (CheckBox) findViewById(R.id.checkBox21);
        checkBox_4_8     = (CheckBox) findViewById(R.id.checkBox22);
        checkBox_4_1_nao = (CheckBox) findViewById(R.id.checkBox4_1_nao);
        checkBox_4_2_nao = (CheckBox) findViewById(R.id.checkBox4_2_nao);
        checkBox_4_3_nao = (CheckBox) findViewById(R.id.checkBox4_3_nao);
        checkBox_4_4_nao = (CheckBox) findViewById(R.id.checkBox4_4_nao);
        checkBox_4_5_nao = (CheckBox) findViewById(R.id.checkBox4_5_nao);
        checkBox_4_6_nao = (CheckBox) findViewById(R.id.checkBox4_6_nao);
        checkBox_4_7_nao = (CheckBox) findViewById(R.id.checkBox4_7_nao);
        checkBox_4_8_nao = (CheckBox) findViewById(R.id.checkBox4_8_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 5
        checkBox_5_1     = (CheckBox) findViewById(R.id.checkBox23);
        checkBox_5_2     = (CheckBox) findViewById(R.id.checkBox24);
        checkBox_5_3     = (CheckBox) findViewById(R.id.checkBox25);
        checkBox_5_1_nao = (CheckBox) findViewById(R.id.checkBox5_1_nao);
        checkBox_5_2_nao = (CheckBox) findViewById(R.id.checkBox5_2_nao);
        checkBox_5_3_nao = (CheckBox) findViewById(R.id.checkBox5_3_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 6
        checkBox_6_1     = (CheckBox) findViewById(R.id.checkBox26);
        checkBox_6_2     = (CheckBox) findViewById(R.id.checkBox27);
        checkBox_6_3     = (CheckBox) findViewById(R.id.checkBox28);
        checkBox_6_4     = (CheckBox) findViewById(R.id.checkBox29);
        checkBox_6_5     = (CheckBox) findViewById(R.id.checkBox30);
        checkBox_6_6     = (CheckBox) findViewById(R.id.checkBox31);
        checkBox_6_7     = (CheckBox) findViewById(R.id.checkBox32);
        checkBox_6_1_nao = (CheckBox) findViewById(R.id.checkBox6_1_nao);
        checkBox_6_2_nao = (CheckBox) findViewById(R.id.checkBox6_2_nao);
        checkBox_6_3_nao = (CheckBox) findViewById(R.id.checkBox6_3_nao);
        checkBox_6_4_nao = (CheckBox) findViewById(R.id.checkBox6_4_nao);
        checkBox_6_5_nao = (CheckBox) findViewById(R.id.checkBox6_5_nao);
        checkBox_6_6_nao = (CheckBox) findViewById(R.id.checkBox6_6_nao);
        checkBox_6_7_nao = (CheckBox) findViewById(R.id.checkBox6_7_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 7
        checkBox_7_1     = (CheckBox) findViewById(R.id.checkBox33);
        checkBox_7_2     = (CheckBox) findViewById(R.id.checkBox34);
        checkBox_7_1_nao = (CheckBox) findViewById(R.id.checkBox7_1_nao);
        checkBox_7_2_nao = (CheckBox) findViewById(R.id.checkBox7_2_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 8
        checkBox_8_1     = (CheckBox) findViewById(R.id.checkBox35);
        checkBox_8_2     = (CheckBox) findViewById(R.id.checkBox36);
        checkBox_8_3     = (CheckBox) findViewById(R.id.checkBox37);
        checkBox_8_1_nao = (CheckBox) findViewById(R.id.checkBox8_1_nao);
        checkBox_8_2_nao = (CheckBox) findViewById(R.id.checkBox8_2_nao);
        checkBox_8_3_nao = (CheckBox) findViewById(R.id.checkBox8_3_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 9
        checkBox_9_1     = (CheckBox) findViewById(R.id.checkBox38);
        checkBox_9_2     = (CheckBox) findViewById(R.id.checkBox39);
        checkBox_9_1_nao = (CheckBox) findViewById(R.id.checkBox9_1_nao);
        checkBox_9_2_nao = (CheckBox) findViewById(R.id.checkBox9_2_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 10
        checkBox_10_1      = (CheckBox) findViewById(R.id.checkBox40);
        checkBox_10_2      = (CheckBox) findViewById(R.id.checkBox41);
        checkBox_10_3      = (CheckBox) findViewById(R.id.checkBox42);
        checkBox_10_4      = (CheckBox) findViewById(R.id.checkBox43);
        checkBox_10_5      = (CheckBox) findViewById(R.id.checkBox44);
        checkBox_10_6      = (CheckBox) findViewById(R.id.checkBox45);
        checkBox_10_7      = (CheckBox) findViewById(R.id.checkBox46);
        checkBox_10_8      = (CheckBox) findViewById(R.id.checkBox47);
        checkBox_10_9      = (CheckBox) findViewById(R.id.checkBox48);
        checkBox_10_10     = (CheckBox) findViewById(R.id.checkBox49);
        checkBox_10_11     = (CheckBox) findViewById(R.id.checkBox50);
        checkBox_10_12     = (CheckBox) findViewById(R.id.checkBox51);
        checkBox_10_13     = (CheckBox) findViewById(R.id.checkBox52);
        checkBox_10_14     = (CheckBox) findViewById(R.id.checkBox53);
        checkBox_10_15     = (CheckBox) findViewById(R.id.checkBox54);
        checkBox_10_1_nao  = (CheckBox) findViewById(R.id.checkBox10_1_nao);
        checkBox_10_2_nao  = (CheckBox) findViewById(R.id.checkBox10_2_nao);
        checkBox_10_3_nao  = (CheckBox) findViewById(R.id.checkBox10_3_nao);
        checkBox_10_4_nao  = (CheckBox) findViewById(R.id.checkBox10_4_nao);
        checkBox_10_5_nao  = (CheckBox) findViewById(R.id.checkBox10_5_nao);
        checkBox_10_6_nao  = (CheckBox) findViewById(R.id.checkBox10_6_nao);
        checkBox_10_7_nao  = (CheckBox) findViewById(R.id.checkBox10_7_nao);
        checkBox_10_8_nao  = (CheckBox) findViewById(R.id.checkBox10_8_nao);
        checkBox_10_9_nao  = (CheckBox) findViewById(R.id.checkBox10_9_nao);
        checkBox_10_10_nao = (CheckBox) findViewById(R.id.checkBox10_10_nao);
        checkBox_10_11_nao = (CheckBox) findViewById(R.id.checkBox10_11_nao);
        checkBox_10_12_nao = (CheckBox) findViewById(R.id.checkBox10_12_nao);
        checkBox_10_13_nao = (CheckBox) findViewById(R.id.checkBox10_13_nao);
        checkBox_10_14_nao = (CheckBox) findViewById(R.id.checkBox10_14_nao);
        checkBox_10_15_nao = (CheckBox) findViewById(R.id.checkBox10_15_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 11
        checkBox_11_1 = (CheckBox) findViewById(R.id.checkBox55);
        checkBox_11_2 = (CheckBox) findViewById(R.id.checkBox56);
        checkBox_11_3 = (CheckBox) findViewById(R.id.checkBox57);
        checkBox_11_4 = (CheckBox) findViewById(R.id.checkBox58);
        checkBox_11_5 = (CheckBox) findViewById(R.id.checkBox59);
        checkBox_11_6 = (CheckBox) findViewById(R.id.checkBox60);
        checkBox_11_1_nao = (CheckBox) findViewById(R.id.checkBox11_1_nao);
        checkBox_11_2_nao = (CheckBox) findViewById(R.id.checkBox11_2_nao);
        checkBox_11_3_nao = (CheckBox) findViewById(R.id.checkBox11_3_nao);
        checkBox_11_4_nao = (CheckBox) findViewById(R.id.checkBox11_4_nao);
        checkBox_11_5_nao = (CheckBox) findViewById(R.id.checkBox11_5_nao);
        checkBox_11_6_nao = (CheckBox) findViewById(R.id.checkBox11_6_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 12
        checkBox_12_1     = (CheckBox) findViewById(R.id.checkBox61);
        checkBox_12_2     = (CheckBox) findViewById(R.id.checkBox62);
        checkBox_12_3     = (CheckBox) findViewById(R.id.checkBox63);
        checkBox_12_4     = (CheckBox) findViewById(R.id.checkBox64);
        checkBox_12_5     = (CheckBox) findViewById(R.id.checkBox65);
        checkBox_12_1_nao = (CheckBox) findViewById(R.id.checkBox12_1_nao);
        checkBox_12_2_nao = (CheckBox) findViewById(R.id.checkBox12_2_nao);
        checkBox_12_3_nao = (CheckBox) findViewById(R.id.checkBox12_3_nao);
        checkBox_12_4_nao = (CheckBox) findViewById(R.id.checkBox12_4_nao);
        checkBox_12_5_nao = (CheckBox) findViewById(R.id.checkBox12_5_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 13
        checkBox_13_1     = (CheckBox) findViewById(R.id.checkBox66);
        checkBox_13_2     = (CheckBox) findViewById(R.id.checkBox67);
        checkBox_13_3     = (CheckBox) findViewById(R.id.checkBox68);
        checkBox_13_4     = (CheckBox) findViewById(R.id.checkBox69);
        checkBox_13_1_nao = (CheckBox) findViewById(R.id.checkBox13_1_nao);
        checkBox_13_2_nao = (CheckBox) findViewById(R.id.checkBox13_2_nao);
        checkBox_13_3_nao = (CheckBox) findViewById(R.id.checkBox13_3_nao);
        checkBox_13_4_nao = (CheckBox) findViewById(R.id.checkBox13_4_nao);
        //endregion

        //region INICIALIZA CHECKBOX LISTA 14
        checkBox_14_1 = (CheckBox) findViewById(R.id.checkBox70);
        checkBox_14_2 = (CheckBox) findViewById(R.id.checkBox71);
        checkBox_14_1_nao = (CheckBox) findViewById(R.id.checkBox14_1_nao);
        checkBox_14_2_nao = (CheckBox) findViewById(R.id.checkBox14_2_nao);
        //endregion

        //region INICIALIZA TEXT
        editTextCIPA = (EditText) findViewById(R.id.editTextCIPA);
        editTextData = (EditText) findViewById(R.id.editTextData);
        editTextResponsavel = (EditText) findViewById(R.id.editTextResponsavel);
        //endregion

        //region INICIALIZA BT CAMERA
        btCamera_1_1 = (ImageView) findViewById(R.id.btCamera1_1);
        btCamera_1_2 = (ImageView) findViewById(R.id.btCamera1_2);
        btCamera_1_3 = (ImageView) findViewById(R.id.btCamera1_3);

        btCamera_2_1 = (ImageView) findViewById(R.id.btCamera2_1);
        btCamera_2_2 = (ImageView) findViewById(R.id.btCamera2_2);
        btCamera_2_3 = (ImageView) findViewById(R.id.btCamera2_3);

        btCamera_3_1 = (ImageView) findViewById(R.id.btCamera3_1);
        btCamera_3_2 = (ImageView) findViewById(R.id.btCamera3_2);
        btCamera_3_3 = (ImageView) findViewById(R.id.btCamera3_3);
        btCamera_3_4 = (ImageView) findViewById(R.id.btCamera3_4);
        btCamera_3_5 = (ImageView) findViewById(R.id.btCamera3_5);
        btCamera_3_6 = (ImageView) findViewById(R.id.btCamera3_6);
        btCamera_3_7 = (ImageView) findViewById(R.id.btCamera3_7);
        btCamera_3_8 = (ImageView) findViewById(R.id.btCamera3_8);

        btCamera_4_1 = (ImageView) findViewById(R.id.btCamera4_1);
        btCamera_4_2 = (ImageView) findViewById(R.id.btCamera4_2);
        btCamera_4_3 = (ImageView) findViewById(R.id.btCamera4_3);
        btCamera_4_4 = (ImageView) findViewById(R.id.btCamera4_4);
        btCamera_4_5 = (ImageView) findViewById(R.id.btCamera4_5);
        btCamera_4_6 = (ImageView) findViewById(R.id.btCamera4_6);
        btCamera_4_7 = (ImageView) findViewById(R.id.btCamera4_7);
        btCamera_4_8 = (ImageView) findViewById(R.id.btCamera4_8);

        btCamera_5_1 = (ImageView) findViewById(R.id.btCamera5_1);
        btCamera_5_2 = (ImageView) findViewById(R.id.btCamera5_2);
        btCamera_5_3 = (ImageView) findViewById(R.id.btCamera5_3);

        btCamera_6_1 = (ImageView) findViewById(R.id.btCamera6_1);
        btCamera_6_2 = (ImageView) findViewById(R.id.btCamera6_2);
        btCamera_6_3 = (ImageView) findViewById(R.id.btCamera6_3);
        btCamera_6_4 = (ImageView) findViewById(R.id.btCamera6_4);
        btCamera_6_5 = (ImageView) findViewById(R.id.btCamera6_5);
        btCamera_6_6 = (ImageView) findViewById(R.id.btCamera6_6);
        btCamera_6_7 = (ImageView) findViewById(R.id.btCamera6_7);

        btCamera_7_1 = (ImageView) findViewById(R.id.btCamera7_1);
        btCamera_7_2 = (ImageView) findViewById(R.id.btCamera7_2);

        btCamera_8_1 = (ImageView) findViewById(R.id.btCamera8_1);
        btCamera_8_2 = (ImageView) findViewById(R.id.btCamera8_2);
        btCamera_8_3 = (ImageView) findViewById(R.id.btCamera8_3);

        btCamera_9_1 = (ImageView) findViewById(R.id.btCamera9_1);
        btCamera_9_2 = (ImageView) findViewById(R.id.btCamera9_2);

        btCamera_10_1 = (ImageView) findViewById(R.id.btCamera10_1);
        btCamera_10_2 = (ImageView) findViewById(R.id.btCamera10_2);
        btCamera_10_3 = (ImageView) findViewById(R.id.btCamera10_3);
        btCamera_10_4 = (ImageView) findViewById(R.id.btCamera10_4);
        btCamera_10_5 = (ImageView) findViewById(R.id.btCamera10_5);
        btCamera_10_6 = (ImageView) findViewById(R.id.btCamera10_6);
        btCamera_10_7 = (ImageView) findViewById(R.id.btCamera10_7);
        btCamera_10_8 = (ImageView) findViewById(R.id.btCamera10_8);
        btCamera_10_9 = (ImageView) findViewById(R.id.btCamera10_9);
        btCamera_10_10 = (ImageView) findViewById(R.id.btCamera10_10);
        btCamera_10_11 = (ImageView) findViewById(R.id.btCamera10_11);
        btCamera_10_12 = (ImageView) findViewById(R.id.btCamera10_12);
        btCamera_10_13 = (ImageView) findViewById(R.id.btCamera10_13);
        btCamera_10_14 = (ImageView) findViewById(R.id.btCamera10_14);
        btCamera_10_15 = (ImageView) findViewById(R.id.btCamera10_15);

        btCamera_11_1 = (ImageView) findViewById(R.id.btCamera11_1);
        btCamera_11_2 = (ImageView) findViewById(R.id.btCamera11_2);
        btCamera_11_3 = (ImageView) findViewById(R.id.btCamera11_3);
        btCamera_11_4 = (ImageView) findViewById(R.id.btCamera11_4);
        btCamera_11_5 = (ImageView) findViewById(R.id.btCamera11_5);
        btCamera_11_6 = (ImageView) findViewById(R.id.btCamera11_6);

        btCamera_12_1 = (ImageView) findViewById(R.id.btCamera12_1);
        btCamera_12_2 = (ImageView) findViewById(R.id.btCamera12_2);
        btCamera_12_3 = (ImageView) findViewById(R.id.btCamera12_3);
        btCamera_12_4 = (ImageView) findViewById(R.id.btCamera12_4);
        btCamera_12_5 = (ImageView) findViewById(R.id.btCamera12_5);

        btCamera_13_1 = (ImageView) findViewById(R.id.btCamera13_1);
        btCamera_13_2 = (ImageView) findViewById(R.id.btCamera13_2);
        btCamera_13_3 = (ImageView) findViewById(R.id.btCamera13_3);
        btCamera_13_4 = (ImageView) findViewById(R.id.btCamera13_4);

        btCamera_14_1 = (ImageView) findViewById(R.id.btCamera14_1);
        btCamera_14_2 = (ImageView) findViewById(R.id.btCamera14_2);
        //endregion
    }

    //region METODOS CALULOS RESULTADOS CHECKLIST
    private Double resultadochecklist1() {
        int total = 0;

        if(checkBox_1_1.isChecked())
        {
            total++;
        }
        if(checkBox_1_2.isChecked())
        {
            total++;
        }
        if(checkBox_1_3.isChecked())
        {
            total++;
        }

        return total/3D;
    }

    private Double resultadochecklist2() {
        int total = 0;

        if(checkBox_2_1.isChecked())
        {
            total++;
        }
        if(checkBox_2_2.isChecked())
        {
            total++;
        }
        if(checkBox_2_3.isChecked())
        {
            total++;
        }

        return total/3D;
    }

    private Double resultadochecklist3() {
        int total = 0;

        if(checkBox_3_1.isChecked())
        {
            total++;
        }
        if(checkBox_3_2.isChecked())
        {
            total++;
        }
        if(checkBox_3_3.isChecked())
        {
            total++;
        }

        if(checkBox_3_4.isChecked())
        {
            total++;
        }
        if(checkBox_3_5.isChecked())
        {
            total++;
        }
        if(checkBox_3_6.isChecked())
        {
            total++;
        }

        if(checkBox_3_7.isChecked())
        {
            total++;
        }

        if(checkBox_3_8.isChecked())
        {
            total++;
        }

        return total/8D;
    }

    private Double resultadochecklist4() {
        int total = 0;

        if(checkBox_4_1.isChecked())
        {
            total++;
        }
        if(checkBox_4_2.isChecked())
        {
            total++;
        }
        if(checkBox_4_3.isChecked())
        {
            total++;
        }
        if(checkBox_4_4.isChecked())
        {
            total++;
        }
        if(checkBox_4_5.isChecked())
        {
            total++;
        }
        if(checkBox_4_6.isChecked())
        {
            total++;
        }
        if(checkBox_4_7.isChecked())
        {
            total++;
        }
        if(checkBox_4_8.isChecked())
        {
            total++;
        }

        return total/8D;
    }

    private Double resultadochecklist5() {
        int total = 0;

        if(checkBox_5_1.isChecked())
        {
            total++;
        }
        if(checkBox_5_2.isChecked())
        {
            total++;
        }
        if(checkBox_5_3.isChecked())
        {
            total++;
        }

        return total/3D;
    }

    private Double resultadochecklist6() {
        int total = 0;

        if(checkBox_6_1.isChecked())
        {
            total++;
        }
        if(checkBox_6_2.isChecked())
        {
            total++;
        }
        if(checkBox_6_3.isChecked())
        {
            total++;
        }
        if(checkBox_6_4.isChecked())
        {
            total++;
        }
        if(checkBox_6_5.isChecked())
        {
            total++;
        }
        if(checkBox_6_6.isChecked())
        {
            total++;
        }
        if(checkBox_6_7.isChecked())
        {
            total++;
        }

        return total/7D;
    }

    private Double resultadochecklist7() {
        int total = 0;

        if(checkBox_7_1.isChecked())
        {
            total++;
        }
        if(checkBox_7_2.isChecked())
        {
            total++;
        }

        return total/2D;
    }

    private Double resultadochecklist8() {
        int total = 0;

        if(checkBox_8_1.isChecked())
        {
            total++;
        }
        if(checkBox_8_2.isChecked())
        {
            total++;
        }
        if(checkBox_8_3.isChecked())
        {
            total++;
        }

        return total/3D;
    }

    private Double resultadochecklist9() {
        int total = 0;

        if(checkBox_9_1.isChecked())
        {
            total++;
        }
        if(checkBox_9_2.isChecked())
        {
            total++;
        }

        return total/2D;
    }

    private Double resultadochecklist10() {
        int total = 0;

        if(checkBox_10_1.isChecked())
        {
            total++;
        }
        if(checkBox_10_2.isChecked())
        {
            total++;
        }
        if(checkBox_10_3.isChecked())
        {
            total++;
        }
        if(checkBox_10_4.isChecked())
        {
            total++;
        }
        if(checkBox_10_5.isChecked())
        {
            total++;
        }
        if(checkBox_10_6.isChecked())
        {
            total++;
        }

        if(checkBox_10_7.isChecked())
        {
            total++;
        }
        if(checkBox_10_8.isChecked())
        {
            total++;
        }
        if(checkBox_10_9.isChecked())
        {
            total++;
        }
        if(checkBox_10_10.isChecked())
        {
            total++;
        }
        if(checkBox_10_11.isChecked())
        {
            total++;
        }
        if(checkBox_10_12.isChecked())
        {
            total++;
        }
        if(checkBox_10_13.isChecked())
        {
            total++;
        }
        if(checkBox_10_14.isChecked())
        {
            total++;
        }

        if(checkBox_10_15.isChecked())
        {
            total++;
        }

        return total/15D;
    }

    private Double resultadochecklist11() {
        int total = 0;

        if(checkBox_11_1.isChecked())
        {
            total++;
        }
        if(checkBox_11_2.isChecked())
        {
            total++;
        }
        if(checkBox_11_3.isChecked())
        {
            total++;
        }
        if(checkBox_11_4.isChecked())
        {
            total++;
        }
        if(checkBox_11_5.isChecked())
        {
            total++;
        }
        if(checkBox_11_6.isChecked())
        {
            total++;
        }

        return total/6D;
    }

    private Double resultadochecklist12() {
        int total = 0;

        if(checkBox_12_1.isChecked())
        {
            total++;
        }
        if(checkBox_12_2.isChecked())
        {
            total++;
        }
        if(checkBox_12_3.isChecked())
        {
            total++;
        }
        if(checkBox_12_4.isChecked())
        {
            total++;
        }
        if(checkBox_12_5.isChecked())
        {
            total++;
        }

        return total/5D;
    }

    private Double resultadochecklist13() {
        int total = 0;

        if(checkBox_13_1.isChecked())
        {
            total++;
        }
        if(checkBox_13_2.isChecked())
        {
            total++;
        }
        if(checkBox_13_3.isChecked())
        {
            total++;
        }
        if(checkBox_13_4.isChecked())
        {
            total++;
        }

        return total/4D;
    }

    private Double resultadochecklist14() {
        int total = 0;

        if(checkBox_14_1.isChecked())
        {
            total++;
        }
        if(checkBox_14_2.isChecked())
        {
            total++;
        }

        return total/2D;
    }
    //endregion
}
