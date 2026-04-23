// Questão 3: Sistema de Geometria com Sobrecarga 
// Implemente uma classe GeometryCalculator com métodos sobrecarregados:
class GeometryCalculator {
    private int precision;

    // 1. Calcular área: 
    // calculateArea(double radius) - círculo
    public void calculateArea(double radius) {
        double circleArea = 3.14 * radius * radius;
        System.out.printf("Área do círculo: %." + precision + "f\n", circleArea);
    }

    // calculateArea(double base, double height) - retângulo/triângulo 
    public void calculateArea(double base, double height) {
        double rectangleArea = base * height;
        System.out.printf("Área do retângulo: %." + precision + "f\n", rectangleArea);

        double triangleArea = rectangleArea / 2;
        System.out.printf("Área do triângulo: %." + precision + "f\n", triangleArea);
    }

    // calculateArea(double side1, double side2, double side3) - triângulo pela fórmula de Heron 
    public void calculateArea(double side1, double side2, double side3) {
        double p = calculatePerimeter(side1, side2, side3) / 2;
        double triangleArea = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        System.out.printf("Área do triângulo (Heron): %." + precision + "f\n", triangleArea);
    }

    // 2. Calcular perímetro: 
    // calculatePerimeter(double... sides) - método varargs para polígonos (pesquise sobre isso...) 
    public double calculatePerimeter(double... sides) {
        double perimeter = 0;
        for(int i = 0; i < sides.length; i ++) {
            perimeter += sides[i];
        }

        System.out.printf("Perímetro: %." + precision + "f\n", perimeter);
        return perimeter;
    }

    // 3. Construtores sobrecarregados: 
    // Construtor padrão 
    public GeometryCalculator() {
        this(2);
    }

    // Construtor que recebe uma precisão (número de casas decimais) 
    public GeometryCalculator(int precision) {
        this.precision = precision;
    }

    // Construtor que chama o outro usando this() 
    public GeometryCalculator(double precision) {
        this((int) precision);
    }

    // Desafio: Use o princípio DRY (Don't Repeat Yourself) evitando duplicação de código nos cálculos. 
}

public class Question03 {
    public static void main(String []args) {
        GeometryCalculator g1 = new GeometryCalculator();

        g1.calculateArea(5);
        g1.calculateArea(4, 6);
        g1.calculateArea(3, 4, 5);
        
        g1.calculatePerimeter(3, 4, 5, 6);
    }
}