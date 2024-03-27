/*
 * Write a Java program to create a class called Animal with a method named move().
 * Create a subclass called Cheetah that overrides the move() method to run.
 */

package ereditarietyExercises.exercise2;

public class App2 {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.move();
        
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
