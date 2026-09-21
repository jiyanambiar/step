package problem1;

/** A concrete geometric form must supply its own area calculation. */
public abstract class Shape {
    private static int nextShapeNumber = 1;
    private final String shapeId;

    protected Shape() {
        shapeId = "SHAPE-" + nextShapeNumber++;
    }

    public abstract double calculateArea();

    // Overload 1: uniform scaling.
    public void scale(double factor) {
        scale(factor, factor);
    }

    // Overload 2: independent horizontal and vertical scaling.
    public void scale(double xFactor, double yFactor) {
        if (xFactor <= 0 || yFactor <= 0) {
            throw new IllegalArgumentException("Scale factors must be positive.");
        }
        scaleDimensions(xFactor, yFactor);
    }

    protected abstract void scaleDimensions(double xFactor, double yFactor);

    public String getShapeId() {
        return shapeId;
    }

    public static void printArea(Shape shape) {
        System.out.println(shape.calculateArea());
    }
}
