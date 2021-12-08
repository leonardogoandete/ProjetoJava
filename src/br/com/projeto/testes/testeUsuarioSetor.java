package br.com.projeto.testes;

import br.com.projeto.classes.Setor;
import br.com.projeto.classes.Usuario;

public class testeUsuarioSetor {
    public static void main(String[] args) {

        Setor rh = new Setor("Recursos Humanos",300);
        Usuario leo = new Usuario("leo_goandete","kkkcpt",true,rh);

        leo.setSetor(rh);



    }
}
