package engenharia3.mvc.Composite;



public class OrderItem {
    private String itemName;
    private double price;

    public OrderItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}