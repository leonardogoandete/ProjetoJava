package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Item;
import java.util.ArrayList;


public class testItem {

    public static void main(String[] args) {
        ArrayList<Item> item = new ArrayList<>();

        item.add(new Item("Lapis","Lapis para escrever","insumo",20,1.75f));
    }
}
