package com.belen.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ImgAerea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_aerea);
        ImageView vista =(ImageView) findViewById(R.id.Aerea);
        Bundle datos = this.getIntent().getExtras();
        String provincia = datos.getString("var");
        switch (provincia) {
            case "A Coruña":
                vista.setImageResource(R.drawable.coru);
                break;
            case "Lugo":
                vista.setImageResource(R.drawable.lugo);
                break;
            case "Pontevedra":
                vista.setImageResource(R.drawable.ponte);
                break;
            case "Ourense":
                vista.setImageResource(R.drawable.orense);
                break;
            default:
                break;
        }
    }
}
