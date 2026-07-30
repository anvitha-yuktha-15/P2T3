import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankingSystem {

    static double balance = 1000;

    static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    static void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Balance.");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Deposit Amount: ");
            double depositAmount = sc.nextDouble();
            deposit(depositAmount);

            System.out.print("Enter Withdraw Amount: ");
            double withdrawAmount = sc.nextDouble();
            withdraw(withdrawAmount);

            System.out.println("Remaining Balance: " + balance);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}