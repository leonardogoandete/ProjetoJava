package br.com.projeto.classes;


import java.time.LocalDate;


public class app {
    public static void main(String[] args) {

        Setor rh = new Setor("Recursos Humanos",1000);
        Item lapis = new Item("Lapis","Lapis ponta fina 3B","insumo",12,2.35f);
        Item caneta = new Item("Caneta","Caneta Azul","insumo",20,1.80f);
        Item monitor = new Item("Monitor","Monitor 24polegadas","material TI", 5,492.50f);
        Usuario leonardo = new Usuario("leo_goandete","12345",true,rh);
        Supervisor sup1 = new Supervisor("sup1","1234",true,rh);



        Solicitacao sol1 = new Solicitacao(leonardo,1);
        Solicitacao sol2 = new Solicitacao(leonardo,3);




    }
}
