package com.example.examenpractico1ds39;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MamiferosAct extends AppCompatActivity {
    Button btnMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamiferos2);
        btnMostrar = findViewById(R.id.btnVideoM);
        btnMostrar.setOnClickListener((v -> {
            Intent act =new Intent(getApplicationContext(), mamiferos.class);
            startActivity(act);
        }));
    }

}