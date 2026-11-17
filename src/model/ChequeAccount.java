package model;
public class ChequeAccount extends Account {

    private String companyName;
    private String companyAddress;

    public ChequeAccount(String accountNumber,
                         double balance,
                         String branch,
                         Customer customer,
                         String companyName,
                         String companyAddress) {

        super(accountNumber, balance, branch, customer);

        this.companyName = companyName;
        this.companyAddress = companyAddress;
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
    public String getCompanyName() {
    return companyName;
}

public String getCompanyAddress() {
    return companyAddress;
}
}
