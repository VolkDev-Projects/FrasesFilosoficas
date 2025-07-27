package com.volk.nietzsche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                getString(R.string.a_0),
                getString(R.string.a_1),
                getString(R.string.a_2),
                getString(R.string.a_3),
                getString(R.string.a_4),
                getString(R.string.a_5),
                getString(R.string.a_6),
                getString(R.string.a_7),
                getString(R.string.a_8),
                getString(R.string.a_9),
                getString(R.string.a_10),

        };
        int numeros = new Random().nextInt(10);
        TextView texto = findViewById(R.id.textResultado);
        Typeface font= Typeface.createFromAsset(getAssets(),"Carattere-Regular.ttf");
        texto.setTypeface(font);
        texto.setText(frases[numeros]);

    }

    public void ProximaTela(View view) {
        Intent proxima = new Intent(this, SocratesActivity2.class);
        startActivity(proxima);


    }
}