package com.unilever.inspecoes.unileverinspecoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class S03Activity extends AppCompatActivity {

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

    CheckBox checkBox_1_1;
    CheckBox checkBox_1_2;
    CheckBox checkBox_1_3;

    CheckBox checkBox_2_1;
    CheckBox checkBox_2_2;
    CheckBox checkBox_2_3;

    CheckBox checkBox_3_1;
    CheckBox checkBox_3_2;
    CheckBox checkBox_3_3;
    CheckBox checkBox_3_4;
    CheckBox checkBox_3_5;
    CheckBox checkBox_3_6;
    CheckBox checkBox_3_7;
    CheckBox checkBox_3_8;

    CheckBox checkBox_4_1;
    CheckBox checkBox_4_2;
    CheckBox checkBox_4_3;
    CheckBox checkBox_4_4;
    CheckBox checkBox_4_5;
    CheckBox checkBox_4_6;
    CheckBox checkBox_4_7;
    CheckBox checkBox_4_8;

    CheckBox checkBox_5_1;
    CheckBox checkBox_5_2;
    CheckBox checkBox_5_3;

    CheckBox checkBox_6_1;
    CheckBox checkBox_6_2;
    CheckBox checkBox_6_3;
    CheckBox checkBox_6_4;
    CheckBox checkBox_6_5;
    CheckBox checkBox_6_6;
    CheckBox checkBox_6_7;

    CheckBox checkBox_7_1;
    CheckBox checkBox_7_2;

    CheckBox checkBox_8_1;
    CheckBox checkBox_8_2;
    CheckBox checkBox_8_3;

    CheckBox checkBox_9_1;
    CheckBox checkBox_9_2;

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

    CheckBox checkBox_11_1;
    CheckBox checkBox_11_2;
    CheckBox checkBox_11_3;
    CheckBox checkBox_11_4;
    CheckBox checkBox_11_5;
    CheckBox checkBox_11_6;

    CheckBox checkBox_12_1;
    CheckBox checkBox_12_2;
    CheckBox checkBox_12_3;
    CheckBox checkBox_12_4;
    CheckBox checkBox_12_5;

    CheckBox checkBox_13_1;
    CheckBox checkBox_13_2;
    CheckBox checkBox_13_3;
    CheckBox checkBox_13_4;

    CheckBox checkBox_14_1;
    CheckBox checkBox_14_2;

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

    EditText editTextResponsavel;
    EditText editTextData;
    EditText editTextCIPA;

    ImageView btCamera_1_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s03);

        inicializarComponentes();

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

        //BT CAMERA 1_1
        btCamera_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(S03Activity.this, DetalheFotoActivity.class);
                in.putExtra("btCamera_1_1", "1_1");
                startActivity(in);
            }
        });

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

                ArrayList<String> arrayValidacao = new ArrayList<String>();
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
                    String textoValidacao = "";
                    for (String msg : arrayValidacao)
                    {
                        textoValidacao = textoValidacao + msg;
                    }
                    Toast.makeText(S03Activity.this, textoValidacao, Toast.LENGTH_LONG).show();
                }
                else
                {
                    in.putExtra("resultado", resultadoTotal);
                    startActivity(in);
                }
            }
        });

    }

    private void inicializarComponentes() {
        obterResultado = (Button) findViewById(R.id.obterResultadoID);
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

        checkBox_1_1 = (CheckBox) findViewById(R.id.checkBox);
        checkBox_1_2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox_1_3 = (CheckBox) findViewById(R.id.checkBox3);

        checkBox_2_1 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox_2_2 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox_2_3 = (CheckBox) findViewById(R.id.checkBox6);

        checkBox_3_1 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox_3_2 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox_3_3 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox_3_4 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox_3_5 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox_3_6 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox_3_7 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox_3_8 = (CheckBox) findViewById(R.id.checkBox14);

        checkBox_4_1 = (CheckBox) findViewById(R.id.checkBox15);
        checkBox_4_2 = (CheckBox) findViewById(R.id.checkBox16);
        checkBox_4_3 = (CheckBox) findViewById(R.id.checkBox17);
        checkBox_4_4 = (CheckBox) findViewById(R.id.checkBox18);
        checkBox_4_5 = (CheckBox) findViewById(R.id.checkBox19);
        checkBox_4_6 = (CheckBox) findViewById(R.id.checkBox20);
        checkBox_4_7 = (CheckBox) findViewById(R.id.checkBox21);
        checkBox_4_8 = (CheckBox) findViewById(R.id.checkBox22);

        checkBox_5_1 = (CheckBox) findViewById(R.id.checkBox23);
        checkBox_5_2 = (CheckBox) findViewById(R.id.checkBox24);
        checkBox_5_3 = (CheckBox) findViewById(R.id.checkBox25);

        checkBox_6_1 = (CheckBox) findViewById(R.id.checkBox26);
        checkBox_6_2 = (CheckBox) findViewById(R.id.checkBox27);
        checkBox_6_3 = (CheckBox) findViewById(R.id.checkBox28);
        checkBox_6_4 = (CheckBox) findViewById(R.id.checkBox29);
        checkBox_6_5 = (CheckBox) findViewById(R.id.checkBox30);
        checkBox_6_6 = (CheckBox) findViewById(R.id.checkBox31);
        checkBox_6_7 = (CheckBox) findViewById(R.id.checkBox32);

        checkBox_7_1 = (CheckBox) findViewById(R.id.checkBox33);
        checkBox_7_2 = (CheckBox) findViewById(R.id.checkBox34);

        checkBox_8_1 = (CheckBox) findViewById(R.id.checkBox35);
        checkBox_8_2 = (CheckBox) findViewById(R.id.checkBox36);
        checkBox_8_3 = (CheckBox) findViewById(R.id.checkBox37);

        checkBox_9_1 = (CheckBox) findViewById(R.id.checkBox38);
        checkBox_9_2 = (CheckBox) findViewById(R.id.checkBox39);

        checkBox_10_1 = (CheckBox) findViewById(R.id.checkBox40);
        checkBox_10_2 = (CheckBox) findViewById(R.id.checkBox41);
        checkBox_10_3 = (CheckBox) findViewById(R.id.checkBox42);
        checkBox_10_4 = (CheckBox) findViewById(R.id.checkBox43);
        checkBox_10_5 = (CheckBox) findViewById(R.id.checkBox44);
        checkBox_10_6 = (CheckBox) findViewById(R.id.checkBox45);
        checkBox_10_7 = (CheckBox) findViewById(R.id.checkBox46);
        checkBox_10_8 = (CheckBox) findViewById(R.id.checkBox47);
        checkBox_10_9 = (CheckBox) findViewById(R.id.checkBox48);
        checkBox_10_10 = (CheckBox) findViewById(R.id.checkBox49);
        checkBox_10_11 = (CheckBox) findViewById(R.id.checkBox50);
        checkBox_10_12 = (CheckBox) findViewById(R.id.checkBox51);
        checkBox_10_13 = (CheckBox) findViewById(R.id.checkBox52);
        checkBox_10_14 = (CheckBox) findViewById(R.id.checkBox53);
        checkBox_10_15 = (CheckBox) findViewById(R.id.checkBox54);

        checkBox_11_1 = (CheckBox) findViewById(R.id.checkBox55);
        checkBox_11_2 = (CheckBox) findViewById(R.id.checkBox56);
        checkBox_11_3 = (CheckBox) findViewById(R.id.checkBox57);
        checkBox_11_4 = (CheckBox) findViewById(R.id.checkBox58);
        checkBox_11_5 = (CheckBox) findViewById(R.id.checkBox59);
        checkBox_11_6 = (CheckBox) findViewById(R.id.checkBox60);

        checkBox_12_1 = (CheckBox) findViewById(R.id.checkBox61);
        checkBox_12_2 = (CheckBox) findViewById(R.id.checkBox62);
        checkBox_12_3 = (CheckBox) findViewById(R.id.checkBox63);
        checkBox_12_4 = (CheckBox) findViewById(R.id.checkBox64);
        checkBox_12_5 = (CheckBox) findViewById(R.id.checkBox65);


        checkBox_13_1 = (CheckBox) findViewById(R.id.checkBox66);
        checkBox_13_2 = (CheckBox) findViewById(R.id.checkBox67);
        checkBox_13_3 = (CheckBox) findViewById(R.id.checkBox68);
        checkBox_13_4 = (CheckBox) findViewById(R.id.checkBox69);

        checkBox_14_1 = (CheckBox) findViewById(R.id.checkBox70);
        checkBox_14_2 = (CheckBox) findViewById(R.id.checkBox71);

        editTextCIPA = (EditText) findViewById(R.id.editTextCIPA);
        editTextData = (EditText) findViewById(R.id.editTextData);
        editTextResponsavel = (EditText) findViewById(R.id.editTextResponsavel);

        btCamera_1_1 = (ImageView) findViewById(R.id.btCamera1_1);
    }

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

        Double porcentagem = total/3D;

        return porcentagem;
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

        Double porcentagem = total/3D;

        return porcentagem;
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

        Double porcentagem = total/8D;

        return porcentagem;
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

        Double porcentagem = total/8D;

        return porcentagem;
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

        Double porcentagem = total/3D;

        return porcentagem;
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

        Double porcentagem = total/7D;

        return porcentagem;
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

        Double porcentagem = total/2D;

        return porcentagem;
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

        Double porcentagem = total/3D;

        return porcentagem;
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

        Double porcentagem = total/2D;

        return porcentagem;
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

        Double porcentagem = total/15D;

        return porcentagem;
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

        Double porcentagem = total/6D;

        return porcentagem;
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

        Double porcentagem = total/5D;

        return porcentagem;
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

        Double porcentagem = total/4D;

        return porcentagem;
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

        Double porcentagem = total/2D;

        return porcentagem;
    }
}
