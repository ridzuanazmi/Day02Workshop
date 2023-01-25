package Day2Workshop1;

import java.util.UUID;

public class Main {
    
    public static void main(String[] args) {
        
        // Create a random string derived from UUID class
        String uuid = UUID.randomUUID().toString();

        // Instantiate ridzBank object from BankAccount class
        FixedDepositAccount ridzBank = new FixedDepositAccount("Ridzuan Azmi", uuid, 3, 6);
        ridzBank.deposit(20000.00);
        ridzBank.withdraw(500.0);
        ridzBank.showAccount();
        ridzBank.amountAfterInterest();
        System.out.println(ridzBank.toString());
    }
}
