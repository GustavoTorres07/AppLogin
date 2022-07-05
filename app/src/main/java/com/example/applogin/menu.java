package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // es lo que se va a reflejar cuando paso a otra ventana
        setTitle("Menu");
    }

    public void MostrarActividadNota(View view){

        Intent intent=new Intent(menu.this,calcularpromedio.class);
        startActivity(intent);

    }
}