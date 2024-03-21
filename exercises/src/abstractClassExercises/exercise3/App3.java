/*
 * Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
 * Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the
 * respective methods to handle deposits and withdrawals for each account type.
 */

package abstractClassExercises.exercise3;

public class App3 {
    public static void main(String[] args) {
        BankAccount account1 = new CurrentAccount("Omar", 3000);
        account1.deposit(2000);
        account1.withdraw(4000);
        System.out.println("\n");
        BankAccount account2 = new SavingsAccount("Omar", 0);
        account2.deposit(500);
        account2.withdraw(600);
        
    }
}
