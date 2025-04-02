package com.eje.prueba000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreem extends AppCompatActivity {

    // transcribe
    @Override
    // Bundle savedInstanceState sirve para almacenar el estaddo anterio de la actividad en caso de que se reinicie
    protected void onCreate(Bundle savedInstanceState) {
        // el super sirve para llamar a metodo on create y que se genere correctamente
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screem);

        // mostramos la pantalla de carga durante 3 segundos
        // handler permite
        new Handler().postDelayed( () -> {

            // Se crea un objeto Intent que indica que queremos ir desde SplashScreen hacia MainActivity.
            Intent intent = new Intent(SplashScreem.this, MainActivity.class);
            startActivity(intent);
            // cierra la actividad actual
            finish();

        }, 3000);
    }
}