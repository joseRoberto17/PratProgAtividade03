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

public class InfoEuropaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_europa);

        TextView nome = (TextView)findViewById(R.id.nomeP);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(AfricaActivity.INFO));
        String n = nome.getText().toString();

        TextView info = (TextView)findViewById(R.id.infoP);
        String capital;
        String popu;
        String idioma;
        String unir;

        if(n.equals("Alemanha")){


            capital = "Berlim";
            popu = "94.956.900";
            idioma = "Língua alemão";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Áustria")){
            capital = "Viena";
            popu = "20.0000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Bélgica")){
            capital = "Bruxelas";
            popu = "9.0000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Croácia")){
            capital = "Zagrebe";
            popu = "20.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Dinamarca")){
            capital = "Copenhaga";
            popu = "19.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Espanha")){
            capital = "Madri";
            popu = "59.000.000";
            idioma = "Lingua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("França")){
            capital = "Paris";
            popu = "32.000.000";
            idioma = "Lingua francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Grécia")){
            capital = "Athenas";
            popu = "16.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Itália")){
            capital = "Roma";
            popu = "46.000.000";
            idioma = "Lingua italiana";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Noruega")){
            capital = "Oslo";
            popu = "6.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Polónia")){
            capital = "Aslkuo";
            popu = "26.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Portugal")){
            capital = "Lisboa";
            popu = "26.000.000";
            idioma = "Lingua portuguesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Reino Unido")){
            capital = "Londres";
            popu = "106.000.000";
            idioma = "Lingua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("República Checa")){
            capital = "Praga";
            popu = "10.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Rússia")){
            capital = "Moscovo";
            popu = "300.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Suécia")){
            capital = "Estocolmo";
            popu = "20.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Ucrânia")){
            capital = "Estocolmo";
            popu = "20.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Vaticano")){
            capital = "Vaticano";
            popu = "1.000.000";
            idioma = "Lingua nativa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
    }
}
