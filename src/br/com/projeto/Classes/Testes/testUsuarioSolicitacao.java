package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Item;
import br.com.projeto.Classes.Setor;
import br.com.projeto.Classes.Solicitacao;
import br.com.projeto.Classes.Usuarios.Usuario;

public class testUsuarioSolicitacao {
    public static void main(String[] args) {
        Setor ti = new Setor("Tecnologia");
        Usuario leo = new Usuario("leo","Strigus",ti);
        Item item = new Item("Pincel","Pincel de pintura","Ferramenta",5,2.81f);
        Solicitacao sol1 = new Solicitacao(leo,100,221121,241121,false);


        System.out.println("Usuario solicitante:"+sol1.getUsuario().getLogin());
        System.out.println("Pedido retirado:"+sol1.isPedidoRetirado());
        System.out.println("Item solicitado:"+item.getNome()+" valor: R$"+item.getValor());


    }
}
