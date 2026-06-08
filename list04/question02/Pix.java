class Pix implements Payable {
    private String key;

    public Pix(String key) {
        this.key = key;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado via PIX para a chave " + key);
    }
}