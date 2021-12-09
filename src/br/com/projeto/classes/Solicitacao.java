package br.com.projeto.classes;


import java.util.List;

public class Solicitacao {
    private int numPedido;
    private int dataPedido;
    private int dataRetirada;
    private boolean pedidoRetirado;
    private Usuario usuario;
    private List<Item> itens;


    public Solicitacao(Usuario usuario, int nPedido, int dtPedido, int dtRetirada, boolean pedRetirado) {
        this.setUsuario(usuario);
        this.setNumPedido(nPedido);
        this.setDataPedido(dtPedido);
        this.setDataRetirada(dtRetirada);
        this.setPedidoRetirado(pedRetirado);
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        if (usuario == null){
            throw new RuntimeException("Usuario da solicitacao nao pode ser nulo!");
        }
        this.usuario = usuario;
    }

}
