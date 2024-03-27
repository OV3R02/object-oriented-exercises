/*
 * Write a Java program to implement a lambda expression to check if a given string is empty. 
 */

package lambdaExercises.exercise2;

import java.util.function.Predicate;

public class App2 {
    public static void main(String[] args) {

        // Lambda expression for verifing the Strings
        Predicate<String> isEmptyString = str -> str.isEmpty();

        // Two new variable
        String str1 = "";
        String str2 = "Hello!";

        // Output
        System.out.println("First example: "+isEmptyString.test(str1)); // First example the string is empty so the output will be true
        System.out.println("Seconth example: "+isEmptyString.test(str2)); // Seconth example will be false
    }
}

