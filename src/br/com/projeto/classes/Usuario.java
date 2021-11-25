package br.com.projeto.classes;

public class Usuario {

    private String login;
    private String senha;
    private int cotamaxima;
    private int saldocota;
    private boolean statususuario;

    public Usuario(String login, String senha,int saldocota, boolean statususuario) {
        this.setLogin(login);
        this.setSenha(senha);
        this.setCotamaxima(300);
        this.setSaldocota(300);
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

    public int verificaSaldo(){
        return this.getSaldocota();
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

    public int getCotamaxima() {
        return cotamaxima;
    }

    public void setCotamaxima(int cotamaxima) {
        if (cotamaxima <= 0){
            throw new RuntimeException("Cota não pode ser abaixo de 0.");
        }
        this.cotamaxima = cotamaxima;
    }

    public int getSaldocota() {
        return saldocota;
    }

    public void setSaldocota(int saldocota) {
        if (saldocota <= 0){
            throw new RuntimeException("Saldo de cota nao pode ser abaixo de 0!");
        }
        this.saldocota = saldocota;
    }

    public boolean isStatususuario() {
        return statususuario;
    }

    public void setStatususuario(boolean statususuario) {
        this.statususuario = statususuario;
    }
}// fim classe usuario


