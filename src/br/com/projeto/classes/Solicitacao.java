package br.com.projeto.classes;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Solicitacao {
    private int numPedido;
    private LocalDate dataPedido;
    private LocalDate dataRetirada;
    private boolean pedidoRetirado;
    private Usuario usuario;
    private Situacao status;
    private ArrayList<Item> itens = new ArrayList<>();


    public Solicitacao(Usuario usuario, int nPedido) {
        this.setUsuario(usuario);
        this.setNumPedido(nPedido);
        this.setDataPedido(LocalDate.now());
        this.setPedidoRetirado(false);
        this.setStatus(Situacao.PENDENTE);
    }

    //   getters e setters
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
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

    public Situacao getStatus() {
        return status;
    }

    public void setStatus(Situacao status) {
        this.status = status;
    }
}
