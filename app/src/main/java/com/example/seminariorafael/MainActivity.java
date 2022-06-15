package com.example.seminariorafael;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int RADIO_CODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExemplos = findViewById(R.id.btnMainAct1);
        Button btnStates = findViewById(R.id.btnMainAct2);
        Button btnRadio = findViewById(R.id.btnMainAct3);
        Button btnMExemplos = findViewById(R.id.btnMainAct44);
        Button btnShapes = findViewById(R.id.btnMainAct4);
        Button btnRadio2 = findViewById(R.id.btnMainAct5);

        btnExemplos.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        }));

        btnStates.setOnClickListener((view -> {
            Intent intent = new Intent(MainActivity.this, ButtonStateActivity.class);
            startActivity(intent);
        }));

        btnRadio.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, RadioActivity.class);
            startActivityForResult(intent, RADIO_CODE);
        });

        btnShapes.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, ShapeActivity.class);
            startActivity(intent);
        });

        btnMExemplos.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, TudoActivity.class);
            startActivity(intent);
        });

        btnRadio2.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, ExemplosRadio.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RADIO_CODE && resultCode == RESULT_OK){
            TextView txtIntro = findViewById(R.id.txtRadioButIntro);
            TextView txtResult = findViewById(R.id.txtRadioButResult);
            TextView txtResult2 = findViewById(R.id.txtRadioButResult2);
            txtIntro.setVisibility(View.VISIBLE);
            String genero = data.getStringExtra("genero");
            String escolaridade = data.getStringExtra("escolaridade");
            txtResult.setText("Genero: " +genero);
            txtResult2.setText("Escolaridade: " + escolaridade);

        }
    }
}