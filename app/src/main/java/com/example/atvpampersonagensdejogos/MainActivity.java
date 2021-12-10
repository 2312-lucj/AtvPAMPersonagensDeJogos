package com.example.atvpampersonagensdejogos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    List<Personagem> personagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personagens = new ArrayList<>();
        personagens.add(new Personagem("Abby", "20", "1 estrela", R.drawable.abby_tlou));
        personagens.add(new Personagem("Bill", "30", "4 estrelas", R.drawable.bill_tlou));
        personagens.add(new Personagem("Dina", "20", "5 estrelas", R.drawable.dina_tlou));
        personagens.add(new Personagem("Ellie", "19", "2 estrelas", R.drawable.ellie_tlou));
        personagens.add(new Personagem("Jesse", "21", "5 estrelas", R.drawable.jesse_tlou));
        personagens.add(new Personagem("Joel", "50", "3 estrelas", R.drawable.joel_tlou));
        personagens.add(new Personagem("Marlene", "40", "1 estrela", R.drawable.marlene_tlou));
        personagens.add(new Personagem("Sarah", "13", "5 estrelas", R.drawable.sarah_tlou));
        personagens.add(new Personagem("Tess", "35", "4 estrelas", R.drawable.tess_tlou));
        personagens.add(new Personagem("Tommy", "40", "3 estrelas", R.drawable.tommy_tlou));

        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        AdapterRecyclerView mAdapter = new AdapterRecyclerView(getApplicationContext(), personagens);

        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setAdapter(mAdapter);
    }
}