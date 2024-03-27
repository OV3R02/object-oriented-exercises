/*
 * Write a Java program to implement a lambda expression to
 * filter out even and odd numbers from a list of integers. 
 */

package lambdaExercises.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App4 {
    public static void main(String[] args) {

        // new List of numbers
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // First print the original list
        System.out.println("\nList of numbers: \n");
        for (int numbers : intList) {
            System.out.println(numbers);
        }

        // Process for filtering even numbers
        List<Integer> evenNumbers = intList.stream()
                                    .filter(numbers -> numbers%2==0)
                                    .collect(Collectors.toList());

        // Output
        System.out.println("\nEven numbers in the list: \n");
        for (int evenNumber : evenNumbers) {
            System.out.println(evenNumber);
        }
        
        // Process to filtering odd numbers
        List<Integer> oddNumbers = intList.stream()
                                    .filter(numbers -> numbers%2!=0)
                                    .collect(Collectors.toList());

        // Output
        System.out.println("\nOdd numbers of the list: \n");
        for (int oddNumber : oddNumbers) {
            System.out.println(oddNumber);
        }
        


    }
}

