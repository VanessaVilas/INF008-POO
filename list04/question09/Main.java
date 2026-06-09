public class Main {
    public static void main(String[] args) throws Exception {
        Product p = new Product("Notebook", 3499.90, 10);
        ObjectInspector inspector = new ObjectInspector();
        inspector.inspect(p);
        // Saída esperada (um campo por linha):
        // [String] name = Notebook
        // [double] price = 3499.9
        // [int] stock = 10
    }
}