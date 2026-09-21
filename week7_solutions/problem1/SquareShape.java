package problem1;

public class SquareShape extends Shape {
    private double horizontalSide;
    private double verticalSide;

    public SquareShape(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive.");
        }
        horizontalSide = side;
        verticalSide = side;
    }

    @Override
    public double calculateArea() {
        return horizontalSide * verticalSide;
    }

    @Override
    protected void scaleDimensions(double xFactor, double yFactor) {
        horizontalSide *= xFactor;
        verticalSide *= yFactor;
    }
}
