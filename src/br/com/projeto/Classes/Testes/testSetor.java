package br.com.projeto.Classes.Testes;

import br.com.projeto.Classes.Setor;

public class testSetor {
    public static void main(String[] args) {
        Setor y = new Setor();
        Setor x = new Setor();
        System.out.println(y.itensLiberados("Contabilidade"));
        System.out.println(x.itensLiberados("RH"));
    }
}
