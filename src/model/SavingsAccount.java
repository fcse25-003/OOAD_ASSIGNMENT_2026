package model;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber,
                          double balance,
                          String branch,
                          Customer customer) {

        super(accountNumber, balance, branch, customer);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed from Savings Account.");
    }

    public void applyInterest() {
        balance = balance + (balance * 0.0005);
        System.out.println("Savings interest added.");
    }
}