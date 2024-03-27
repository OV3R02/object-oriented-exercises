/*
 * Write a Java program to implement a lambda expression to find the sum of two integers. 
 */

package lambdaExercises.exercise1;

public class App1{
    public static void main(String[] args) {

        // New lambda expression for calculating two numbers
        calculator c = (a,b) -> a+b;

        int result = c.sum(122, 123);
        System.out.println("The sum beatween 122 and 123 is "+result); // Result of sum in output will be 245
        
    }
}

interface calculator{
    int sum(int a, int b);
} 

