/*
 * Write a Java program to create a class called
 * "Bank" with a collection of accounts and methods
 * to add and remove accounts, and to deposit and
 * withdraw money.
 * Also define a class called "Account" to maintain
 * account details of a particular customer.
 * 
 */

package exercise3;

public class App3 {
    public static void main(String[] args) {

        Bank a = new Bank();
        Account a1 = new Account("Omar", "Vergnano", 0, 0);
        Account a2 = new Account("Om", "Ver", 0, 0);
        
        a.addAccount(a1);
        System.out.println(a1);
        a.depositMoney(a1, 1000);
        System.out.println(a1);
        a.depositMoney(a1, 1000);
        System.out.println(a1);
        a.withdrawMoney(a1, 500);
        System.out.println(a1);
        a.addAccount(a2);
        System.out.println(a2);
        a.depositMoney(a2, 1000);
        System.out.println(a2);
        a.depositMoney(a2, 1000);
        System.out.println(a2);
        a.withdrawMoney(a2, 500);
        System.out.println(a2);
        System.out.println();
    
    }    
}
