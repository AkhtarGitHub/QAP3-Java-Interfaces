// Circle.java
public class Circle extends Shape implements Scalable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}