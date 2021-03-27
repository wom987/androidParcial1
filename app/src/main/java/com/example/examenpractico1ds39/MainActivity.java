package com.example.examenpractico1ds39;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvAnimal;
    private AnimalesAdapter adapteranima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvAnimal = findViewById(R.id.rcvEspecie);
        rcvAnimal.setLayoutManager(new LinearLayoutManager(this));

        adapteranima = new AnimalesAdapter(obtenerAnimales());
        rcvAnimal.setAdapter(adapteranima);
        adapteranima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = obtenerAnimales().get(rcvAnimal.getChildAdapterPosition(v)).getTitulo();
                if(data=="Aves"){
                    Toast.makeText(getApplicationContext(),"Seleccion: "+data,Toast.LENGTH_SHORT).show();
                }else if(data=="Peces"){}
                else if(data=="Insectos"){}
                else if(data=="Mamiferos"){}

            }
        });
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




        }



    public List<AnimalesModelo> obtenerAnimales() {
        List<AnimalesModelo> animales = new ArrayList<>();
        animales.add(new AnimalesModelo(R.drawable.aves, "Aves", "La mayor parte de las aves pueden volar, lo que las distingue de casi todo el resto de vertebrados. "));
        animales.add(new AnimalesModelo(R.drawable.peces, "Peces", "Los peces todos los biomas terrestres y también en todos los océanos."));
        animales.add(new AnimalesModelo(R.drawable.insectos, "Insectos", "Los insectos constituyen una de las clases de animales que más interrelacionados se hallan con las actividades humanas."));
        animales.add(new AnimalesModelo(R.drawable.mamiferos, "Mamiferos", "os mamíferos, los dientes se hallan siempre insertos en los huesos del cráneo que rodean la boca."));

        return animales;
        // action bar de integrantes

    }
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
        return true;
    }

}
