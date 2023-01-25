package Day2Workshop2;

import java.util.Date;

public class BankAccount {
    
    // fields
    private String name;
    private final String accNumber;
    private double balance = 0.0;
    private boolean isActive = true;
    private Date createDate;
    private Date closeDate;

    // constructor
    public BankAccount(String name, String accNumber, double balance, boolean isActive,
            Date createDate, Date closeDate) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
        this.isActive = isActive;
        this.createDate = createDate;
        this.closeDate = closeDate;
    }

    public BankAccount(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccNumber() {
        return accNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getCloseDate() {
        return closeDate;
    }
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public void showAccount() {
        System.out.println("Accont number = " + accNumber);
        System.out.println("Full name = " + name);
        System.out.printf("Balance = %.2f", balance);
    }
    @Override
    public String toString() {
        return "BankAccount [name = " + name + ", accNumber = " + accNumber + ", balance = " + 
        balance + ", isActive = " + isActive + ", createDate = " + 
        createDate + ", closeDate = " + closeDate + "]";
    }

    // methods
    public void deposit(double amount) {
        if (!isActive) {
            throw new IllegalArgumentException("You cannot deposit to a closed account");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("You cannot make a deposit of $0 or less"); 
        }else {
            balance += amount;
        }
    }
    public void withdrawal(double amount) {
        if (!isActive) {
            throw new IllegalArgumentException("You cannot withdraw to a closed account");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("You cannot make a withdrawal of $0 or less"); 
        }else {
            balance -= amount;
        }
    }
} // end of BankAccount class
