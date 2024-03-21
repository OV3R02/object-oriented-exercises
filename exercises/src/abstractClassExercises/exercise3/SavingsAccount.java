package abstractClassExercises.exercise3;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String account, double balance) {
        super(account, balance);
    }

    @Override
    public void deposit(double amount) {
    setBalance(getBalance()+amount);
    System.out.println("Deposit of E "+amount+" succesfull. Current balance is E "+getBalance());
        
    }

    @Override
    public void withdraw(double amount) {
        
        if (amount<=getBalance()) {
            setBalance(getBalance()-amount);
            System.out.println("Withdrawing of E "+amount+" succesfull. Now your balance is of E "+getBalance());
        } else {
            System.out.println("Transaction failed");
        }
    }

}
