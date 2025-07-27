package com.volk.nietzsche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class PitagorasActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitagoras3);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                getString(R.string.c_0),
                getString(R.string.c_1),
                getString(R.string.c_2),
                getString(R.string.c_3),
                getString(R.string.c_4),
                getString(R.string.c_5),
                getString(R.string.c_6),
                getString(R.string.c_7),
                getString(R.string.c_8),
                getString(R.string.c_9),
                getString(R.string.c_10),

        };
        int numeros = new Random().nextInt(11);
        TextView texto = findViewById(R.id.textResultado);
        Typeface font = Typeface.createFromAsset(getAssets(), "Carattere-Regular.ttf");
        texto.setTypeface(font);
        texto.setText(frases[numeros]);


    }
    public void VoltarTela(View view) {
        Intent voltar = new Intent(this, SocratesActivity2.class);
        startActivity(voltar);
    }
    public void ProximaTela (View view) {
        Intent proxima = new Intent( this, Activity4.class);
        startActivity(proxima);
    }
}


