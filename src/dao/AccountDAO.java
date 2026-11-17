package dao;

import model.Account;

public class AccountDAO {

    public void save(Account account) {

        System.out.println(
                "Account saved to database"
        );
    }

    public void update(Account account) {

        System.out.println(
                "Account updated"
        );
    }

    public void delete(Account account) {

        System.out.println(
                "Account deleted"
        );
    }

    public void findByAccountNumber(
            String accountNumber) {

        System.out.println(
                "Searching for account: "
                + accountNumber
        );
    }
}
