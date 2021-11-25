package br.com.projeto.classes;

public class Setor {
    public String nome;

    public Setor(String nome) {
        this.setNome(nome);
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




}
