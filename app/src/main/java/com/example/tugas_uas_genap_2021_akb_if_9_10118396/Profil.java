package com.example.tugas_uas_genap_2021_akb_if_9_10118396;

// 07 Agustus 2021
// 10118396
// Azzuhra
// IF 9

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Profil extends AppCompatActivity {

    private  String title = "Profil";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        setActionBarTitle(title);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
        }
    }
}