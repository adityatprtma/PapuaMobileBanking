
/**
 * Bank Papua
 * https://www.instagram.com/adityatprtma/
 * Created on 03-maret-2021.
 * Created by : Adityatprtma
 */
package com.example.bankpapua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Beranda extends AppCompatActivity {

    LinearLayout Berhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        Berhasil = findViewById(R.id.berhasil);
        Berhasil.setOnClickListener(view -> {
            Intent i = new Intent(Beranda.this, Transaksi.class);
            startActivity(i);
        });
    }
}