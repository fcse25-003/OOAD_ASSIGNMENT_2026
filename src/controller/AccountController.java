package controller;

import model.Account;

public class AccountController {

    public void deposit(Account account,
                        double amount) {

        account.deposit(amount);

        System.out.println("Deposit Processed");
    }

    public void withdraw(Account account,
                         double amount) {

        account.withdraw(amount);

        System.out.println("Withdrawal Processed");
    }

    public void checkBalance(Account account) {

        System.out.println(
            "Balance: " +
            account.getBalance()
        );
    }
}
