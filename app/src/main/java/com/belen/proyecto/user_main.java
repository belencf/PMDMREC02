package com.belen.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class user_main extends AppCompatActivity {
    private Spinner spn;
    String provincia;
    Button ver;
    Button salir;
    private void fase(){

        spn = (Spinner) findViewById(R.id.Provincias);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                provincia = spn.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        ver=(Button) findViewById(R.id.fase_view);
       spn = (Spinner)findViewById(R.id.Provincias);
       salir=(Button) findViewById(R.id.Salir);

       String [] opciones = {"A Coruña","Lugo","Pontevedra","Ourense"};

       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_item_personalizado, opciones);
       spn.setAdapter(adapter);
       adapter.notifyDataSetChanged();
       fase();
       ver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(v.getContext(), ImgAerea.class);
               intent.putExtra("var",provincia );
               startActivity(intent);
           }
       });
       salir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), MainActivity.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
               intent.putExtra("EXIT", true);
               startActivity(intent);
            }

        });
   }
}


