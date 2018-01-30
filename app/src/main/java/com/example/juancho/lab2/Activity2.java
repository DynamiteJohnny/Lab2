package com.example.juancho.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        configureBackButton();
        changeText();
    }

    private void configureBackButton() {
        Button back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, MainActivity.class));
            }
        });
    }

    private void changeText() {
        Button buttonTxt =  (Button) findViewById(R.id.button_ct);
        buttonTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView mytextView = (TextView) findViewById(R.id.mytextView);
                mytextView.setText("Great power comes with great resposability");
            }
        });
    }



}

