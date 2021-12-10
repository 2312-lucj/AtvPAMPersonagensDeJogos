package com.example.atvpampersonagensdejogos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Personagem_Activity extends AppCompatActivity {

    private TextView tnome, tidade, tavaliação;
    private ImageView imgpersonagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personagens_layout);

        tnome = findViewById(R.id.NomePersonagem);
        tidade = findViewById(R.id.idIdade);
        tavaliação = findViewById(R.id.idAvaliação);
        imgpersonagens = findViewById(R.id.id_ImagePersonagens);

        Intent intent = getIntent();

        String nome, idade, avaliacao;
        int miniatura;

        nome = intent.getExtras().getString("Nome");
        idade = intent.getExtras().getString("Idade");
        avaliacao = intent.getExtras().getString("Avaliacao");
        miniatura = intent.getExtras().getInt("Miniatura");

        tnome.setText(nome);
        tidade.setText(idade);
        tavaliação.setText(avaliacao);
        imgpersonagens.setImageResource(miniatura);
    }
}
