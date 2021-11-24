package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Setor;
import br.com.projeto.Classes.Solicitacao;
import br.com.projeto.Classes.Usuarios.Usuario;

public class testSolicitacao {
    public static void main(String[] args) {
        Setor ti = new Setor("Tecnologia");
        Usuario leo = new Usuario("leo_goandete","Strigus",ti);
            Solicitacao pedido1 = new Solicitacao(leo,001,221121, 301121, false);


            System.out.println("Usuario:"+pedido1.getUsuario().getLogin());
            System.out.println("Nmro pedido: " + pedido1.getNumPedido());
            System.out.println("Data pedido: "+ pedido1.getDataPedido());
            System.out.println("Data retirada: "+ pedido1.getDataRetirada());
            System.out.println(pedido1.statusSolicitacao(3));

    }
}
