package br.com.projeto.classes;


public class Supervisor extends Usuario{

    public Supervisor(String login, String senha, boolean statususuario, Setor setor) {
        super(login, senha, statususuario, setor);
    }

    public void aprovaSolicitacoes(Solicitacao x){
        Solicitacao test = x;

        test.setStatus(Situacao.APROVADO);
    }

    public void reprovaSolicitacoes(Solicitacao solicitacao){
        Solicitacao test = solicitacao;
        test.setStatus(Situacao.REPROVADO);
    }

    public int consultaSaldoUsuario(Usuario usuario){
       return usuario.getSaldoCota();
    }

    public int verificaLimiteSetor(Setor setor){
       return setor.getCotaLiberada();
    }


}
