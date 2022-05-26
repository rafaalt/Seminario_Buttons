package com.example.seminariorafael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonStateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_state);

        Button bt1 = findViewById(R.id.btnState1);
        Button bt2 = findViewById(R.id.btnState2);
        Button bt3 = findViewById(R.id.btnState3);

        bt1.setOnClickListener((view)-> {
            Toast.makeText(ButtonStateActivity.this, "Botao 1 Clicado!", Toast.LENGTH_SHORT).show();
        });
        bt2.setOnClickListener((view)-> {
            Toast.makeText(ButtonStateActivity.this, "Botao 2 Clicado!", Toast.LENGTH_SHORT).show();
        });
        bt3.setOnClickListener((view)-> {
            if(bt1.isEnabled()){
                bt2.setEnabled(true);
                bt1.setEnabled(false);
            }
            else{
                bt1.setEnabled(true);
                bt2.setEnabled(false);
            }
        });

    }
}