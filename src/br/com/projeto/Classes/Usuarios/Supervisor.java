package br.com.projeto.Classes.Usuarios;

import br.com.projeto.Classes.Setor;
import br.com.projeto.Classes.Solicitacao;

public class Supervisor extends Usuario{

    public Supervisor(String login,String senha, Setor setor) {
        super(login,senha,setor);
        this.setLogin(login);
        this.setSenha(senha);
        setTipo("supervisor");
    }


    private Solicitacao aprovaSolicitacao(){

        return null;
    }

    private Solicitacao reprovaSolicitacao(){
        return null;

    }

    private Usuario consultaLimiteUsuario(){
        return null;

    }

    private Setor verificaLimiteSetor(){
        return null;

    }

    private Setor totalGastoSetor(){
        return null;

    }
}
