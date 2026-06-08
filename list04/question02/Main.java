public class Main {    
    public static void main(String[] args) {        
        Payable[] methods = { new CreditCard("1234-5678", 1500.0), new Pix("chave@email.com"), new BankSlip("2026-07-10") };        
        for (Payable p : methods) {            
            p.pay(200.0); // Cada implementação imprime sua forma de pagar   

            if(p instanceof CreditCard) {
                CreditCard card = (CreditCard) p;
                card.receipt();
            }     
        }    
    }
}