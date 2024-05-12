import java.util.List;

import classes.SistemaPedidoFacade;
import classes.Pedido;

public class Application {
   

    public static void main(String[] args) {
        SistemaPedidoFacade sistemaPedidoFacade = new SistemaPedidoFacade();

        // Registrar novos pedidos
        sistemaPedidoFacade.registrarPedidos("Pedido 1", 100);
        sistemaPedidoFacade.registrarPedidos("Pedido 2", 200);
        sistemaPedidoFacade.registrarPedidos("Pedido 3", 300);

        
        // Obter todos os pedidos
        
        List<Pedido> pedidos = sistemaPedidoFacade.getPedidos();
        for (Pedido pedido : pedidos) {

            System.out.println("Nome do Pedido: " + pedido.getNome());
            System.out.println("Preço do Pedido: " + pedido.getPreco());
            System.out.println("----------------------");
        }

        // Obter o preço total dos pedidos
        int precoTotal = sistemaPedidoFacade.getPrecoTotal();
        System.out.println("Preço total dos pedidos: " + precoTotal);
    }

}
