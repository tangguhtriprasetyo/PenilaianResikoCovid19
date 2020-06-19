package com.example.aplikasicovid19rsbk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage3 extends AppCompatActivity {

    private Button btn_mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page3);

        getSupportActionBar().hide();

        btn_mulai =findViewById(R.id.btn_mulai);

        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotonextlandingpage = new Intent(LandingPage3.this,MainActivity.class);
                startActivity(gotonextlandingpage);
                finish();
            }
        });
    }
}