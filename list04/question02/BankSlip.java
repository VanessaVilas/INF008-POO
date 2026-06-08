class BankSlip implements Payable {
    private String dueDate;

    public BankSlip(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado por boleto. Vencimento: " + dueDate);
    }
}