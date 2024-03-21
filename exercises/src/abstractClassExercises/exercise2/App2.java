/*
 * Write a Java program to create an abstract class Shape with abstract methods
 * calculateArea() and calculatePerimeter().
 * Create subclasses Circle and Triangle that extend the Shape class and
 * implement the respective methods to calculate the area and perimeter of each
 * shape. 
 */

package abstractClassExercises.exercise2;

public class App2 {
    public static void main(String[] args) {
        Shape circle = new Circle(125);
        Shape triangle = new Triangle(15, 50, 50);

        double a = circle.calculateArea();
        System.out.println("\nCircle's area: " + a);
        double p = circle.calculatePerimeter();
        System.out.println("Circle's perimeter: " + p);

        double aT = triangle.calculateArea();
        System.out.println("\nTriangle's area: " + aT);
        double pT = triangle.calculatePerimeter();
        System.out.println("Triangle's perimeter: " + pT + "\n");

    }
}
