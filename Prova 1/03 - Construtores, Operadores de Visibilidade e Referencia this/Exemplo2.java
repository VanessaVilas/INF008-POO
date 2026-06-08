import java.util.Vector;

class Product {
    private String name;
    private float price;

    public Product() {
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - " + price);
    }
}

class Order {
    public Vector<Product> products;
    public String deliveryPlace;
    public Status status;

    enum Status {
        SUBMITTED,
        PAID,
        PACKAGED,
        SENT,
        RECEIVED,
        CANCELED
    }

    public void cancel() {
        status = Status.CANCELED;
    }
}

class Exemplo2 {
    public static void main(String args[]) {
        Product p1 = new Product("CERVEJA LOCAL", 3.00f);
        Product p2 = new Product();
        //System.out.println(p1.name + " - " + p1.price);
        p1.display();

        // Order o1 = new Order();
        // o1.cancel();
        // System.out.println(o1.status);
    }
}
