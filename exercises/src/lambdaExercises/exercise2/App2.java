/*
 * Write a Java program to implement a lambda expression to check if a given string is empty. 
 */

package lambdaExercises.exercise2;

public class App2 {
    public static void main(String[] args) {
        verifyString vs = (w) -> w.isEmpty();
        boolean w1 = vs.isWordEmpty("");
        System.out.println(w1);
    }
}

interface verifyString{
    boolean isWordEmpty(String w);
}
