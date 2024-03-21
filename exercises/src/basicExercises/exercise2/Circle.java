package basicExercises.exercise2;

public class Circle {
    
    public static final double PI = 3.14159f;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public double getCircumference() {
        return 2*PI*radius;
    }

    

    

}
