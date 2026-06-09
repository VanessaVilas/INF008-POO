public class Main {
    public static void main(String[] args) {        
        TextProcessor[] processors = { new UpperCaseProcessor(), new TrimProcessor(), new ReverseProcessor() };        
        String input = " hello world ";        
        for (TextProcessor p : processors) {            
            try {                
                input = p.process(input);                
                System.out.println(p.stepName() + ": " + input);            
            } catch (InvalidInputException e) {                      
                System.out.println("Entrada inválida em " + p.stepName() + ": " + e.getMessage());    
            } 
        }
    }
}