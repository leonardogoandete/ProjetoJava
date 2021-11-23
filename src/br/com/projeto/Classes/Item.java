package br.com.projeto.Classes;

public class Item {
    private String nome;
    private String descricao;
    private String tipo;
    private int qtde;
    private float valor;

    public Item(String xnome, String xdescricao, String xtipo, int xqtde, float xvalor) {
        setNome(xnome);
        setDescricao(xdescricao);
        setTipo(xtipo);
        setQtde(xqtde);
        setValor(xvalor);
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

}




