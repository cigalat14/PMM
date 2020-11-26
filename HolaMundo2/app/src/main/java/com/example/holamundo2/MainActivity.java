package com.example.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText miTexto= (EditText) findViewById (R.id.miTxt);
        final Button miBoton= (Button) findViewById(R.id.miBtn);
        final TextView elSaludo= (TextView) findViewById(R.id.miLbl);

        miBoton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent = new Intent(MainActivity.this, Pantalla.class);

                Bundle miBundle = new Bundle();
                String mensajePaso = "Te saludo " + miTexto.getText();
                miBundle.putString ("TEXTO", mensajePaso);
                miIntent.putExtras (miBundle);
                startActivity(miIntent);

                //TOAST.makeText(this, "Pelsado BOTON", Toast.LENGHT_SHORT).show();
                showToast("Pulsado BOTON");
            }
        });
    }
    protected void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}