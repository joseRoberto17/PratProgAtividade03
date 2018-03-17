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

public class InfoAmericaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_america);

        TextView nome = (TextView)findViewById(R.id.nomeP);
        Intent intent = getIntent();

        nome.setText(intent.getStringExtra(AfricaActivity.INFO));
        String n = nome.getText().toString();

        TextView info = (TextView)findViewById(R.id.infoP);
        String capital;
        String popu;
        String idioma;
        String unir;

        if(n.equals("Canadá")){


            capital = "Toronto";
            popu = "54.956.900";
            idioma = "Língua inglesa e francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Estados Unidos")){


            capital = "Washington";
            popu = "354.056.200";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("México")){


            capital = "Cidado do México";
            popu = "94.006.920";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Argentina")){


            capital = "Buenos Aires";
            popu = "34.956.900";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Chile")){


            capital = "Santiago";
            popu = "17.906.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Colômbia")){


            capital = "Bogotá";
            popu = "47.006.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Venezuela")){


            capital = "Caracas";
            popu = "17.006.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Bolívia")){


            capital = "La Paz";
            popu = "22.576.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Uruguai")){


            capital = "Montevidéu";
            popu = "18.576.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Paraguai")){


            capital = "Assunção";
            popu = "15.576.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Equador")){


            capital = "Quitoo";
            popu = "15.006.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Brasil")){


            capital = "Brasilia";
            popu = "205.006.100";
            idioma = "Língua portuguesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Costa Rica")){


            capital = "San José";
            popu = "15.006.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Cuba")){


            capital = " Havana";
            popu = "12.006.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Haiti")){


            capital = " Porto Príncipe";
            popu = "9.006.100";
            idioma = "Língua espanhola e francesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Panamá")){


            capital = "Cidade do Panamá";
            popu = "10.006.100";
            idioma = "Língua espanhola";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("Jamaica")){


            capital = "Kingston";
            popu = "15.006.100";
            idioma = "Língua inglesa";

            unir = "Capital : " + capital + '\n' +
                    "População : " + popu + '\n' +
                    "Idioma : " + idioma;


            info.setText(unir);
        }

        else if(n.equals("República Dominicana")){


            capital = "Nova República Dominicana";
            popu = "9.006.100";
            idioma = "Língua espanhola";

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
