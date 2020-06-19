package com.example.aplikasicovid19rsbk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Resiko extends AppCompatActivity {

    private Button submit;
    int skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resiko);

        submit = findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Resiko.this, ResultResiko.class);
                intent.putExtra("SKOR", String.valueOf(skor));
                startActivity(intent);
                finish();
            }
        });

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio_gejala1:
                skor +=3;
                break;
            case R.id.radio_riwayat1:
                skor +=2;
                break;
            case R.id.radio_radius1:
                skor +=1;
                break;
            case R.id.radio_jenazah1:
                skor +=1;
                break;
            case R.id.radio_desinfektan2:
                skor +=1;
                break;
            case R.id.radio_distancing2:
                skor +=1;
                break;
            case R.id.radio_kerumunan1:
                skor +=1;
                break;
            case R.id.radio_karantina2:
                skor +=1;
                break;
            case R.id.radio_cegah2:
                skor +=1;
                break;
        }
    }
}