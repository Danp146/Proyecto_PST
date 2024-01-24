package com.example.appproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void añadir(View view) {
        Intent i = new Intent(this, IngresoIncubadora.class );
        startActivity(i);
    }

    public void cerrar(View view) {
        Intent i = new Intent(this, Menu.class );
        startActivity(i);
    }


}