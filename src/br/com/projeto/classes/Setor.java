package br.com.projeto.classes;

import java.util.List;

public class Setor {
    public String nome;
    public int cotaLiberada;


    public Setor(String nome, int cotaLiberada) {
        this.setNome(nome);
        this.cotaLiberada=cotaLiberada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new RuntimeException("Nome do setor nao pode ser nulo!");
        }
        this.nome = nome;
    }

    public int getCotaLiberada() {
        return cotaLiberada;
    }


    public List<Item> itensAutorizados(){

        return  null;
    }



}
