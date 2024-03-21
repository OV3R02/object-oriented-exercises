/*
 * Write a Java program to create an abstract class Animal with an abstract method called sound().
 * Create subclasses Lion and Tiger that extend the Animal class and implement the sound()
 * method to make a specific sound for each animal. 
 */

package abstractClassExercises.exercise1;

public class App1 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();
        Animal tiger = new Tiger();
        tiger.sound();
    }
}
