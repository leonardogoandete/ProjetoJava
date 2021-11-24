package br.com.projeto.Classes;

import br.com.projeto.Classes.Usuarios.Usuario;

import java.util.ArrayList;

public class Setor {
    private String nome;
    private int cotasetor;
    private Usuario x;
    ArrayList<Item> listaItens = new ArrayList<>();

    // construtor
    public Setor(String addNome) {
        setNome(addNome);
    }

    public int cotaLiberadaSetor(){
        if(getNome().equals("Tecnologia")){
            setCotasetor(1000);
        }
        if(getNome().equals("Recursos Humanos")){
            setCotasetor(500);
        }
        return this.getCotasetor();
    }

    public ArrayList<Item> itensLiberados(Setor nome_setor){
        if(nome_setor.getNome().equals("Tecnologia")) {
            listaItens.add(new Item("Caneta", "Caneta azul", "Insumo", 20, 2.58f));
            listaItens.add(new Item("Caneta", "Caneta vermelha", "Insumo", 10, 2.31f));
        }
        if(nome_setor.getNome().equals("Recursos Humanos")){
            listaItens.add(new Item("Caneta", "Caneta preta", "Insumo", 10, 2.31f));
        }
        return listaItens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCotasetor() {
        return cotasetor;
    }

    private void setCotasetor(int cotasetor) {
        this.cotasetor = cotasetor;
    }

}
