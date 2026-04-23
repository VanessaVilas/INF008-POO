import java.util.UUID;

// Questão 2: Sistema de Caixa com Operações Financeiras 
// Implemente uma classe CashRegister que simula um caixa registrador:
class CashRegister {
    // Requisitos:
    // Atributos privados: currentBalance (double), transactionCount (int), registerId (String) 
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    // Construtores sobrecarregados (pelo menos 3 variações com diferentes combinações de parâmetros)
    public CashRegister() {
        this(0, 0);
    }
    public CashRegister(double currentBalance) {
        this(currentBalance, 0);
    }
    public CashRegister(double currentBalance, int transactionCount) {
        this.currentBalance = currentBalance;
        this.transactionCount = transactionCount;
        registerId = UUID.randomUUID().toString().substring(0, 8);
    }

    // Métodos públicos para operações: 
    // processPayment(double amount) - processa um pagamento 
    public void processPayment(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            transactionCount++;
            System.out.println("Pagamento realizado.");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void processPayment(int amount) {
        processPayment((double) amount);
    }
    public void processPayment(double amount, String description) {
        processPayment(amount);
        System.out.println("Descrição: " + description);
    }

    // processRefund(double amount) - processa um reembolso
    public void processRefund(double amount) {
        if (amount > 0) {
            if (currentBalance >= amount) {
                currentBalance -= amount;
                transactionCount++;
                System.out.println("Reembolso realizado.");
            } else {
                System.out.println("Saldo insuficiente para reembolso!");
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }

    // getDailyReport() - retorna relatório do dia 
    public void getDailyReport() {
        System.out.println("=== Relatório ===");
        System.out.println("ID do registro: " + registerId);
        System.out.println("Saldo atual: " + currentBalance);
        System.out.println("Contagem de transações: " + transactionCount);
    }

    // Sobrecarga de métodos: Implemente versões sobrecarregadas dos métodos de pagamento que aceitam diferentes parâmetros (valor em double, 
    // valor em int, valor com descrição)
}

public class Question02 {
    public static void main(String []args) {
        CashRegister c1 = new CashRegister();

        c1.processPayment(50.0);
        c1.processPayment(20);
        c1.processPayment(30.0, "Compra de produto");

        c1.processRefund(10.0);

        c1.getDailyReport();
    }
}