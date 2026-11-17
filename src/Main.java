import model.Customer;
import model.SavingsAccount;
import model.InvestmentAccount;
import model.ChequeAccount;
import controller.LoginController;
import controller.AccountController;

public class Main {

    public static void main(String[] args) {

        Customer customer =
                new Customer(
                        "Letso Olga",
                        "Mosarwa",
                        "Lobatse",
                        "74730087"
                );

        SavingsAccount savings =
                new SavingsAccount(
                        "S001",
                        1000,
                        "Lobatse Branch",
                        customer
                );

        InvestmentAccount investment =
                new InvestmentAccount(
                        "I001",
                        2000,
                        "Lobatse Branch",
                        customer
                );

        ChequeAccount cheque =
                new ChequeAccount(
                        "C001",
                        3000,
                        "Lobatse Branch",
                        customer,
                        "BAC",
                        "Gaborone"
                );

        savings.deposit(500);
        investment.deposit(1000);
        cheque.deposit(500);

        System.out.println(
                "Savings Balance: " +
                savings.getBalance()
        );

        System.out.println(
                "Investment Balance: " +
                investment.getBalance()
        );

        System.out.println(
                "Cheque Balance: " +
                cheque.getBalance()
        );

        LoginController loginController =
                new LoginController();

        boolean result =
                loginController.login(
                        "admin",
                        "1234"
                );

        System.out.println(
                "Login Result: " +
                result
        );
 AccountController accountController =
        new AccountController();

accountController.deposit(
        savings,
        200
);

System.out.println(
        "Updated Savings Balance: "
        + savings.getBalance()
);       
    }
}