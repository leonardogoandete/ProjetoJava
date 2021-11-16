package br.com.projeto;

import br.com.projeto.Classes.Setor;

public class testSetor {
    public static void main(String[] args) {
        Setor y = new Setor();
        Setor x = new Setor();
        System.out.println("\n"+y.itensLiberados("Informatica"));
        System.out.println(x.itensLiberados("RH"));
    }
}
