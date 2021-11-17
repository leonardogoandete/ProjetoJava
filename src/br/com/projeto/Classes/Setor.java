package br.com.projeto.Classes;

import br.com.projeto.Classes.Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;
public class Setor {

    private String nome;
    private List<Item> itens = new ArrayList<Item>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public Setor(){}
    public Setor(String nome) {
        this.nome = nome;
    }


    public List<Item> itensLiberados(String nome_setor) {
        if (nome_setor.equals("Informatica")) {
            Item pc = new Item("PC", "PC de mesa", "TI", 10, 238.89f);
            Item note = new Item("Notebook", "Note RH", "TI", 3, 1238.89f);

            itens.add(pc);
            itens.add(note);
            return itens;
        }
        if(nome_setor.equals("RH")){
            Item pc = new Item("Mouse", "mouse USB", "TI", 5, 25.99f);
            Item note = new Item("Teclado", "Teclado", "TI", 3, 1238.89f);

            itens.add(pc);
            itens.add(note);
            return itens;
        }
        return null;
    }

    public int cotaLiberadaSetor(){

        return 0;
    }

    public List<Usuario> getUsuarios(){
        //List<Usuario> usuarios = new Usuario();

        return null;
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
