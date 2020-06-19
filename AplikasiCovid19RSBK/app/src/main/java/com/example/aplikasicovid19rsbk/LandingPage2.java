package com.example.aplikasicovid19rsbk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage2 extends AppCompatActivity {

    private Button btn_skip, btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page2);

        getSupportActionBar().hide();

        btn_next =findViewById(R.id.btn_next2);
        btn_skip=findViewById(R.id.btn_skip2);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotonextlandingpage = new Intent(LandingPage2.this,LandingPage3.class);
                startActivity(gotonextlandingpage);
                finish();
            }
        });
        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LandingPage2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}