package Day2Workshop1;

import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    
    // fields of BankAccount
    private String name;
    private String accNumber;
    private float balance;
    private boolean isClose;
    private ArrayList<String> transaction = new ArrayList<>();
    private Date create;
    private Date close;

    // constructor of BankAccount
    public BankAccount(String name, String accNumber) {
        this.name = name;
        this.accNumber = accNumber;
        this.balance = 0;
    }

    // getters and setters of BankAccount
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isClose() {
        return isClose;
    }

    public void setClose(boolean isClose) {
        this.isClose = isClose;
    }

    public ArrayList<String> getTransaction() {
        return transaction;
    }

    public void setTransaction(ArrayList<String> transaction) {
        this.transaction = transaction;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getClose() {
        return close;
    }

    public void setClose(Date close) {
        this.close = close;
    }

    // methods of BankAccount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;   
            System.out.println("Added $" + amount + " into your account"); 
        } else {
            throw new IllegalArgumentException("You cannot make a deposit of $0 or less"); 
        }
        transaction.add("deposit $" + amount + " at " + new Date());
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;    
            System.out.println("Withdrew $" + amount + " from your account");
        } else {
            throw new IllegalArgumentException("You cannot make a withdrawal of $0 or less"); 
        }
        transaction.add("withdrawal $" + amount + " at " + new Date());
    }

    public void showAccount() {
        System.out.println("Account number: " + accNumber);
        System.out.println("Full name: " + name);
        System.out.printf("Balance %.2f: $\n", balance);
    }

    @Override
    public String toString() {
        return "BankAccount [name = " + name + ", accNumber = " + accNumber + ", balance = " + balance + ", transaction = " + transaction + 
        ", create = " + create + ", close = " + close + "]";
    }

    
} // end of BankAccount class