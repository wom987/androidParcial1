package com.example.examenpractico1ds39;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PecesAct extends AppCompatActivity {
    Button btnMostrar;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peces2);
        btnMostrar = findViewById(R.id.btnVideoP);
        btnMostrar.setOnClickListener((v -> {
            Intent act =new Intent(getApplicationContext(), peces.class);

            startActivity(act);
        }));
    }
}