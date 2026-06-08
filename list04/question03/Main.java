public class Main {    
    public static void main(String[] args) {        
        Animal[] animals = { new Dog("Rex"), new Bird("Tweety"), new Fish("Nemo") };        
        for (Animal a : animals) {            
            a.breathe(); // Método abstrato: cada animal respira de forma diferente            
            if (a instanceof Flyable f) f.fly(); // Apenas Bird voa            
            if (a  instanceof Swimmable s) s.swim(); // Fish e Dog nadam       
        }   
    } 
}