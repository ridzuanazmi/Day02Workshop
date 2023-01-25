package Day2Workshop2;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    public App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("----------------------- Welcome to Banking -----------------------\n");

        int n =3;
        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble(max);

            bankAccount[i] = new FixedDepositAccount(uuid, initialBalance);
        }

        bankAccount[0].setName("Ridzy666");
        bankAccount[1].setName("Ridz Carlton");
        bankAccount[2].setName("Ridzimon");

        bankAccount[0].showAccount();
        System.out.println("");
        bankAccount[1].showAccount();
        System.out.println("");
        bankAccount[2].showAccount();
        System.out.println("");

        bankAccount[0].deposit(2000);
        bankAccount[1].deposit(3000);
        bankAccount[2].deposit(4000);

        bankAccount[0].withdrawal(2000);
        bankAccount[1].withdrawal(3000);
        bankAccount[2].withdrawal(4000);

        bankAccount[0].showAccount();
        System.out.println("");
        bankAccount[1].showAccount();
        System.out.println("");
        bankAccount[2].showAccount();
        System.out.println("");
    }
}
