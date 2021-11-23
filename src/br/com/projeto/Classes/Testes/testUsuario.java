package br.com.projeto.Classes.Testes;
import br.com.projeto.Classes.Usuarios.Usuario;

public class testUsuario {
    public static void main(String[] args) {
        Usuario leo = new Usuario("leo_goandete","123456");


        leo.verificaLogin("leo_goandete","123456");
        System.out.println("Saldo:"+leo.getSaldoCota());
        System.out.println("Login:"+leo.getLogin());
        System.out.println("Perfil:"+leo.getTipo());

        //Setor leo
        leo.setor.setNome("rh");




    }
}
