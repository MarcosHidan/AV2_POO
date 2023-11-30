package br.newtonpaiva.com;

import java.util.ArrayList;

class Pedido {
    private int numeroPedido;
    private String dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private int qtdeIngresso;
    private Categoria categoria;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido, String dataHoraPedido, int statusPedido, int qtdeIngresso, Categoria categoria) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.statusPedido = statusPedido;
        this.qtdeIngresso = qtdeIngresso;
        this.categoria = categoria;
        this.itensPedido = new ArrayList<>();
    }

    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    public void inserirItensPedido(PedidoItem itemPedido) {
        // Validar se o evento do item existe
        if (itemPedido != null && itemPedido.getEvento() != null && !itensPedido.contains(itemPedido)) {
            itensPedido.add(itemPedido);
            this.qtdeIngresso += itemPedido.getQtdeIngresso();
            // Atualizar o estoque de ingressos do evento
            itemPedido.atualizaEstoqueIngresso();
        } else {
            System.out.println("Erro: O evento do item não existe ou o item já foi adicionado ao pedido.");
        }
    }

    public void excluirItensPedido(PedidoItem itemPedido) {
        if (itensPedido.contains(itemPedido)) {
            itensPedido.remove(itemPedido);
            this.qtdeIngresso -= itemPedido.getQtdeIngresso();
        } else {
            System.out.println("Erro: O item do pedido não existe.");
        }
    }

    public double calculaTotalPagar() {
        double totalPagar = 0.0;
        for (PedidoItem item : itensPedido) {
            totalPagar += item.getQtdeIngresso() * item.getEvento().getPrecoEvento();
        }
        this.precoTotal = totalPagar;
        return totalPagar;
    }

    private boolean buscarEvento(Evento evento) {
        for (PedidoItem item : itensPedido) {
            if (item.getEvento().buscarEvento(evento)) {
                return true;
            }
        }
        return false;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(String dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}