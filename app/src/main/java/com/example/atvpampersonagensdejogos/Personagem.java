package com.example.atvpampersonagensdejogos;

public class Personagem {

    private String nome;
    private String idade;
    private String avaliacao;
    private int miniatura;


    public Personagem(String nome, String idade, String avaliacao, int miniatura) {
        this.nome = nome;
        this.idade = idade;
        this.avaliacao = avaliacao;
        this.miniatura= miniatura;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}