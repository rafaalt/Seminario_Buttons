package com.example.seminariorafael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        Button btnEnviar = findViewById(R.id.btnRadioEnviar);
        btnEnviar.setOnClickListener((view)->{
            RadioGroup radioGroupEsc = findViewById(R.id.radioEscolaridade);
            RadioGroup radioGroupGen = findViewById(R.id.radioGenero);

            Bundle bundle = new Bundle();
                int id1 = radioGroupEsc.getCheckedRadioButtonId();
                int id2 = radioGroupGen.getCheckedRadioButtonId();
                if(id1 != -1 && id2 != -1) {
                    RadioButton selecionado1 = findViewById(id1);
                    bundle.putString("escolaridade", selecionado1.getText() + "");


                    RadioButton selecionado2 = findViewById(id2);
                    bundle.putString("genero", selecionado2.getText() + "");

                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    this.setResult(RESULT_OK, intent);
                    this.finish();
                }
                else{
                    Toast.makeText(RadioActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
        });
    }
}