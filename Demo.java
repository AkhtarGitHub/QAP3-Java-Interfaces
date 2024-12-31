// Demo.java
public class Demo {
    public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        System.out.println("Before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }

        System.out.println("\nAfter scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = {
            new Circle(5),
            new Ellipse(4, 3),
            new Triangle(6, 4),
            new EquilateralTriangle(6)
        };

        double scaleFactor = 2.0;
        scaleShapes(shapes, scaleFactor);
    }
}