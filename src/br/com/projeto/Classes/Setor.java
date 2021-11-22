package br.com.projeto.Classes;
import br.com.projeto.Classes.Item;
public class Setor {
    private Item x;
    private String nome;
    // contrutor
    public Setor(String nome) {
        this.nome = nome;
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

    @Override
    public String toString() {
        return "br.com.projeto.Classes.Setor | nome=" + nome+"\n";
    }
}
