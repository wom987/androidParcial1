package com.example.examenpractico1ds39;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

public class AvesAct extends AppCompatActivity {
    Button btnMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves2);
        btnMostrar = findViewById(R.id.btnVideoA);
        btnMostrar.setOnClickListener((v -> {
            Intent act =new Intent(getApplicationContext(), aves.class);
            startActivity(act);
        }));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}