package br.com.projeto.classes;

import java.util.ArrayList;

public class BD {
    public static ArrayList<Item> bdItens = new ArrayList();

    public static void criaItens() {
        Item i;
        i = new Item("Lapis", "Lpais de desenho", "escritorio", 20, 2.53f);
        bdItens.add(i);
        i = new Item("Caneta", "Caneta azul", "escritorio", 12, 1.89f);
        bdItens.add(i);
    }
}