package br.com.projeto.Classes.Usuarios;

import br.com.projeto.Classes.Item;
import br.com.projeto.Classes.Setor;

import java.util.List;

public class Administrador extends Usuario {
    public Administrador(String login, String senha, Setor setor) {
        super(login,senha,setor);
        this.setLogin(login);
        this.setSenha(senha);
        setTipo("admin");
    }
    private String tipoUsuario(){

        return null;
    }

    private Usuario novoUsuario(){

        return null;
    }

    private Usuario excluiUsuario(){

        return null;
    }

    private List<Usuario> statusUsuario(){

        return null;
    }

    private Item alteraItens(){

        return null;
    }

}
