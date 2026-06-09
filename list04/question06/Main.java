public class Main {    
    public static void main(String[] args) throws Exception {        
        Object[] reportables = { new SalesReport(), new InventoryReport() };        
        ReportRunner runner = new ReportRunner();        
        for (Object obj : reportables) {            
            runner.run(obj); // Invoca via reflexão o método "generate" de cada objeto        
        }    
    } 
}