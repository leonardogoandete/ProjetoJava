package br.com.projeto.Classes;

public enum Situacao {
    APROVADO("Aprovado"), REPROVADO("Reprovado"), PENDENTE("Pendente"),  AGUARDANDO("Aguardando"), CANCELADO("Cancelado");

    private String valor;
    Situacao(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
