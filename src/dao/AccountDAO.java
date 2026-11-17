package dao;

import model.Account;

public class AccountDAO {

    public void save(Account account) {

        System.out.println(
                "Account saved"
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
}
