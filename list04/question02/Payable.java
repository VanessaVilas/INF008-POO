interface Payable {
    public abstract void pay(double amount);
    public default void receipt() {
        System.out.println("Pagamento realizado com sucesso!");
    }
}