package br.com.projeto.classes;

import br.com.projeto.negocio.Servico;

import java.security.Provider;

public class Usuario {

    private String login;
    private String senha;
    private int cotamaxima;
    private int saldocota;
    private boolean statususuario;
    private Setor setor;
    public Servico servicos;

    public Usuario(String login, String senha, boolean statususuario) {
        this.setLogin(login);
        this.setSenha(senha);
        saldocota = 300;
        this.setStatususuario(statususuario);
    }

    public void verificaLogin(String login, String senha){
        if(this.getLogin().equals(login) && this.getSenha().equals(senha) && this.isStatususuario() == true){
            System.out.println(this.getLogin()+" Logado!");
            //return true;
        }
        if (this.getSenha().equals(senha) == false){
            throw new RuntimeException("Senha invalida!");
        }
        //return false;
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
        return saldocota;
    }

    public boolean isStatususuario() {
        return statususuario;
    }

    public void setStatususuario(boolean statususuario) {
        this.statususuario = statususuario;
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
}// fim classe usuario


