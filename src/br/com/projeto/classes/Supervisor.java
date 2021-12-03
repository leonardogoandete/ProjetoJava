package br.com.projeto.classes;

public class Supervisor extends Usuario{

    public Supervisor(String login, String senha, boolean statususuario) {
        super(login, senha, statususuario);
    }

    public void aprovaSolicitacoes(Solicitacao solicitacao){
        //solicitacao.getNumPedido();
        //solicitacao.statusSolicitacao(1);
    }

    public void reprovaSolicitacoes(Solicitacao solicitacao){
        //solicitacao.getNumPedido();
        //solicitacao.statusSolicitacao(1);
    }

    public int consultaSaldoUsuario(Usuario usuario){
       return usuario.getSaldoCota();
    }

    public int verificaLimiteSetor(Setor setor){
       return setor.getCotaLiberada();
    }


}
