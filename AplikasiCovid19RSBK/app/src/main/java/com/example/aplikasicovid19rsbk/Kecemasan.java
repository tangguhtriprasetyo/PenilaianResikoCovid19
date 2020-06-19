package com.example.aplikasicovid19rsbk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Kecemasan extends AppCompatActivity {
    RadioGroup ansietas, tegang, takut, gangguan, depresi, somatik, kardio, respiratori, gastro, otonom, tingkah;
    RadioButton selectAnsietas, selectTegang, selectTakut, selectGangguan, selectDepresi, selectSomatik, selectKardio, selectRespiratori, selectGastro, selectOtonom, selectTingkah;
    Button submit;
    int skorkecemasan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kecemasan);

        submit = findViewById(R.id.btn_submit_kecemasan);

        ansietas = findViewById(R.id.ansietas);
        tegang = findViewById(R.id.tegang);
        takut = findViewById(R.id.takut);
        gangguan = findViewById(R.id.gangguan);
        depresi = findViewById(R.id.depresi);
        somatik = findViewById(R.id.somatik);
        kardio = findViewById(R.id.kardio);
        respiratori = findViewById(R.id.respiratori);
        gastro = findViewById(R.id.gastro);
        otonom = findViewById(R.id.otonom);
        tingkah = findViewById(R.id.tingkah);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedRadioButtonID1 = ansietas.getCheckedRadioButtonId();
                int selectedRadioButtonID2 = tegang.getCheckedRadioButtonId();
                int selectedRadioButtonID3 = takut.getCheckedRadioButtonId();
                int selectedRadioButtonID4 = gangguan.getCheckedRadioButtonId();
                int selectedRadioButtonID5 = depresi.getCheckedRadioButtonId();
                int selectedRadioButtonID6 = somatik.getCheckedRadioButtonId();
                int selectedRadioButtonID7 = kardio.getCheckedRadioButtonId();
                int selectedRadioButtonID8 = respiratori.getCheckedRadioButtonId();
                int selectedRadioButtonID9 = gastro.getCheckedRadioButtonId();
                int selectedRadioButtonID10 = otonom.getCheckedRadioButtonId();
                int selectedRadioButtonID11 = tingkah.getCheckedRadioButtonId();

                selectAnsietas = findViewById(selectedRadioButtonID1);
                selectTegang = findViewById(selectedRadioButtonID2);
                selectTakut = findViewById(selectedRadioButtonID3);
                selectGangguan = findViewById(selectedRadioButtonID4);
                selectDepresi = findViewById(selectedRadioButtonID5);
                selectSomatik = findViewById(selectedRadioButtonID6);
                selectKardio = findViewById(selectedRadioButtonID7);
                selectRespiratori = findViewById(selectedRadioButtonID8);
                selectGastro = findViewById(selectedRadioButtonID9);
                selectOtonom = findViewById(selectedRadioButtonID10);
                selectTingkah = findViewById(selectedRadioButtonID11);

                String hasil1 = selectAnsietas.getText().toString();
                String hasil2 = selectTegang.getText().toString();
                String hasil3 = selectTakut.getText().toString();
                String hasil4 = selectGangguan.getText().toString();
                String hasil5 = selectDepresi.getText().toString();
                String hasil6 = selectSomatik.getText().toString();
                String hasil7 = selectKardio.getText().toString();
                String hasil8 = selectRespiratori.getText().toString();
                String hasil9 = selectGastro.getText().toString();
                String hasil10 = selectOtonom.getText().toString();
                String hasil11 = selectTingkah.getText().toString();

                skorkecemasan = Integer.parseInt(hasil1) +
                                Integer.parseInt(hasil2) +
                                Integer.parseInt(hasil3) +
                                Integer.parseInt(hasil4) +
                                Integer.parseInt(hasil5) +
                                Integer.parseInt(hasil6) +
                                Integer.parseInt(hasil7) +
                                Integer.parseInt(hasil8) +
                                Integer.parseInt(hasil9) +
                                Integer.parseInt(hasil10) +
                                Integer.parseInt(hasil11);

                Intent intent = new Intent(Kecemasan.this, ResultKecemasan.class);
                intent.putExtra("SKOR KECEMASAN", String.valueOf(skorkecemasan));
                startActivity(intent);
                finish();

            }
        });
    }
}