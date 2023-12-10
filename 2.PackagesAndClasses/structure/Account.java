package structure;

public class Account {

    private String owner;
    private double balance;
    private double minimunBalance;

    private static String architectName;

    public double calCulateCreditWorthiness() {
        // implementation
        return 100;
    }

    public void deposit(double amount) {
        // implementation
    }

    public void withdraw(double amount) {
        // implementation
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimunBalance() {
        return minimunBalance;
    }

    public void setMinimunBalance(double minimunBalance) {
        this.minimunBalance = minimunBalance;
    }
}
