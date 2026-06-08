public class Main {    
    public static void main(String[] args) {        
        Notifier[] notifiers = { new EmailNotifier("user@email.com"), new SmsNotifier("11999999999"), new PushNotifier("device-token-xyz") };        
        for (Notifier n : notifiers) {            
            try {                
                n.send("Sua compra foi confirmada!"); // pode lançar NotificationException            
            } catch (NotificationException e) {                
                System.out.println("Falha ao notificar: " + e.getMessage());            
            }        
        }    
    } 
}