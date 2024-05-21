import java.util.List;

import classes.SistemaPedidoFacade;
import classes.Pedido;

public class Application {
   

    public static void main(String[] args) {
        SistemaPedidoFacade sistema = new SistemaPedidoFacade();
        
        sistema.registrarPedidos("Pizza", 25, 2, "Pizza de Calabresa");
        sistema.registrarPedidos("Refrigerante", 5, 3, "Lata de 350ml");
        
        sistema.imprimirPedidos();
        
        sistema.aplicarDescontoEmPedido(0, 10); 
        
        sistema.imprimirPedidos();
        
        System.out.println("Preço total dos pedidos: " + sistema.getPrecoTotal());
    }

}
