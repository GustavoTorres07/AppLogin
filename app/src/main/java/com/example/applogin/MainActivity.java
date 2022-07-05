package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Aqui debemos determinar o referenciar todos los objetos que utilizamos en el diseño / declarar variables */

    EditText etusuario, etclave;
    Button btnIniciar;
    TextView tvintentos;

    /* declaro variables*/

    private int contador=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusuario=(EditText) findViewById(R.id.etusuario);
        etclave=(EditText) findViewById(R.id.etpassword);
        tvintentos=(TextView) findViewById(R.id.tvintentos);
        tvintentos.setText("N° de Intentos Restantes: 5");
        btnIniciar=(Button) findViewById(R.id.button);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValidarAcceso(etusuario.getText().toString(), etclave.getText().toString());
            }
        });


    }
    // Creo un metodo para el boton

    private void ValidarAcceso(String usu, String clave){

        if (usu.equals("Admin") && clave.equals("Admin")){
            Intent intent=new Intent(MainActivity.this, menu.class);
            startActivity(intent);
        }else{

            contador--;
            tvintentos.setText("N° de Intentos restantes: "+ String.valueOf(contador));
            if(contador==0){
                btnIniciar.setEnabled(false);

            }

        }

    }

}