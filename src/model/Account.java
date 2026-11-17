public abstract class Account implements AccountOps {

    private String accountNumber;
    protected double balance;
    private String branch;
    private Customer customer;

    public Account(String accountNumber,
                   double balance,
                   String branch,
                   Customer customer) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
        this.customer = customer;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public Customer getCustomer() {
        return customer;
    }
}