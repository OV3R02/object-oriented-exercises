/*  
 * First exercise:
 * 
 * Write a Java program to create a class called "Person" with a name and an age attributes. 
 * Create two instances of the "Person" class, set their attributes using the constructor,
 * and print their name and age. 
 * 
 * Thing to do in sequence:
 * 
 * 1) Make a class with Person as it's name where we will put the two attribute name and age;
 * 
 *  Example:
 *     public class Person{
 *        private String name;
 *        private int age;
 *     }
 * 
 * 2) After we have made the two attributes, name and age, now make constructor of all two; 
 * 3) After the point 2) create the setters, getters, hashCode, equals, toString of all two instance;
 * 4) In the main we have to put the values of the two attribute;
 *    
 *  Example:
 *      Person p = new Person(String, int) 
 *      p.setName("Mario")
 *      p.setAge(12)
 * 
 * 5) At the end of the work write println and write in the toString of "p";
 * 
 * Enjoy!
 */

package exercise1;

public class App {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Mario", 18);

        System.out.println(p.toString());

        p.setAge(21);
        p.setName("Omar");

        System.out.println(p.getName()+" "+p.getAge());
    }
}
