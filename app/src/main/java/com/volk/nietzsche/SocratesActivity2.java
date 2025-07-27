package com.volk.nietzsche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SocratesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socrates2);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                getString(R.string.b_0),
                getString(R.string.b_1),
                getString(R.string.b_2),
                getString(R.string.b_3),
                getString(R.string.b_4),
                getString(R.string.b_5),
                getString(R.string.b_6),
                getString(R.string.b_7),
                getString(R.string.b_8),
                getString(R.string.b_9),
                getString(R.string.b_10),

        };
        int numeros = new Random().nextInt(10);
        TextView texto = findViewById(R.id.textResultado);
        Typeface font = Typeface.createFromAsset(getAssets(), "Carattere-Regular.ttf");
        texto.setTypeface(font);
        texto.setText(frases[numeros]);


    }

    public void ProximaTela(View view) {
        Intent proxima = new Intent(this, PitagorasActivity3.class);
        startActivity(proxima);
    }

    public void VoltarTela(View view) {
        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }
}