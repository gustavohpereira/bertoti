package classes;

import java.util.List;

public class SistemaPedidoFacade {
    // Atributos (possible attributes based on the code snippet)
    private List<Pedido> pedidos; // list of orders

    //Métodos (possible methods based on the code snippet)
    public List<Pedido> getPedidos() { // get all orders
        return pedidos;
    }

    public void registrarPedidos(String nome, int preco) { // register new orders
        Pedido novoPedido = new Pedido(nome, preco);
        System.out.println(novoPedido);
        pedidos.add(novoPedido);
    }

    public int getPrecoTotal() { // get total price
        int totalPreco = 0;
        for (Pedido pedido : pedidos) {
            totalPreco += pedido.getPreco();
        }
        return totalPreco;
    }
}
