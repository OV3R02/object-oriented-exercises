/*
 * Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase. 
 */

package lambdaExercises.exercise3;

import java.util.Arrays;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "green", "item", "WhiLe");
        
        // List of string not corrected
        System.out.println("\nList of Strings not corrected: \n");
        for (String str : stringList) {
            System.out.println(str);
        }
        
        stringList.replaceAll(str -> str.toUpperCase());
        System.out.println("\nList of Strings corrected with toUpperCase: \n");
        // List of Strings corrected with toUpperCase
        for (String str : stringList) {
            System.out.println(str);
        }
        
        stringList.replaceAll(str -> str.toLowerCase());
        System.out.println("\nList of Strings corrected with toLowerCase: \n");
        // List of Strings corrected with toLowerCase
        for (String str : stringList) {
            System.out.println(str);
        }


    }
}
