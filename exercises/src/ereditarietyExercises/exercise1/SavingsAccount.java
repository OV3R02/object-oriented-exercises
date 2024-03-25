package ereditarietyExercises.exercise1;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountCode, String accountName, double balance) {
        super(accountCode, accountName, balance);
        
    }


    

    @Override
    public void withdraw(double amount) {
        if (getBalance()-amount<1000){
            System.out.println("Not valid operation, insufficent balance. Your balance is equal or under E 1000, please increase it first.");
        }else{
            super.withdraw(amount);
        }
    }

}
