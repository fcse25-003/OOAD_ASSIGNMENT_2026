package view;

import controller.AccountController;
import model.Account;

public class AccountView {

    private AccountController controller;

    public AccountView() {
        controller = new AccountController();
    }

    public void deposit(Account account,
                        double amount) {

        controller.deposit(account, amount);
    }

    public void withdraw(Account account,
                         double amount) {

        controller.withdraw(account, amount);
    }

    public void showBalance(Account account) {

        controller.checkBalance(account);
    }
}
