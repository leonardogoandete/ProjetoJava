package br.com.projeto.classes;


import java.time.LocalDate;


public class app {
    public static void main(String[] args) {
        Servico servico;
        Setor rh = new Setor("Recursos Humanos",1000);
        Item lapis = new Item("Lapis","Lapis ponta fina 3B","insumo",12,2.35f);
        Item caneta = new Item("Caneta","Caneta Azul","insumo",20,1.80f);
        Item monitor = new Item("Monitor","Monitor 24polegadas","material TI", 5,492.50f);
        Usuario leonardo = new Usuario("leo_goandete","12345",true,rh);




        Solicitacao sol1 = new Solicitacao(leonardo,1);

        System.out.println(sol1.getDataPedido());
        sol1.adicionaItem(lapis);
        sol1.setDataRetirada(LocalDate.of(2022,2,23));
        System.out.println(sol1.getDataRetirada());







    }
}
