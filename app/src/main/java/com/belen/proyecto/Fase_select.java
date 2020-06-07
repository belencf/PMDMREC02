package com.belen.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Fase_select extends AppCompatActivity {
    private Spinner spn2;
    private Spinner spn3;
    Button asignar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase_select);
        spn2 = (Spinner)findViewById(R.id.Provincias);
        spn3 = (Spinner)findViewById(R.id.fases);
        String [] pr = {"A Coruña","Lugo","Pontevedra","Ourense"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_personalizado, pr);
        spn2.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        String [] fases = {"Fase 0","Fase 1","Fase 2","Fase 3"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item_personalizado, fases);
        spn3.setAdapter(adapter2);
        adapter2.notifyDataSetChanged();
        asignar=(Button) findViewById(R.id.saved);
    }
}
