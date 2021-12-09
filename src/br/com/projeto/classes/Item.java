package br.com.projeto.classes;


import java.util.List;

public class Item {
    private String nome;
    private String descricao;
    private String tipo;
    private int qtde;
    private float valor;

    public Item(String xnome, String xdescricao, String xtipo, int xqtde, float xvalor) {
        this.setNome(xnome);
        this.setDescricao(xdescricao);
        this.setTipo(xtipo);
        this.setQtde(xqtde);
        this.setValor(xvalor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 3){
            throw new RuntimeException("Nome muito pequeno!");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null){
            throw new RuntimeException("Descricao nao pode ser nula!");
        }
        if (descricao.length() <= 5){
            throw new RuntimeException("Descricao muito curta!");
        }
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
        if (qtde < 0){
            throw new RuntimeException("Quantidade nao pode ser negativo!");
        }
        this.qtde = qtde;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor <= 0){
            throw new RuntimeException("Valor nao pode ser negativo!");
        }
        this.valor = valor;
    }

    public Setor setoresAutorizados(){

        return null;
    }

    public List<Solicitacao> solicitacoes(){

        return null;
    }
}




