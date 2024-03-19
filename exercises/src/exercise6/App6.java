/*
 * Write a Java program to create a class called "Employee" with a name,
 * job title, and salary attributes, and methods to calculate and update salary. 
 * 
 */

package exercise6;

public class App6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anna Semini", "Architetto", 3000);
        Employee e2 = new Employee("Mario Genoveffa", "Muratore", 1500);
        System.out.println("\n_____________________________|EMPLOYEE INFO|_____________________________");
        e1.printEmployeeInfo();
        System.out.println("\n-------------------------------------------------------------------------");
        e2.printEmployeeInfo();
        System.out.println("_________________________________________________________________________");
        e1.raiseSalary(18);
        e2.raiseSalary(25);
        System.out.println("\n                            Salary updating...                              \n");
        System.out.println("                                   ||                                       ");
        System.out.println("                                   ||                                       ");
        System.out.println("                                   ||                                       ");
        System.out.println("                                  \\  /                                     ");
        System.out.println("                                   \\/                                      ");
        System.out.println("                                                                            ");
        
        System.out.println("\n_____________________________|NEW EMP INFO|______________________________");
        e1.printEmployeeInfo();
        System.out.println("\n-------------------------------------------------------------------------");
        e2.printEmployeeInfo();
        System.out.println("_________________________________________________________________________\n");
    }
}
