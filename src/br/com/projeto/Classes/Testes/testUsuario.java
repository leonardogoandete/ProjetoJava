package br.com.projeto.Classes.Testes;
import br.com.projeto.Classes.Usuarios.Usuario;

public class testUsuario {
    public static void main(String[] args) {
        Usuario leo = new Usuario("leo_goandete","123456");
        Usuario lari = new Usuario("laris","jujuba");

        lari.verificaLogin("lari","aad8141556");
        leo.verificaLogin("leo_goandete","123456");
        leo.setSaldoCota(200);
        leo.verificaSaldo();
        System.out.println(leo.toString());
    }
}
