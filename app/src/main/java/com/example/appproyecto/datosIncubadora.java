package com.example.appproyecto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class datosIncubadora extends AppCompatActivity {
    private TextView txt_temp;
    private TextView txt_hum;
    private DatabaseReference mDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_incubadora);
        mDataBase = FirebaseDatabase.getInstance().getReference("sensor");

        txt_temp = (TextView) findViewById(R.id.txt_humedad);
        txt_hum = (TextView) findViewById(R.id.txt_humedad);

        mDataBase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    // Obtiene los valores de temperatura y humedad desde los subnodos.
                    String temperatura = snapshot.child("temperatura").getValue(String.class);
                    String humedad = snapshot.child("humedad").getValue(String.class);

                    // Actualiza los TextView con los valores obtenidos.
                    txt_temp.setText("La temperatura es: " + temperatura);
                    txt_hum.setText("La humedad es: " + humedad);
                } else {
                    Log.w("FirebaseData", "No existen datos en el nodo 'sensor'");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.e("FirebaseError", "Error en la lectura de datos: " + error.getMessage());
            }
        });
    }
}