/*
 * Write a Java program to implement a lambda expression to check if a given string is empty. 
 */

package lambdaExercises.exercise2;

import java.util.function.Predicate;

public class App2 {
    public static void main(String[] args) {
        Predicate<String> isEmptyString = str -> str.isEmpty();
        String str1 = "";
        String str2 = "Hello!";
        System.out.println("First example: "+isEmptyString.test(str1));
        System.out.println("Seconth example: "+isEmptyString.test(str2));
    }
}

