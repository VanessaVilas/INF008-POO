class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}