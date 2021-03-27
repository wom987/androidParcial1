package com.example.examenpractico1ds39;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AnimalesAdapter extends RecyclerView.Adapter<AnimalesAdapter.ViewHolder>
{



    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView titulo, historia;
        ImageView fotoPortada;

        public ViewHolder(View itemView) {
            super(itemView);

            fotoPortada = itemView.findViewById(R.id.imvAnimales);
            titulo = itemView.findViewById(R.id.txvTitulo);
            historia = itemView.findViewById(R.id.txvHistoria);

        }
    }
    public List<AnimalesModelo> listaAnimales;

    public AnimalesAdapter(List<AnimalesModelo>listaAnimales){
        this.listaAnimales=listaAnimales;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_animales,parent,false);

        ViewHolder viewHolder= new ViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.fotoPortada.setImageResource(listaAnimales.get(position).getPortada());
        holder.titulo.setText(listaAnimales.get(position).getTitulo());
        holder.historia.setText(listaAnimales.get(position).getHistoria());

    }


    @Override
    public int getItemCount() {
        return listaAnimales.size();
    }
}
