package problem1;

public class CircleShape extends Shape {
    private double horizontalRadius;
    private double verticalRadius;

    public CircleShape(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        horizontalRadius = radius;
        verticalRadius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * horizontalRadius * verticalRadius;
    }

    @Override
    protected void scaleDimensions(double xFactor, double yFactor) {
        horizontalRadius *= xFactor;
        verticalRadius *= yFactor;
    }
}
