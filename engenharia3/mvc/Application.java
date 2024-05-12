package engenharia3.mvc;

import engenharia3.mvc.Composite.Order;
import engenharia3.mvc.Composite.OrderItem;
import engenharia3.mvc.controller.OrderController;
import engenharia3.mvc.observer.OrderView;
import engenharia3.mvc.strategy.CardPaymentStrategy;;

public class Application {
    public static void main(String[] args) {
        Order order = new Order();
        OrderController controller = new OrderController(order, new OrderView());

        OrderItem coffee = new OrderItem("Café", 5.0);
        OrderItem croissant = new OrderItem("Croissant", 7.0);
        controller.addItemToOrder(coffee);
        controller.addItemToOrder(croissant);

        controller.setPaymentStrategy(new CardPaymentStrategy());
        controller.displayOrder();

        double totalAmount = order.getTotalAmount();
        order.processPayment(totalAmount);
    }
}