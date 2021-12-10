package com.example.atvpampersonagensdejogos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private Context mContext;
    private List<Personagem> dado;

    public AdapterRecyclerView (Context applicationContext, List<Personagem> dado) {
        this.mContext = mContext;
        this.dado = dado;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo_personagens_cardview, parent, false);

        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.tvNome.setText(dado.get(position).getNome());
        holder.tvIdade.setText(dado.get(position).getIdade());
        holder.tvAvaliacao.setText(dado.get(position).getAvaliacao());
        holder.imgPersonagem.setImageResource(dado.get(position).getMiniatura());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, Personagem.class);

                intent.putExtra("Nome", dado.get(position).getNome());
                intent.putExtra("Idade", dado.get(position).getIdade());
                intent.putExtra("Avaliacao", dado.get(position).getAvaliacao());
                intent.putExtra("Miniatura", dado.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }


    @Override
    public int getItemCount() {
        return dado.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvNome, tvIdade, tvAvaliacao;
        ImageView imgPersonagem;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            tvNome = itemView.findViewById(R.id.NomePersonagem);
            tvIdade = itemView.findViewById(R.id.idIdade);
            tvAvaliacao = itemView.findViewById(R.id.idAvaliação);
            imgPersonagem = itemView.findViewById(R.id.id_ImagePersonagens);
            cardView = itemView.findViewById(R.id.CardViewPersonagens);
        }
    }
}
