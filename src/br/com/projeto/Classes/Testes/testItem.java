package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Item;

import java.util.ArrayList;
import java.util.List;

public class testItem {

    public static void main(String[] args) {
        List<Item> adiciona_itens = new ArrayList<>();
        //Item teste = new Item("Caneta","Caneta Azul","insumo",50,2.12f);


        adiciona_itens.add(new Item("Caneta","Caneta Azul","insumo",50,2.12f));
        adiciona_itens.add(new Item("Caneta","Caneta Vermelha","insumo",25,2.55f));
        System.out.println("Setor autorizado a solicitar mouse:");
        for (int i=0; i < adiciona_itens.size(); i++) {
            System.out.println(adiciona_itens.get(i));
        }

    }
}
