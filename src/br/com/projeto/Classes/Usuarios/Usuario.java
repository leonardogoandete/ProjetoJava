package br.com.projeto.Classes.Usuarios;
import br.com.projeto.Classes.Setor;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String login;
    private String senha;
    private String tipo;
    private int cotaMaxima,x;
    private int saldoCota;
    private boolean statusUsuario;
    public Setor setor;

    public Usuario(String login,String senha) {
        this.setLogin(login);
        this.setSenha(senha);
        this.setTipo("usuario");
        this.setCotaMaxima(300);
        this.setSaldoCota(200);
        this.setStatusUsuario(true);
    }


    public void verificaLogin(String loginx, String senha){
        if (loginx.equals(getLogin()) && senha.equals(getSenha()) && isStatusUsuario() == true) {
            System.out.println("Login Realizado!");
        }else{
            if (isStatusUsuario() == false){
                System.out.println("Usuario bloqueado");
            }else {
                System.out.println("Login ou senha invalida!");
            }
        }
    }

    public void verificaSaldo(){
        setSaldoCota(getCotaMaxima()-getSaldoCota());
    }

    // getter e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCotaMaxima() {
        return cotaMaxima;
    }

    public void setCotaMaxima(int cotaMaxima) {
        this.cotaMaxima = cotaMaxima;
    }

    public int getSaldoCota() {
        return saldoCota;
    }

    private void setSaldoCota(int saldoCota) {
        this.saldoCota = saldoCota;
    }

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
