/********************************************************************************************************************************************
2. Atributos e métodos

Problema: Desenvolva uma classe ContaConsumoEnergia para controlar o consumo mensal de uma residência.

Guia de implementação:
    - Defina atributos como número da instalação, nome do titular, consumo em kWh, tarifa base e bandeira tarifária.
    - Implemente métodos para registrar consumo, calcular valor da conta, aplicar desconto e exibir resumo.
    - Valide situações como consumo negativo ou desconto acima do permitido.
    - No main, crie diferentes contas e simule pelo menos três cenários distintos de faturamento.
********************************************************************************************************************************************/

class EnergyConsumptionAccount {
    // Defina atributos como número da instalação, nome do titular, consumo em kWh, tarifa base e bandeira tarifária.
    public String installationNumber;
    public String holder;
    public float consumption;
    public float baseRate;
    public String flag;

    public EnergyConsumptionAccount(String installationNumber, String holder, float baseRate, String flag) {
        this.installationNumber = installationNumber;
        this.holder = holder;
        this.baseRate = baseRate;
        this.flag = flag;
        consumption = 0;
    }

    // Implemente métodos para registrar consumo, calcular valor da conta, aplicar desconto e exibir resumo.
    // Valide situações como consumo negativo ou desconto acima do permitido.
    public void setConsumption(float consumption) {
        if (consumption < 0) {
            System.out.println("Erro: consumo não pode ser negativo.");
            return;
        }
        this.consumption = consumption;
    }

    public float calculateAccount() {
        float additional = 0;

        switch(flag.toLowerCase()) {
            case "verde": 
                additional = 0;
                break;
            case "amarela":
                additional = 1.88f;
                break;
            case "vermelha 1": 
                additional = 4.46f;
                break;
            case "vermelha 2": 
                additional = 7.87f;
                break;
            default:
                System.out.println("Bandeira inválida!");
                additional = 0;
        }

        additional *= consumption / 100;
        return consumption * baseRate + additional;
    }

    public float applyDiscount(float discountPercentage) {
        float accountValue = calculateAccount();

        if (discountPercentage < 0) {
            System.out.println("Erro: desconto não pode ser negativo.");
            return accountValue;
        }
        if (discountPercentage > 50) {
            System.out.println("Desconto inválido! Máximo permitido: 50%");
            return accountValue;
        }

        return accountValue - (accountValue * (discountPercentage / 100));
    }

    public void displaySummary() {
        System.out.println("---------- RESUMO ----------");
        System.out.println("Número da instalação: " + installationNumber);
        System.out.println("Nome do titular: " + holder);
        System.out.println("Consumo: " + consumption + " kWh");
        System.out.println("Tarifa base: R$ " + baseRate);
        System.out.println("Bandeira tarifária: " + flag);
        System.out.println("----------------------------");
    }
}

// No main, crie diferentes contas e simule pelo menos três cenários distintos de faturamento.
class Main {
    public static void main(String []args) {
        EnergyConsumptionAccount e1 = new EnergyConsumptionAccount("001", "Vanessa", 0.93f, "verde");
        e1.setConsumption(-50);
        e1.setConsumption(100);
        System.out.println("Valor da conta: R$ " + e1.calculateAccount());
        System.out.println("Valor da conta com desconto: R$ " + e1.applyDiscount(10));
        e1.displaySummary();

        EnergyConsumptionAccount e2 = new EnergyConsumptionAccount("002", "Verônica", 0.89f, "laranja");
        e2.setConsumption(300);
        System.out.println("Valor da conta: R$ " + e2.calculateAccount());
        System.out.println("Valor da conta com desconto: R$ " + e2.applyDiscount(25));
        e2.displaySummary();

        EnergyConsumptionAccount e3 = new EnergyConsumptionAccount("003", "Luna", 0.78f, "vermelha 2");
        e3.setConsumption(150);
        System.out.println("Valor da conta: R$ " + e3.calculateAccount());
        System.out.println("Valor da conta com desconto: R$ " + e3.applyDiscount(-25));
        System.out.println("Valor da conta com desconto: R$ " + e3.applyDiscount(80));
        System.out.println("Valor da conta com desconto: R$ " + e3.applyDiscount(50));
        e3.displaySummary();
    }
}