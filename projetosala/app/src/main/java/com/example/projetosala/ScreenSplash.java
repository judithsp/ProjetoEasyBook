package com.example.projetosala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ScreenSplash extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_screensplash);
            Handler handle = new Handler();
            handle.postDelayed(new Runnable() {
                @Override
                public void run() {
                    abrirTelaInicial();
                }
            }, 2000);

        }

        private void abrirTelaInicial() {
            Intent intent = new Intent(ScreenSplash.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

}