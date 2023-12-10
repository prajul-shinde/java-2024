package exercise1.bank;

public class BankAccount {

    public int accountNumber;
    public String accountHolder;
    public double balance;

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
                + balance + "]";
    }
}
