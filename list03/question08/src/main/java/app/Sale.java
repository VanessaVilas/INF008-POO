package app;

// Implemente classes de domínio para representar venda e relatório.
public class Sale {
    private String product;
    private int quantity;
    private double price;

    public Sale(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getTotal() {
        return quantity * price;
    }
}