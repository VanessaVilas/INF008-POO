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
    public Status status = Status.CREATED;

    public Order() {
        System.out.println("Olá mundo!");
    }
    // protected void finalize() {
    //     System.out.println("Tchau mundo!");
    // }

    enum Status {
        CREATED,
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
    private static String cancelReason;

    public static void cancelOrder(Order o) { // Por valor (cópia)
        cancelOrder(o, "<no-cancel-reason>");
    }
    public static void cancelOrder(Order o, String reason) { // Por valor (cópia)
        o.cancel();
        cancelReason = reason;
    }
    public static void main(String args[]) {
        Order o1 = null;
        {
            o1 = new Order();
            System.out.println(o1.status);
//            cancelOrder(o1);
            cancelOrder(o1, "NAO GOSTEI!");
//            o1.finalize();
            System.out.println(o1.status);
        }
        o1 = null; // object order has zero references
        System.out.println("Antes do GC!");
        // System.gc(); // Execute o GC neste momento
        System.out.println("Depois do GC!");
        System.out.println(o1.status);

        Product p1 = new Product("CERVEJA LOCAL", 3.00f);
//        Product p2 = new Product();
        p1.display();
    }
}
