package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Solicitacao;

public class testSolicitacao {
    public static void main(String[] args) {
        Solicitacao pedido1 = new Solicitacao(001,5890,5897,false);

        System.out.println("Nmro pedido: "+pedido1.getNumPedido());
        System.out.println(pedido1.getDataPedido());
        System.out.println(pedido1.statusSolicitacao(4));

    }
}
