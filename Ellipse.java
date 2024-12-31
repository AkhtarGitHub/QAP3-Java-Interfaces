// Ellipse.java
public class Ellipse extends Shape implements Scalable {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
    }

    @Override
    public void scale(double scaleFactor) {
        this.majorAxis *= scaleFactor;
        this.minorAxis *= scaleFactor;
    }

    @Override
    public String toString() {
        return "Ellipse [majorAxis=" + majorAxis + ", minorAxis=" + minorAxis + ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}