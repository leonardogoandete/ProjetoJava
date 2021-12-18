package br.com.projeto.classes;


import java.util.List;

public class Item {
    private int cod;
    private String nome;
    private String descricao;
    private String tipo;
    private int qtde;
    private float valor;
    private List<Setor> setores;
    private List<Solicitacao> solicitacoes;

    public Item(int cod, String nome, String descricao, String tipo, int qtde, float valor) {
        this.setCod(cod);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setTipo(tipo);
        this.setQtde(qtde);
        this.setValor(valor);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public List<Setor> setoresAutorizados(){
        return setoresAutorizados();
    }

    public List<Solicitacao> solicitacoes(){
        return solicitacoes;
    }

    public void adicionaSetor(Setor s){

    }

    public void adicionaSolicitacao(Solicitacao s){

    }
}




