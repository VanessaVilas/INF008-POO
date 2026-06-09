public class Main {    
    public static void main(String[] args) {        
        Validator[] validators = { new RequiredValidator("nome"), 
                                   new MinLengthValidator("senha", 8), 
                                   new EmailValidator("email") };        
        String[] values = { "", "abc", "nao-e-email" };        
        for (int i = 0; i < validators.length; i++) {            
            try {                
                validators[i].validate(values[i]);               
                System.out.println(validators[i].fieldName() + ": OK");            
            } catch (ValidationException e) {                
                System.out.println(e.fieldName() + " [" + e.errorCode() + "]: " + e.getMessage());            
            }        
        }    
    } 
}