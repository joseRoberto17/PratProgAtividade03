package com.example.wwb.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * José Roberto Xavier da Silva
 * 816113694
 *
 */

public class MainActivity extends AppCompatActivity {
    public static final String NOME =
            "com.example.wwb.myapplication.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner meuSpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> meuAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        meuAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        meuSpinner.setAdapter(meuAdapter);

        meuSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    startActivity(new Intent(MainActivity.this, AfricaActivity.class));
                }

                else if(position == 2){
                    startActivity(new Intent(MainActivity.this, AmericaActivity.class));
                }
                else if(position == 3){
                    startActivity(new Intent(MainActivity.this, AsiaActivity.class));
                }
                else if(position == 4){
                    startActivity(new Intent(MainActivity.this, EuropaActivity.class));
                }

                else if(position == 5){
                    startActivity(new Intent(MainActivity.this, OceaniaActivity.class));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
