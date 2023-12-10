package exercise1;

import exercise1.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolder = "testUser";
        bankAccount.accountNumber = 693939;
        bankAccount.balance = 9987.00;
        System.out.println(bankAccount.toString());
    }
}
