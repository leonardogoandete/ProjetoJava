package br.com.projeto.bancodados;

import br.com.projeto.classes.Setor;
import br.com.projeto.classes.Usuario;
import br.com.projeto.negocio.Item;
import br.com.projeto.negocio.Solicitacao;


import java.util.ArrayList;

public class bd {
    public static ArrayList<Item> itens = new ArrayList<Item>();
    public static ArrayList<Setor> setores = new ArrayList<>();
    public static ArrayList<Solicitacao> solicitacoes = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void criaItens(){
        itens.add(new Item("Caneta","Caneta azul","escritorio",20,2.89f));
        itens.add(new Item("Caneta","Caneta rosa","escritorio",12,4.89f));
        itens.add(new Item("Monitor","Monitor 20 pol","ti",10,899.64f));
    }

    public static void criaSetores(){
        setores.add(new Setor("Recursos Humanos"));
        setores.add(new Setor("Tecnologia"));
        setores.add(new Setor("Almoxarifado"));
    }

}
