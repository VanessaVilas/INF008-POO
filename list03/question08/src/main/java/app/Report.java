package app;

// Implemente classes de domínio para representar venda e relatório.
public class Report {
    // Gere um relatório com total vendido, produto mais vendido e média por venda.
    public double totalSold;
    public String bestSellingProduct;
    public double averagePerSale;

    public Report(double totalSold, String bestSellingProduct, double averagePerSale) {
        this.totalSold = totalSold;
        this.bestSellingProduct = bestSellingProduct;
        this.averagePerSale = averagePerSale;
    }
}