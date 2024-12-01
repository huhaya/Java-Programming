public class CircleWithPrivateDataFields {

    /**
     * The radius of the circle.
     */
    private double radius = 1;

    /**
     * The number of objects created.
     */
    private static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1.
     */
    public CircleWithPrivateDataFields() {
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius.
     *
     * @param newRadius the new radius
     */
    public CircleWithPrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Set a new radius.
     *
     * @param newRadius the new radius
     */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /**
     * Get the radius of the circle.
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Return number of objects.
     *
     * @return the number of objects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle.
     *
     * @return the area of this circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}