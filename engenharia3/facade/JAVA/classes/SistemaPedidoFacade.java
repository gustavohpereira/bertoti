package classes;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidoFacade {
    
    private List<Pedido> pedidos = new ArrayList<>(); 


    public List<Pedido> getPedidos() { 
        return pedidos;
    }

    public void registrarPedidos(String nome, int preco) { 
        Pedido novoPedido = new Pedido(nome, preco);
        pedidos.add(novoPedido);
    }

    public int getPrecoTotal() { 
        int totalPreco = 0;
        for (Pedido pedido : pedidos) {
            totalPreco += pedido.getPreco();
        }
        return totalPreco;
    }
}
