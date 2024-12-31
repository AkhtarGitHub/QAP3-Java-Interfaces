// Triangle.java
public class Triangle extends Shape implements Scalable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        // Assuming an equilateral triangle for simplicity
        return 3 * base;
    }

    @Override
    public void scale(double scaleFactor) {
        this.base *= scaleFactor;
        this.height *= scaleFactor;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}