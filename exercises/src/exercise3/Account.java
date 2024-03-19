package exercise3;


public class Account {

    // Needed instance for the class account
    private String name;
    private String lastName;
    private long ID;
    private double moneyBalance;

    // Constructor
    public Account(String name, String lastName, long iD, double moneyBalance) {
        this.name = name;
        this.lastName = lastName;
        ID = hashCode();
        this.moneyBalance = moneyBalance;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getMoneyBalance() {
        return moneyBalance;
    }
    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
    public long getID() {
        return ID;
    }
    
    // hashCode and equals
    @Override
    public int hashCode() {
        double nmRandom = Math.random();
        double numD = nmRandom*30;
        int num = (int) numD +1;
        final int prime = 31+num;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + (int) (ID ^ (ID >>> 32));
        long temp;
        temp = Double.doubleToLongBits(moneyBalance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return Math.abs(result);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (ID != other.ID)
            return false;
        if (Double.doubleToLongBits(moneyBalance) != Double.doubleToLongBits(other.moneyBalance))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Account [name=" + name + ", lastName=" + lastName + ", ID=" + ID + ", moneyBalance=" + moneyBalance
                + "]";
    }

    // Metod for depositing money into account
    public void deposit(double amount){
        moneyBalance+=amount;
    }

    // Metod for withdrawing money from account
    public void withdraw(double amount){
        moneyBalance-=amount;
    }
    
}
