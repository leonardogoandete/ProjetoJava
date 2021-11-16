package br.com.projeto;
import br.com.projeto.Classes.Usuario;

public class testUsuario {
    public static void main(String[] args) {
        Usuario leo = new Usuario("leo_goandete",true);

        leo.setSaldoCota(200);

        System.out.println(leo.toString());
    }
}
