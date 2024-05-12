package engenharia3.mvc.strategy;

public class MoneyPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " feito com Dinheiro.");
    }
}
