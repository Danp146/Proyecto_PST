package com.example.appproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciosecion(View view) {
        Intent i = new Intent(this, InicioSes.class );
        startActivity(i);
    }

    public void crearcuenta(View view) {
        Intent i = new Intent(this, crearCuenta.class );
        startActivity(i);
    }




}