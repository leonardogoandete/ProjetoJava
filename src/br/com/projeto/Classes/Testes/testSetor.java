package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Setor;

public class testSetor {
    public static void main(String[] args) {
        Setor y = new Setor("ti");
        Setor k = new Setor("rh");


        System.out.println("Cota setor "+ y.getNome()+":" + y.cotaLiberadaSetor());
        System.out.println("Cota setor "+ k.getNome()+":" + k.cotaLiberadaSetor());

    }
}
