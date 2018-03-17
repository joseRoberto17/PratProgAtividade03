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

public class InfoAsiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_asia);

        TextView nome = (TextView)findViewById(R.id.nomeP);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(AfricaActivity.INFO));
        String n = nome.getText().toString();

        TextView info = (TextView)findViewById(R.id.infoP);
        String capital;
        String popu;
        String idioma;
        String unir;

        if(n.equals("Afeganistão")){


            capital = "Cabul";
            popu = "24.956.900";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Arábia Saudita")){
            capital = "Riade";
            popu = "15.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Catar")){
            capital = "Doa";
            popu = "15.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Cazaquistão")){
            capital = "Astana";
            popu = "9.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("China")){
            capital = "Pequim";
            popu = "2.009.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Coreia do Norte")){
            capital = "Pionguiangue";
            popu = "6.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Coreia do Sul")){
            capital = "Seul";
            popu = "16.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Índia")){
            capital = "Nova Déli";
            popu = "2.316.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Irão")){
            capital = "Teerão";
            popu = "10.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Israel")){
            capital = "Jerusalém";
            popu = "6.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Japão")){
            capital = "Tóquio";
            popu = "250.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Malásia")){
            capital = "Cuala Lumpur";
            popu = "22.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Nepal")){
            capital = "Catmandu";
            popu = "12.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Síria")){
            capital = "Damasco";
            popu = "8.000.000";
            idioma = "Língua inglesa e nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Turquia")){
            capital = "Ancara";
            popu = "38.000.000";
            idioma = "Língua inglesa e nativa";

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
