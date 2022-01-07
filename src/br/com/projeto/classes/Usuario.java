package br.com.projeto.classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String login;
    private String senha;
    private int cotaMaxima;
    private int saldoCota;
    private boolean status;
    private Setor setor;
    private ArrayList<Solicitacao> solicitacoes = new ArrayList<>();

    public Usuario(String login, String senha, boolean statususuario, Setor setor) {
        this.setLogin(login);
        this.setSenha(senha);
        saldoCota = 300;
        this.setStatususuario(statususuario);
        this.setSetor(setor);
    }

    public boolean verificaLogin(String login, String senha){
        boolean x = false;
        if(this.getLogin().equals(login) && this.getSenha().equals(senha) && this.isStatususuario() == true){
            x= true;
        }
        if (this.getSenha().equals(senha) == false){
            x = false;
        }
        return x;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (login == null){
            throw new RuntimeException("Nome de login nulo!");
        }
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null){
            throw new RuntimeException("Senha nao pode ser nulo!");
        }
        if (senha.length() <= 3){
            throw new RuntimeException("Senha pequena!");
        }
        this.senha = senha;
    }

    public int getSaldoCota() {
        return saldoCota;
    }

    public boolean isStatususuario() {
        return status;
    }

    public void setStatususuario(boolean status) {
        this.status = status;
    }

    public String getSetor() {
        return setor.getNome();
    }

    public void setSetor(Setor setor) {
        if (setor == null){
            throw new RuntimeException("Setor nao pode ser abaixo nulo!");
        }
        this.setor = setor;
    }

    public int verificaSaldo(){
        return getSaldoCota();
    }

    public void adicionaSolicitacao(List<Item> itens){

    }
    public void retiraPedido(Solicitacao s){
        if(s.getStatus().equals(Situacao.APROVADO)) {
            s.setPedidoRetirado(true);
        }else if(s.getStatus().equals(Situacao.REPROVADO)) {
            throw new RuntimeException("Pedido Reprovado");
        }else if(s.getStatus().equals(Situacao.PENDENTE)) {
            throw new RuntimeException("Pedido Pendente");
        }
    }

} // fim classe usuario


