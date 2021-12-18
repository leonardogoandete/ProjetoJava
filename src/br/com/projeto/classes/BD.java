package br.com.projeto.classes;



import java.util.ArrayList;



public class BD {
    // public static List<Cliente> clientes = new ArrayList<Cliente>();
    // public static List<Produto> produtos = new ArrayList<Produto>();
    public static ArrayList<Item> bdItens = new ArrayList<Item>();

    public void criaItens() {

        Item i;
        i = new Item("Lapis","Lapis ponta fina 3B","insumo",12,2.35f);
        bdItens.add(i);
        i = new Item("Caneta","Caneta Azul","insumo",20,1.80f);
        bdItens.add(i);
        i = new Item("Monitor","Monitor 24polegadas","material TI", 5,492.50f);
        bdItens.add(i);
    }
}
