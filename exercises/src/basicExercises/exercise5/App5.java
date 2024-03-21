/*
 * Write a Java program to create a class called "Rectangle" with width and height attributes.
 * Calculate the area and perimeter of the rectangle.
 * 
 */

package basicExercises.exercise5;

public class App5 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10.3f, 15.6f);

        System.out.println("\n"+r1.toString());
        System.out.println("\nThe perimeter of the rectangle is: "+r1.getPerimeter());
        System.out.println("\nThe area of the rectangle is: "+r1.getArea());

        System.out.println("\n---------------------------------------------------------------");

        r1.setHeight(155);
        r1.setWidth(20);

        System.out.println("\n"+r1.toString());
        System.out.println("\nThe perimeter of the rectangle is: "+r1.getPerimeter());
        System.out.println("\nThe area of the rectangle is: "+r1.getArea());

    }
}
