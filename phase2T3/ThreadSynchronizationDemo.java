class BankAccount {

    private double balance = 1000;

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

class DepositThread extends Thread {

    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

class WithdrawThread extends Thread {

    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(300);
    }
}

public class ThreadSynchronizationDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread d = new DepositThread(account);
        WithdrawThread w = new WithdrawThread(account);

        d.start();
        w.start();
    }
}