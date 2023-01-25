package Day2Workshop1;

public class FixedDepositAccount extends BankAccount {
    
    // Fields of FixedDepositAccount
    private float interestRate;
    private int durationInMonths;

    // Constructor of FixedDepositAccount
    public FixedDepositAccount(String name, String accNumber) {
        super(name, accNumber);
        
    }

    public FixedDepositAccount(String name, String accNumber, float interestRate) {
        super(name, accNumber);
        this.interestRate = interestRate;
    }

    public FixedDepositAccount(String name, String accNumber, float interestRate, int durationInMonths) {
        super(name, accNumber);
        this.interestRate = interestRate;
        this.durationInMonths = durationInMonths;
    }

    // Methods of FixedDepositAccount
    public void amountAfterInterest() {
        
        double numberOfYears = durationInMonths / 12.0;
        double numberOfCompoundingPeriodsPerYear = 2;
        float interest = interestRate / 100;
        double amount = super.getBalance() * Math.pow(1 + interest / numberOfCompoundingPeriodsPerYear, numberOfYears * numberOfCompoundingPeriodsPerYear);
        System.out.printf("Amount after interest is: $%.2f%n", amount);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        super.deposit(amount);
    }



    @Override
    public void withdraw(double amount) {   
        // TODO Auto-generated method stub
        super.withdraw(amount);
    }

    @Override
    public void showAccount() {
        System.out.println("Account number: " + super.getAccNumber());
        System.out.println("Full name: " + super.getName());
        
    }

    
}
