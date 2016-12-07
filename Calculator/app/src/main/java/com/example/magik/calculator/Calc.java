package com.example.magik.calculator;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.NaN;

public class Calc extends Activity {

    public String tablo, op;
    public boolean b;
    public Button[] ButtonNumbers = new Button[10];
    public Button ButtonPoint, ButtonPlus, ButtonMinus, ButtonDel, ButtonUmn, ButtonCos, ButtonSin, ButtonSqrt, ButtonPow, ButtonPlusMinus, ButtonPro, ButtonEqual, ButtonAc, ButtonDelite, ButtonExit;
    public Context context = this;
    public TextView textViewNum1, textViewEv, textViewNum2;
    public float num1 = 0, num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        textViewNum1 = (TextView) findViewById(R.id.Num1);
        textViewEv = (TextView) findViewById(R.id.Ev);
        textViewNum2 = (TextView) findViewById(R.id.Num2);

        ButtonNumbers[0] = (Button) findViewById(R.id.n0);
        ButtonNumbers[1] = (Button) findViewById(R.id.n1);
        ButtonNumbers[2] = (Button) findViewById(R.id.n2);
        ButtonNumbers[3] = (Button) findViewById(R.id.n3);
        ButtonNumbers[4] = (Button) findViewById(R.id.n4);
        ButtonNumbers[5] = (Button) findViewById(R.id.n5);
        ButtonNumbers[6] = (Button) findViewById(R.id.n6);
        ButtonNumbers[7] = (Button) findViewById(R.id.n7);
        ButtonNumbers[8] = (Button) findViewById(R.id.n8);
        ButtonNumbers[9] = (Button) findViewById(R.id.n9);

        ButtonPoint = (Button) findViewById(R.id.point);
        ButtonPlus = (Button) findViewById(R.id.plus);
        ButtonMinus = (Button) findViewById(R.id.minus);
        ButtonDel = (Button) findViewById(R.id.del);
        ButtonUmn = (Button) findViewById(R.id.umn);
        ButtonCos = (Button) findViewById(R.id.cos);
        ButtonSin = (Button) findViewById(R.id.sin);
        ButtonSqrt = (Button) findViewById(R.id.sqrt);
        ButtonPow = (Button) findViewById(R.id.pow);
        ButtonPlusMinus = (Button) findViewById(R.id.plusMinus);
        ButtonPro = (Button) findViewById(R.id.pro);
        ButtonEqual = (Button) findViewById(R.id.equal);
        ButtonAc = (Button) findViewById(R.id.ac);
        ButtonDelite = (Button) findViewById(R.id.delite);
        ButtonExit = (Button) findViewById(R.id.exit);

        tablo = "";
        op = "";
        b = true;

        ButtonNumbers[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "0";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "1";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "2";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "3";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "4";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "5";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "6";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "7";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "8";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonNumbers[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += "9";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tablo += ".";
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
                textViewEv.setText(op);
            }
        });

        ButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonPlus.setTextColor(Color.GRAY);
                ButtonAc.setTextColor(Color.BLACK);
                ButtonMinus.setTextColor(Color.BLACK);
                ButtonUmn.setTextColor(Color.BLACK);
                ButtonDel.setTextColor(Color.BLACK);
                num1 = Float.parseFloat(tablo);
                op = "";
                op = "+";
                tablo = "";
                textViewEv.setText(op);
                textViewNum1.setText(Float.toString(num1));
                b = false;
                textViewNum2.setText(tablo);
            }
        });

        ButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonMinus.setTextColor(Color.GRAY);
                ButtonAc.setTextColor(Color.BLACK);
                ButtonPlus.setTextColor(Color.BLACK);
                ButtonUmn.setTextColor(Color.BLACK);
                ButtonDel.setTextColor(Color.BLACK);
                num1 = Float.parseFloat(tablo);
                op = "";
                op = "-";
                tablo = "";
                textViewEv.setText(op);
                textViewNum1.setText(Float.toString(num1));
                b = false;
                textViewNum2.setText(tablo);
            }
        });

        ButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonAc.setTextColor(Color.BLACK);
                ButtonPlus.setTextColor(Color.BLACK);
                ButtonMinus.setTextColor(Color.BLACK);
                ButtonUmn.setTextColor(Color.BLACK);
                ButtonDel.setTextColor(Color.BLACK);

                num2 = Float.parseFloat(tablo);
                float otvet = num1;

                if (op.equals("+")) {
                    otvet = num1 + num2;
                } else if (op.equals("-")) {
                    otvet = num1 - num2;
                } else if (op.equals("/")) {
                    otvet = num1 / num2;
                } else if (op.equals("*")) {
                    otvet = num1 * num2;
                }

                num1 = 0;
                num2 = 0;
                b = true;
                op = "";
                tablo = Float.toString(otvet);
                textViewNum1.setText(tablo);
                textViewNum2.setText("");
            }
        });

        ButtonPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(tablo);
                tablo = Float.toString(num * -1);
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
            }
        });

        ButtonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonAc.setTextColor(Color.BLACK);
                ButtonPlus.setTextColor(Color.BLACK);
                ButtonMinus.setTextColor(Color.BLACK);
                ButtonUmn.setTextColor(Color.BLACK);
                ButtonDel.setTextColor(Color.BLACK);

                num1 = 0;
                num2 = 0;
                op = "";
                b = true;
                tablo = "";
                textViewNum1.setText("0");
                textViewNum2.setText("0");
            }
        });

        ButtonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(tablo);
                tablo = Double.toString(Math.cos(num));
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }

            }
        });

        ButtonDelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] c = tablo.toCharArray();
                tablo = "";
                for (int i = 0; i < c.length - 1; i++) {
                    tablo += c[i];
                }
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
            }
        });

        ButtonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(tablo);
                tablo = Double.toString(Math.sin(num));
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
            }
        });

        ButtonUmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonUmn.setTextColor(Color.GRAY);
                ButtonAc.setTextColor(Color.BLACK);
                ButtonPlus.setTextColor(Color.BLACK);
                ButtonMinus.setTextColor(Color.BLACK);
                ButtonDel.setTextColor(Color.BLACK);
                num1 = Float.parseFloat(tablo);
                op = "";
                op = "*";
                tablo = "";
                textViewEv.setText(op);
                textViewNum1.setText(Float.toString(num1));
                b = false;
                textViewNum2.setText(tablo);
            }
        });

        ButtonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ButtonDel.setTextColor(Color.GRAY);
                ButtonAc.setTextColor(Color.BLACK);
                ButtonPlus.setTextColor(Color.BLACK);
                ButtonMinus.setTextColor(Color.BLACK);
                ButtonUmn.setTextColor(Color.BLACK);
                op = "";
                op = "/";
                tablo = "";
                textViewEv.setText(op);
                textViewNum1.setText(Float.toString(num1));
                b = false;
                textViewNum2.setText(tablo);
            }
        });

        ButtonPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(tablo);
                tablo = Float.toString(num / 100);
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
            }
        });

        ButtonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(tablo);
                tablo = Double.toString(Math.pow(num, 2));
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
            }
        });

        ButtonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(tablo);
                tablo = Double.toString(Math.sqrt(num));
                if (b) {
                    textViewNum1.setText(tablo);
                } else {
                    textViewNum2.setText(tablo);
                }
            }
        });

        ButtonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
