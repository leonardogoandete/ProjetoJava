package br.com.projeto.Classes.Usuarios;

import br.com.projeto.Classes.Item;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String login,senha;
    private int cotaMaxima,saldoCota;
    private boolean statusUsuario;
    private List<Item> itens = new ArrayList<Item>();

    public Usuario(String login,String senha) {
        setLogin(login);
        setSenha(senha);
        setCotaMaxima(300);
        setStatusUsuario(true);
    }


    public void verificaLogin(String loginx, String senha){
        if (loginx.equals(getLogin()) && senha.equals("123456") && isStatusUsuario() == true) {
            System.out.println("Login Realizado!");
        }else{
            if (isStatusUsuario() == false){
                System.out.println("Usuario bloqueado");
            }else {
                System.out.println("Login Invalido!");
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
