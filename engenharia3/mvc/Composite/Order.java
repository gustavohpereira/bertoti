package engenharia3.mvc.Composite;

import java.util.ArrayList;
import java.util.List;

import engenharia3.mvc.observer.OrderObserver;
import engenharia3.mvc.observer.OrderView;
import engenharia3.mvc.strategy.PaymentStrategy;

public class Order implements OrderObserver {
    private List<OrderItem> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    public void addItem(OrderItem item) {
        items.add(item);
        notifyObserver(); 
    }

    private void notifyObserver() {
        OrderView view = new OrderView();
        view.displayOrder(this);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double totalAmount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(totalAmount);
        } else {
            System.out.println("Por favor, selecione um método de pagamento.");
        }
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(OrderItem::getPrice).sum();
    }

    public List<OrderItem> getItems() {
        return items;
    }

    @Override
    public void update() {
        System.out.println("Novo item adicionado ao pedido.");
    }
}