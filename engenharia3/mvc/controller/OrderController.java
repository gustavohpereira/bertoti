package engenharia3.mvc.controller;

import engenharia3.mvc.Composite.Order;
import engenharia3.mvc.Composite.OrderItem;
import engenharia3.mvc.observer.OrderView;
import engenharia3.mvc.strategy.PaymentStrategy;

public class OrderController {
    private Order order;
    private OrderView view;

    public OrderController(Order order, OrderView view) {
        this.order = order;
        this.view = view;
    }

    public void addItemToOrder(OrderItem item) {
        order.addItem(item);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        order.setPaymentStrategy(paymentStrategy);
    }

    public void displayOrder() {
        view.displayOrder(order);
    }
}