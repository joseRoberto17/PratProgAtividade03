package com.example.wwb.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * José Roberto Xavier da Silva
 * 816113694
 *
 */
public class AmericaActivity extends AppCompatActivity {
    public static final String INFO =
            "com.example.wwb.myapplication.AmericaActivity";
    ArrayList<String> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);

        atividade = this;

        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.NOME);
        lista = buscaChamados(chave);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(atividade,
                        InfoAmericaActivity.class);
                intent.putExtra(INFO, lista.get(position));

                startActivity(intent);
            }
        });

    }


    public ArrayList<String> buscaChamados(String chave){
        ArrayList<String> lista = geraListaChamados();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<String> subLista = new ArrayList<>();
            for(String nome:lista){
                if(nome.toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(nome);
                }
            }
            return subLista;
        }
    }

    public ArrayList<String> geraListaChamados(){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Canadá");
        lista.add("Estados Unidos");
        lista.add("México");

        lista.add("Argentina");
        lista.add("Chile");
        lista.add("Colômbia");
        lista.add("Venezuela");
        lista.add("Bolívia");
        lista.add("Uruguai");
        lista.add("Paraguai");
        lista.add("Equador");
        lista.add("Brasil");

        lista.add("Costa Rica");
        lista.add("Cuba");
        lista.add("Haiti");
        lista.add("Panamá");
        lista.add("Jamaica");
        lista.add("República Dominicana");
        return lista;
    }
}
