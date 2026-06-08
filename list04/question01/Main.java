public class Main {    
    public static void main(String[] args) {        
        Shape[] shapes = { new Circle(5.0), new Rectangle(4.0, 6.0), new Triangle(3.0, 4.0, 5.0) };        
        for (Shape s : shapes) {            
            // Deve imprimir o nome da forma e sua área, ex: "Circle: 78.54"            
            System.out.printf("%s: %.2f%n", s.name(), s.area());        
        }    
    } 
} 