/********************************************************************************************************************************************
3. Métodos construtores

Problema: Crie uma classe ProdutoEstoque para gerenciar itens de um almoxarifado.

Guia de implementação:
    - Implemente construtores que garantam a criação válida do objeto já com nome, código, quantidade inicial e preço unitário.
    - Exija que o código seja obrigatório no momento da criação.
    - Crie diferentes formas de inicialização, mas sempre preservando consistência do objeto.
    - Demonstre no main como construtores diferentes influenciam o estado inicial dos objetos.
********************************************************************************************************************************************/

class ProductStock {
    public String name;
    public String code;
    public int quantity;
    public float unitPrice;

    // Implemente construtores que garantam a criação válida do objeto já com nome, código, quantidade inicial e preço unitário.
    public ProductStock(String code, String name) {
        // Exija que o código seja obrigatório no momento da criação.
        if (code == null || code.isEmpty()) {
            System.out.println("Código é obrigatório!");
            return;
        }

        this.code = code;
        this.name = name;
    }

    // Crie diferentes formas de inicialização, mas sempre preservando consistência do objeto.
    public ProductStock(String code, String name, float unitPrice) {
        this(code, name);

        if (unitPrice < 0) {
            System.out.println("Preço não pode ser negativo!");
            return;
        }

        this.unitPrice = unitPrice;
    }
    
    public ProductStock(String code, String name, float unitPrice, int quantity) {
        this(code, name, unitPrice);

        if (quantity < 0) {
            System.out.println("Quantidade não pode ser negativa!");
            return;
        }

        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("---------- PRODUTO ----------");
        System.out.println("Nome: " + name);
        System.out.println("Código: " + code);
        System.out.println("Quantidade inicial: " + quantity);
        System.out.println("Preço unitário: R$ " + unitPrice);
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String []args) {
        // Demonstre no main como construtores diferentes influenciam o estado inicial dos objetos.
        ProductStock p1 = new ProductStock("001", "Teclado");
        p1.displayProduct();

        ProductStock p2 = new ProductStock("002", "Monitor", 800f);
        p2.displayProduct();

        ProductStock p3 = new ProductStock("003", "Mouse", 40.5f, 50);
        p3.displayProduct();

        ProductStock p4 = new ProductStock("", "", -1f, -1);
        p4.displayProduct();
    }
}