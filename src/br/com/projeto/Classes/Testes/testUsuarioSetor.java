package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Setor;
import br.com.projeto.Classes.Usuarios.Usuario;

public class testUsuarioSetor {
    public static void main(String[] args) {
        Setor rh = new Setor("Recursos Humanos");
        Setor ti = new Setor("Tecnologia");

        Usuario leonardo = new Usuario("leo_goandete","12345",ti);

        leonardo.verificaLogin("leo_goandete","12345");
        System.out.println("Saldo:"+leonardo.getSaldoCota());
        System.out.println("Login:"+leonardo.getLogin());
        System.out.println("Perfil:"+leonardo.getTipo());
        System.out.println("Setor:"+leonardo.getSetor().getNome());

        System.out.println(leonardo.setor.itensLiberados(leonardo.getSetor().getNome()));





    }
}
