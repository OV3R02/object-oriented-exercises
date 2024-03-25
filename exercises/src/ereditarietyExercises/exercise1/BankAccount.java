package ereditarietyExercises.exercise1;

public class BankAccount {

    private String accountCode;
    private String accountName;
    private double balance;

    
    
    public BankAccount(String accountCode, String accountName, double balance) {
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getAccountCode() {
        return accountCode;
    }
    public String getAccountName() {
        return accountName;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountCode == null) ? 0 : accountCode.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        if (accountCode == null) {
            if (other.accountCode != null)
                return false;
        } else if (!accountCode.equals(other.accountCode))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "BankAccount [accountCode=" + accountCode + ", accountName=" + accountName + ", balance=" + balance
                + "]";
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Operation end succesfully, your balance is E "+balance);
    }
    
    public void withdraw(double amount){

        if (balance>=amount) {
            balance-=amount;
            System.out.println("Withdrawing succesfull, your balance is E"+balance);
        }else{
            System.out.println("Balance insufficient, can't withdraw. Your balance is E"+balance);
        }
    }
}
