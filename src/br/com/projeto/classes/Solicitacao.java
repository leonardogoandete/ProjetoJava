package br.com.projeto.classes;


import java.util.Date;
import java.util.List;

public class Solicitacao {
    private int numPedido;
    private Date dataPedido;
    private Date dataRetirada;
    private boolean pedidoRetirado;
    private Usuario usuario;
    private List<Item> itens;


    public Solicitacao(Usuario usuario, int nPedido, Date dtPedido) {
        this.setUsuario(usuario);
        this.setNumPedido(nPedido);
        this.setDataPedido(dtPedido);
        this.setPedidoRetirado(false);
    }

    //public Situacao statusSolicitacao(){

    //}

    // getters e setters
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
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

    public void adicionaItem(Item i){
        itens.add(i);
    }

}
