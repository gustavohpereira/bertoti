package engenharia3.mvc.observer;

import engenharia3.mvc.Composite.Order;
import engenharia3.mvc.Composite.OrderItem;

public class OrderView {
    public void displayOrder(Order order) {
        System.out.println("Itens do Pedido:");
        for (OrderItem item : order.getItems()) {
            System.out.println("- " + item.getItemName() + ": R$" + item.getPrice());
        }
        System.out.println("Total: R$" + order.getTotalAmount());
    }


    public void notifyAddItems(Order order) {
        System.out.println("Novo item adicionado ao pedido:");
        displayOrder(order);
    }
}
