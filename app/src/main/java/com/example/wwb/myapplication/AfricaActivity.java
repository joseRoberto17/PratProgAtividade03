package com.example.wwb.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * José Roberto Xavier da Silva
 * 816113694
 *
 */

public class AfricaActivity extends AppCompatActivity {
    public static final String INFO =
            "com.example.wwb.myapplication.AfricaActivity";
    ArrayList<String> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);
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
                        InfoAfricaActivity.class);
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
        lista.add("África do Sul");
        lista.add("Angola");
        lista.add("Benin");
        lista.add("Botsuana");
        lista.add("Camarões");
        lista.add("Cabo Verde");
        lista.add("Congo");
        lista.add("Costa do Marfim");
        lista.add("Guiné");
        lista.add("Etiópia");
        lista.add("Gana");
        lista.add("Libéria");
        lista.add("Moçambique");
        lista.add("Nigéria");
        lista.add("Quênia");
        lista.add("Senegal");
        lista.add("Somália");
        lista.add("Tanzânia");
        lista.add("Togo");
        lista.add("Zâmbia");
        lista.add("Zimbábue");
        return lista;
    }
}
