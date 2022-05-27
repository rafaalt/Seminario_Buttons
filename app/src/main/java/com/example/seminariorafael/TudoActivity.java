package com.example.seminariorafael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class TudoActivity extends AppCompatActivity {
    private int cliquesTela = 0;
    private int cliquesObjetos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tudo);

        ImageView image = findViewById(R.id.tudoImagemCruzeiro);
        TextView txt = findViewById(R.id.tudoTxt);
        TextView txtCliques = findViewById(R.id.tudoTxtCliques);
        TextView txtCliquesTela = findViewById(R.id.tudoTxtCliquesTela);
        FrameLayout frame = findViewById(R.id.tudoTelaAtras);

        image.setOnClickListener((view) -> {
            cliquesObjetos++;
            txtCliques.setText("Cliques nos Objetos: " + cliquesObjetos);
        });

        txt.setOnClickListener((view) -> {
            cliquesObjetos++;
            txtCliques.setText("Cliques nos Objetos: " + cliquesObjetos);
        });

        txtCliques.setOnClickListener((view) -> {
            cliquesObjetos++;
            txtCliques.setText("Cliques nos Objetos: " + cliquesObjetos);
        });

        txtCliquesTela.setOnClickListener((view) -> {
            cliquesObjetos++;
            txtCliques.setText("Cliques nos Objetos: " + cliquesObjetos);
        });

        frame.setOnClickListener((view) -> {
            cliquesTela++;
            txtCliquesTela.setText("Cliques na Tela: " + cliquesTela);
        });
    }
}