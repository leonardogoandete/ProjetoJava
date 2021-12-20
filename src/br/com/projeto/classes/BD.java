package br.com.projeto.classes;

import java.util.ArrayList;

public class BD {
    public static ArrayList<Item> bdItens = new ArrayList();

    public static void criaItens() {
        bdItens.add(new Item("Caneta", "Caneta azul", "escritorio", 12, 1.89f));
        bdItens.add(new Item("Lapis", "Lpais de desenho", "escritorio", 20, 2.53f));
    }

}