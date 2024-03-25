/*
 * Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
 * account balance falls below one hundred. 
 */

package ereditarietyExercises.exercise1;

public class App1 {

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("23VR63@", "Omar", 100);
        
        a1.deposit(2000);
        a1.withdraw(1001);

        System.out.println("\n");

        SavingsAccount a2 = new SavingsAccount("61XV32C@", "Omar2", 0);
        
        a2.deposit(1000);
        a2.withdraw(1000);
        
    }
}
