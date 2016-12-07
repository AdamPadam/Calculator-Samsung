package com.example.magik.calculator;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button exitButton, startButton, aboutButton;
    Context context1 = this;
    Context context2 = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exitButton = (Button) findViewById(R.id.Exit);
        startButton = (Button) findViewById(R.id.Start);
        aboutButton = (Button) findViewById(R.id.About);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(context1, Calc.class);
                startActivityForResult(intent1, 0);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(context2, About.class);
                startActivityForResult(intent2, 0);
            }
        });

    }
}
