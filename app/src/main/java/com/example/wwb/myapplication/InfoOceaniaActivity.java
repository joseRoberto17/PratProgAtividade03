package com.example.wwb.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * José Roberto Xavier da Silva
 * 816113694
 *
 */

public class InfoOceaniaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_oceania);

        TextView nome = (TextView)findViewById(R.id.nomeP);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(AfricaActivity.INFO));
        String n = nome.getText().toString();

        TextView info = (TextView)findViewById(R.id.infoP);
        String capital;
        String popu;
        String idioma;
        String unir;

        if(n.equals("Austrália")){


            capital = "Sidney";
            popu = "54.956.900";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Nauru")){
            capital = "Iarém";
            popu = "9.000.000";
            idioma = "nativo";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Nova Zelândia")){
            capital = "Wellhington";
            popu = "16.000.000";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Salomão")){
            capital = "Honiara";
            popu = "6.000.000";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Vanuatu")){
            capital = "Porto Vila";
            popu = "5.000.000";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else{


            capital = "****";
            popu = "***";
            idioma = "****";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }


    }
}
