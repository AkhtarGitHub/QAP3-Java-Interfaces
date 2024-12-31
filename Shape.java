// Shape.java
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape [area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}