package br.com.projeto.Classes;

import br.com.projeto.Classes.Usuarios.Usuario;

import java.util.ArrayList;

public class Setor {
    private String nome;
    private Usuario x;
    ArrayList<Item> listaItens = new ArrayList<>();

    // construtor
    public Setor(String addNome) {
        setNome(addNome);
    }

    public void cotaLiberadaSetor(){


    }

    public ArrayList<Item> itensLiberados(String x){
        if(x.equals("Tecnologia")) {
            listaItens.add(new Item("Caneta", "Caneta azul", "Insumo", 20, 2.58f));
            listaItens.add(new Item("Caneta", "Caneta vermelha", "Insumo", 10, 2.31f));
        }else if(x.equals("Recursos Humanos")) {
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
}
