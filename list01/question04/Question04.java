import java.util.UUID;

// Questão 4: Gerenciamento de Estoque de Produtos 
// Implemente uma classe InventoryItem com:
class InventoryItem {
    // Atributos privados: itemCode, description, unitPrice, quantityInStock, minimumStockLevel 
    private String itemCode;
    private String description;
    private double unitPrice;
    private int quantityInStock;
    private int minimumStockLevel;

    // Construtores sobrecarregados (pelo menos 3 variações)
    public InventoryItem() {
        this("", 0.0, 0, 0);
    }
    public InventoryItem(double unitPrice) {
        this("", unitPrice, 0, 0);
    }
    public InventoryItem(String description, double unitPrice, int quantityInStock, int minimumStockLevel) {
        itemCode = UUID.randomUUID().toString().substring(0, 8);
        setDescription(description);
        setUnitPrice(unitPrice);
        setQuantityInStock(quantityInStock);
        setMinimumStockLevel(minimumStockLevel);
    }

    // Validações nos setters (preço não pode ser negativo, estoque não pode ser negativo, etc.) 
    public void setItemCode(String itemCode)
    {
        this.itemCode = itemCode;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setUnitPrice(double unitPrice) {
        if(unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Preço inválido!");
        }
    }
    public void setQuantityInStock(int quantityInStock) {
        if(unitPrice >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void setMinimumStockLevel(int minimumStockLevel) {
        if(unitPrice >= 0) {
            this.minimumStockLevel = minimumStockLevel;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    // Métodos de negócio: 
    // applyDiscount(double percentage) 
    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 1) {
            unitPrice -= unitPrice * percentage;
            System.out.println("Desconto aplicado.");
        } else {
            System.out.println("Porcentagem inválida!");
        }
    }

    // updateStock(int quantity) - com sobrecarga para diferentes cenários 
    public void updateStock(int quantity, boolean isAddition) {
        if (quantity < 0) {
            System.out.println("Quantidade inválida!");
            return;
        }

        if (isAddition) {
            quantityInStock += quantity;
            System.out.println("Estoque adicionado.");
        } else {
            if (quantityInStock >= quantity) {
                quantityInStock -= quantity;
                System.out.println("Estoque removido.");
            } else {
                System.out.println("Estoque insuficiente!");
            }
        }
    }
    public void updateStock(int quantity) {
        if(quantity < 0) {
            updateStock(Math.abs(quantity), false);
        } else {
            updateStock(quantity, true);
        }
    }

    // isBelowMinimumStock() - verifica se está abaixo do estoque mínimo 
    public void isBelowMinimumStock() {
        if (quantityInStock < minimumStockLevel) {
            System.out.println("Estoque está abaixo do mínimo!");
        } else {
            System.out.println("Estoque não está abaixo do mínimo!");
        }
    }

    // Desafio: Implemente um construtor que chama outro construtor da mesma classe usando this() para inicializar valores padrão e eliminar 
    // duplicação
}

public class Question04 {
    public static void main(String []args) {
        InventoryItem i1 = new InventoryItem("Notebook", 3000.0, 5, 2);

        i1.applyDiscount(0.10);

        i1.updateStock(3);

        i1.isBelowMinimumStock();
    }
}