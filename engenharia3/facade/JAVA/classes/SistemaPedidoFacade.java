package classes;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidoFacade {
    
    private List<Pedido> pedidos = new ArrayList<>(); 

    public List<Pedido> getPedidos() { 
        return pedidos;
    }

    public void registrarPedidos(String nome, int preco, int quantidade, String descricao) { 
        Pedido novoPedido = new Pedido(nome, preco, quantidade, descricao);
        pedidos.add(novoPedido);
    }

    public int getPrecoTotal() { 
        int totalPreco = 0;
        for (Pedido pedido : pedidos) {
            totalPreco += pedido.calcularPrecoTotal();
        }
        return totalPreco;
    }

    public void imprimirPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.exibirDetalhes();
        }
    }

    public void aplicarDescontoEmPedido(int indice, double percentual) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.get(indice).aplicarDesconto(percentual);
        } else {
            throw new IndexOutOfBoundsException("Índice de pedido inválido.");
        }
    }

    public void removerDescontoDePedido(int indice) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.get(indice).removerDesconto();
        } else {
            throw new IndexOutOfBoundsException("Índice de pedido inválido.");
        }
    }
}