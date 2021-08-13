package com.example.tugas_uas_genap_2021_akb_if_9_10118396;

// 07 Agustus 2021
// 10118396
// Azzuhra
// IF 9

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);

                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}