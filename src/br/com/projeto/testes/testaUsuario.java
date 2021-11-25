package br.com.projeto.testes;

import br.com.projeto.classes.Usuario;

public class testaUsuario {
    public static void main(String[] args) {
        Usuario leo = new Usuario("leo_goandete","154545",200,true);

        leo.verificaLogin("leo_goandete","154545");
    }
}
