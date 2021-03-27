package com.example.examenpractico1ds39;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InsectosAct extends AppCompatActivity {
    Button btnMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insectos2);
        btnMostrar = findViewById(R.id.btnVideoI);
        btnMostrar.setOnClickListener((v -> {
            Intent act =new Intent(getApplicationContext(), insectos.class);
            startActivity(act);
        }));
    }
}