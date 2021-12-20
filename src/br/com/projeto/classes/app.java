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
        System.out.println(sol1.getDataPedido());
        sol1.adicionaItem(lapis);
        sol1.adicionaItem(caneta);
        sol1.setDataRetirada(LocalDate.of(2022,2,23));
        System.out.println(sol1.getDataRetirada());
        System.out.println(sol1.isPedidoRetirado());

        System.out.println(sol1.getStatus());
        System.out.println(sup1.consultaSaldoUsuario(leonardo));
        sup1.aprovaSolicitacoes(sol1);
        System.out.println(sol1.getStatus());

    // solicitacao 3
        sol2.adicionaItem(caneta);
        sol2.adicionaItem(monitor);
        sol2.adicionaItem(lapis);
        sol2.setDataRetirada(LocalDate.of(2022,2,25));
        System.out.println("Numero do pedido: " + sol2.getNumPedido());
        System.out.println("Status pedido: " + sol2.getStatus());
        sup1.aprovaSolicitacoes(sol2);
        leonardo.retiraPedido(sol2);
        System.out.println("=======");
        System.out.println("Numero do pedido: "+ sol2.getNumPedido());
        System.out.println("Status pedido: "+ sol2.getStatus());
        System.out.println(sol2.isPedidoRetirado());





    }
}
