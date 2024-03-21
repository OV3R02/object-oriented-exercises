package abstractClassExercises.exercise2;

public class Circle extends Shape {

    // radius
    private double r;

    // pgrec
    private final double PI = 3.14159;

    // Constructor of r
    public Circle(double r) {
        this.r = r;
    }

    // Get and set of r
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // toString of r
    @Override
    public String toString() {
        return "Circle [r=" + r + ", PI=" + PI + "]";
    }

    // Method for calculate circle's area
    @Override
    public double calculateArea() {
        return PI * (r * r);
    }

    // Method for calculate cicle's perimeter
    @Override
    public double calculatePerimeter() {
        return PI * (r * 2);
    }

}
