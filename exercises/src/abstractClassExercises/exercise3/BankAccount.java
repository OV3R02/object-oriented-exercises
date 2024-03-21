package abstractClassExercises.exercise3;

public abstract class BankAccount {
    private String account;
    private double balance;
    
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }


    public String getAccount() {
        return account;
    }



    public void setAccount(String account) {
        this.account = account;
    }



    public double getBalance() {
        return balance;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((account == null) ? 0 : account.hashCode());
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
        if (account == null) {
            if (other.account != null)
                return false;
        } else if (!account.equals(other.account))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "BankAccount [account=" + account + ", balance=" + balance + "]";
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
}
