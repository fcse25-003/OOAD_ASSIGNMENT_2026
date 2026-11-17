package model;

public class InvestmentAccount extends Account {

    public InvestmentAccount(String accountNumber,
                             double balance,
                             String branch,
                             Customer customer) {

        super(accountNumber, balance, branch, customer);

        if (balance < 500) {
            System.out.println("Minimum opening balance is BWP500.");
        }
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void applyInterest() {
        balance = balance + (balance * 0.05);
        System.out.println("Investment interest added.");
    }
}