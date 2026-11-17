import model.Customer;
import model.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Customer customer =
                new Customer(
                        "Letso Olga",
                        "Mosarwa",
                        "Lobatse",
                        "74730087"
                );

        SavingsAccount account =
                new SavingsAccount(
                        "S001",
                        1000,
                        "Lobatse Branch",
                        customer
                );

        account.deposit(500);

        System.out.println(
                "Balance: " +
                account.getBalance()
        );
    }
}
