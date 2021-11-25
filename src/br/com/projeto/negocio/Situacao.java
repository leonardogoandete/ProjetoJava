package br.com.projeto.negocio;

public enum Situacao {
    APROVADO("Aprovado"), REPROVADO("Reprovado"), PENDENTE("Pendente"),  AGUARDANDO("Aguardando"), CANCELADO("Cancelado");

    private String valor;
    Situacao(String vl){
        setValor(vl);
    }

    public String getValor(){
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
