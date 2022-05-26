package com.example.seminariorafael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    private int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button btnContador = findViewById(R.id.btn1_1);
        btnContador.setOnClickListener((view)-> {
            contador++;
            btnContador.setText("Contador: " + contador);

        });
    }
}