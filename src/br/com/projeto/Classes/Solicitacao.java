package br.com.projeto.Classes;

public class Solicitacao {
    private int numPedido;
    private int dataPedido;
    private int dataRetirada;
    private boolean pedidoRetirado;

    public Solicitacao(int nPedido, int dtPedido, int dtRetirada, boolean pedRetirado) {
        setNumPedido(nPedido);
        setDataPedido(dtPedido);
        setDataRetirada(dtRetirada);
        setPedidoRetirado(pedRetirado);
    }

    public Situacao statusSolicitacao(int valor){
        
        switch (valor){
            case 1:
                 return Situacao.APROVADO;
            case 2:
                return Situacao.AGUARDANDO;
            case 3:
                return Situacao.CANCELADO;
            case 4:
                return Situacao.PENDENTE;
            case 5:
                return Situacao.REPROVADO;
        }
        return null;
    }

    // getters e setters
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(int dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(int dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public boolean isPedidoRetirado() {
        return pedidoRetirado;
    }

    public void setPedidoRetirado(boolean pedidoRetirado) {
        this.pedidoRetirado = pedidoRetirado;
    }


}
