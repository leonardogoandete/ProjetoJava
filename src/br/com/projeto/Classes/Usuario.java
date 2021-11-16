package br.com.projeto.Classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String login;
    private int cotaMaxima,saldoCota;
    private boolean statusUsuario;
    private List<Item> itens = new ArrayList<Item>();

    public Usuario(String login, boolean statusUsuario) {
        this.login = login;
        this.statusUsuario = statusUsuario;
    }


    public void verificaLogin(){

    }

    public void solicitaItens(){

    }

    public void verificaSaldo(){

    }

    public Situacao statusSolicitacao(){
        return Situacao.APROVADO;
    }

    public Item consultaItens(){

        return null;
    }

   // public br.com.projeto.Classes.Setor getSetor(){

       // return null;
   // }

    // getter e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public void setSaldoCota(int saldoCota) {
        this.saldoCota = saldoCota;
    }

    public boolean isStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", cotaMaxima=" + cotaMaxima +
                ", saldoCota=" + saldoCota +
                ", statusUsuario=" + statusUsuario +
                '}';
    }
}
