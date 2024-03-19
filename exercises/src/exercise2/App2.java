/*
 * Write a Java program to create a class called "Circle" with a radius attribute.
 * You can access and modify this attribute. Calculate the area and circumference of the circle. 
 */

package exercise2;

public class App2 {
    public static void main(String[] args) {
        Circle rad = new Circle(12);
        System.out.println(rad.toString());

        System.out.println("\nCircle radius modified: ");
        rad.setRadius(20);

        System.out.println(rad.getRadius());
        
        System.out.println("\nArea of circle: "); 
        double a = rad.getArea();

        System.out.println(a);

        System.out.println("\nCircumference: ");
        double r = rad.getCircumference();
        
        System.out.println(r);;
    }
}
