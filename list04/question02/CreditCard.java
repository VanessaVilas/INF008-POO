class CreditCard implements Payable {
    private String cardNumber;
    private double limit;

    public CreditCard (String cardNumber, double limit) {
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado no cartão " + cardNumber);
    }
}