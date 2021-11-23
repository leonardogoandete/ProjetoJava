package br.com.projeto.Classes;

public class Setor {
    private String nome;

    // contrutor
    public Setor(String addNome) {
        setNome(addNome);
    }


    public int cotaLiberadaSetor(){
        int cota_setor = 0;
        if(this.getNome().equals("rh")) { cota_setor = 1000;}
        if(this.getNome().equals("ti")){ cota_setor = 1500;}

        return cota_setor;
    }

    public void itensLiberados(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
