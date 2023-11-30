package br.newtonpaiva.com;

import br.newtonpaiva.com.Evento;

class PedidoItem {
    private Evento evento;
    private int qtdeIngresso;

    public PedidoItem(Evento evento, int qtdeIngresso) {
        this.evento = evento;
        this.qtdeIngresso = qtdeIngresso;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public void atualizaEstoqueIngresso() {
        System.out.println("Estoque de ingressos do evento atualizado.");
    }
}