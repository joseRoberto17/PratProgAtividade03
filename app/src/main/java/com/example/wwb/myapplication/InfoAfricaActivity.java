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

public class InfoAfricaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_africa);

        TextView nome = (TextView)findViewById(R.id.nomeP);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(AfricaActivity.INFO));
        String n = nome.getText().toString();

        TextView info = (TextView)findViewById(R.id.infoP);
        String capital;
        String popu;
        String idioma;
        String unir;

        if(n.equals("África do Sul")){


            capital = "Cidade do Cabo";
            popu = "54.956.900";
            idioma = "Língua africâner, Língua inglesa, Língua zulu";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Angola")){
            capital = "Luanda";
            popu = "20.0000";
            idioma = "Português";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Benin")){
            capital = "Cotonou";
            popu = "25.0000";
            idioma = "Francês";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Botsuana")){
            capital = "Gaborone";
            popu = "2 250 260";
            idioma = "Inglês e Setswana";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Camarões")){
            capital = "Iaundé";
            popu = "23 739 218";
            idioma = "Língua francesa, Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Cabo Verde")){
            capital = "Praia";
            popu = "13.039.818";
            idioma = "Língua portuguesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Congo")){
            capital = "Brazavile";
            popu = "3.009.810";
            idioma = "Língua portuguesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Costa do Marfim")){
            capital = "Yamoussoukro";
            popu = "20 179 602";
            idioma = "Língua francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Guiné")){
            capital = "Conacri";
            popu = "9 806 509";
            idioma = "Língua francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Etiópia")){
            capital = "Manuie";
            popu = "19 806 509";
            idioma = "Língua francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Gana")){
            capital = "Acra";
            popu = "25 199 609";
            idioma = "Língua francesa, Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Libéria")){
            capital = "Ugilacra";
            popu = "35 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Moçambique")){
            capital = "Ura";
            popu = "15 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Nigéria")){
            capital = "Nanou";
            popu = "25.0000";
            idioma = "Francês";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Quênia")){
            capital = "Chaminiel";
            popu = "15 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }
        else if(n.equals("Senegal")){
            capital = "Buniriaul";
            popu = "5 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Somália")){
            capital = "Manuie";
            popu = "19 806 509";
            idioma = "Língua francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Tanzânia")){
            capital = "Tarzan";
            popu = "14 806 509";
            idioma = "Língua francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Togo")){
            capital = "Tanguam";
            popu = "25 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Zâmbia")){
            capital = "Zamniughy";
            popu = "25 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Zimbábue")){
            capital = "Tyhua";
            popu = "5 199 609";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }



    }
}
