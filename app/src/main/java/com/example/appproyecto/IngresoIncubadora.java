package com.example.appproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresoIncubadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void añadir(View view) {
        Intent i = new Intent(this, bienvenida.class );
        startActivity(i);
    }

    public void volver(View view) {
        Intent i = new Intent(this, bienvenida.class );
        startActivity(i);

    }
}