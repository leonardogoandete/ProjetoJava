package br.com.projeto.testes;

import br.com.projeto.classes.Administrador;
import br.com.projeto.classes.Setor;
import br.com.projeto.classes.Supervisor;
import br.com.projeto.classes.Usuario;

public class testaUsuario {
    public static void main(String[] args) {
        Setor rh = new Setor("Recursos Humanos",300);
        Usuario leo = new Usuario("leo_goandete","154545",true);

        leo.verificaLogin("leo_goandete","154545");

        Supervisor l = new Supervisor("ll","258re",true);

        System.out.println(l.consultaSaldoUsuario(leo));

        Administrador adm = new Administrador("admin","root",true);

        adm.servicos.verificaStatusSolicitacao();


    }
}
