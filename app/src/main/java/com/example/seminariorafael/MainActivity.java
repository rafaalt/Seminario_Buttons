package com.example.seminariorafael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplos = findViewById(R.id.btnMainAct1);
        Button btnStates = findViewById(R.id.btnMainAct2);

        btnExemplos.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        }));

        btnStates.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, ButtonStateActivity.class);
            startActivity(intent);
        }));
    }
}