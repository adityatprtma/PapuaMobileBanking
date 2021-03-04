
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
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView PindahHalaman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PindahHalaman = findViewById(R.id.masuk);
        PindahHalaman.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Beranda.class);
            startActivity(i);
        });

    }
}