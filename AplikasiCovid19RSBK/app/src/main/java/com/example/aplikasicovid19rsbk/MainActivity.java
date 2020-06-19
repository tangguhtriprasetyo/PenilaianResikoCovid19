package com.example.aplikasicovid19rsbk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView resiko, kecemasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resiko = findViewById(R.id.cardViewResiko);
        kecemasan = findViewById(R.id.cardViewKecemasan);

        resiko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Resiko.class);
                startActivity(intent);
            }
        });

        kecemasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Kecemasan.class);
                startActivity(intent);

            }
        });

    }
}