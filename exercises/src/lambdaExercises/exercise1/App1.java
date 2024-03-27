/*
 * Write a Java program to implement a lambda expression to find the sum of two integers. 
 */

package lambdaExercises.exercise1;

public class App1{
    public static void main(String[] args) {
        calculator c = (a,b) -> a+b;
        int result = c.operation(122, 123);
        System.out.println("The sum beatween 122 and 123 is "+result);
        
    }
}

interface calculator{
    int operation(int a, int b);
} 

