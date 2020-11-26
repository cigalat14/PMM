package com.example.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);

        final TextView otroSaludo = (TextView) findViewById(R.id.miMensaje);
        final Button miBotonvolver=(Button) findViewById(R.id.botonvolver);

        Bundle miBundleRecoger = getIntent().getExtras();
        otroSaludo.setText(miBundleRecoger.getString("TEXTO"));



        miBotonvolver.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent = new Intent(Pantalla.this, MainActivity.class);
                startActivity(miIntent);
            }
        });
    //final ImageButton miBotonImagenVolver = (ImageButton) findViewById(R.id.BtnImageVolver);
    }
}