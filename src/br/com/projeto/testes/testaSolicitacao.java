package br.com.projeto.testes;

import br.com.projeto.classes.Usuario;
import br.com.projeto.negocio.Solicitacao;

public class testaSolicitacao {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("leonardo","ajfiopjapof",200,true);

        Solicitacao sol1 = new Solicitacao(u1,0001,221121,231221,false);
    }
}
