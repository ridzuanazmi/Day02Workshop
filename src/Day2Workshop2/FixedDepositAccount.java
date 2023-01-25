package Day2Workshop2;

public class FixedDepositAccount extends BankAccount {
    // fields
    private float interest = 3;
    private int months = 6;

    // constructor
    public FixedDepositAccount(String accNumber, double balance) {
        super(accNumber, balance);
    }
    // methods
    @Override
    public void deposit(double amount) {
        System.out.println("No operation");
    }
    @Override
    public void withdrawal(double amount) {
        System.out.println("No operation");
    }

    @Override
    public void showAccount() {
        System.out.println("Accont number = " + getAccNumber());
        System.out.println("Full name = " + getName());
        System.out.printf("Balance = %.2f%n", getBalance() * (100 + interest)/100);
    }

}
