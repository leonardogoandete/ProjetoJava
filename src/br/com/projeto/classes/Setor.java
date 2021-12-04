package br.com.projeto.classes;

import java.util.List;

public class Setor {
    public String nome;
    public int cotaLiberada;
    public Usuario usuario;
    public Item itens;
    public Solicitacao solicitacoes;


    public Setor(String nome, int cotaLiberada) {
        this.setNome(nome);
        this.cotaLiberada=cotaLiberada;
    }

    public String getNome() {
        return nome;
    }
    public int getCotaLiberada() {
        return cotaLiberada;
    }

    public void setNome(String nome) {
        if (nome == null){
            throw new RuntimeException("Nome do setor nao pode ser nulo!");
        }
        this.nome = nome;
    }

    public List<Item> itensAutorizados(){
        //itens.getTipo().equals();
        return null;
    }

    public List<Usuario> getUsuarios(){
        usuario.getLogin();
        return null;
    }





}
