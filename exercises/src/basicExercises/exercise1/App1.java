/*  
 * First exercise:
 * 
 * Write a Java program to create a class called "Person" with a name and an age attributes. 
 * Create two instances of the "Person" class, set their attributes using the constructor,
 * and print their name and age. 
 * 
 */

package basicExercises.exercise1;

public class App1 {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Mario", 50);

        System.out.println(p.toString());

        p.setAge(21);
        p.setName("Valentin");

        System.out.println(p.getName()+" "+p.getAge());

        Person n = new Person("Giorgino", 2);

        System.out.println(n.getName()+" "+n.getAge());
    }
}
