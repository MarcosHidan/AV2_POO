package br.newtonpaiva.com;

import br.newtonpaiva.com.Categoria;
import br.newtonpaiva.com.Evento;

public class Main {
    public static void main(String[] args) {
        // Criar eventos
        Evento evento1 = new Evento("Concerto", "2023-12-01", 50.0, "Concerto ao vivo");
        Evento evento2 = new Evento("Teatro", "2023-12-02", 30.0, "Peça de teatro");
        Evento evento3 = new Evento("Cinema", "2023-12-03", 15.0, "Exibição de filme");
        Evento evento4 = new Evento("Esporte", "2023-12-04", 40.0, "Partida de futebol");
        Evento evento5 = new Evento("Conferência", "2023-12-05", 25.0, "Conferência de tecnologia");

        // Criar categorias
        Categoria categoria1 = new Categoria("br.newtonpaiva.com.Categoria A", "br.newtonpaiva.com.Categoria premium", 50.0);
        Categoria categoria2 = new Categoria("br.newtonpaiva.com.Categoria B", "br.newtonpaiva.com.Categoria padrão", 30.0);

        // Criar pedidos
        Pedido pedido1 = new Pedido(1, "2023-11-30", 1, 0, categoria1);
        Pedido pedido2 = new Pedido(2, "2023-11-30", 1, 0, categoria2);

        // Criar itens de pedido
        PedidoItem item1 = new PedidoItem(evento1, 2);
        PedidoItem item2 = new PedidoItem(evento2, 1);
        PedidoItem item3 = new PedidoItem(evento3, 3);
        PedidoItem item4 = new PedidoItem(evento4, 2);
        PedidoItem item5 = new PedidoItem(evento5, 4);

        // Inserir eventos no pedido
        pedido1.inserirItensPedido(item1);
        pedido1.inserirItensPedido(item2);
        pedido1.inserirItensPedido(item3);

        pedido2.inserirItensPedido(item4);
        pedido2.inserirItensPedido(item5);

        // Excluir item do pedido
        pedido1.excluirItensPedido(item2);

        // Alterar status do pedido
        pedido1.alterarStatus(2);
        pedido2.alterarStatus(2);

        // Calcular total a pagar
        double totalPagarPedido1 = pedido1.calculaTotalPagar();
        double totalPagarPedido2 = pedido2.calculaTotalPagar();

        // Exibir resultados
        System.out.println("Total a pagar no Pedido 1: " + totalPagarPedido1);
        System.out.println("Total a pagar no Pedido 2: " + totalPagarPedido2);
    }
}