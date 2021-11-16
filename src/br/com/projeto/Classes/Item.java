package br.com.projeto.Classes;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome, descricao, tipo;
    private int qtde;
    private float valor;
    private List<Setor> setores = new ArrayList<Setor>();

    public Item() {    }

    public Item(String nome, String descricao, String tipo, int qtde, float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.qtde = qtde;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "br.com.projeto.Classes.Item{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", qtde=" + qtde +
                ", valor=" + valor +
                '}';
    }

    public List<Setor> SetorAutorizadoSolicitarItem() {
    //public void SetorAutorizadoSolicitarItem(br.com.projeto.Classes.Item itens) {

        Setor info = new Setor("informatica");
        Setor rh = new Setor("Recursos Humanos");
        setores.add(info);
        setores.add(rh);

        return setores;
    }
}




