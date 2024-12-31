// EquilateralTriangle.java
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, (Math.sqrt(3) / 2) * side);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle [side=" + super.toString() + "]";
    }
}