package com.belen.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Fase_add extends AppCompatActivity {
    EditText fasename;
    EditText fasetext;
    Button guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase_add);
        fasename=(EditText) findViewById(R.id.faseName);
        fasetext=(EditText) findViewById(R.id.caract);
        guardar=(Button) findViewById(R.id.save);


    }
}
