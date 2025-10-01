package Day7.OOP;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println();
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.printf("%nDeposited: %,.2f₹ | New Balance: %,.2f₹", amount, balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.printf("%nWithdrawn: %,.2f₹ | New Balance: %,.2f₹ %n", amount, balance);
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
    void checkBalance() {
        System.out.printf("%nAccount No: %d | Balance: %,.2f₹", accountNumber, balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, 10000);

        acc1.checkBalance();
        acc1.withdraw(2500);
        acc1.deposit(5000);
        acc1.checkBalance();

        BankAccount acc2 = new BankAccount(102,25000);
        acc2.checkBalance();

        BankAccount acc3 = new BankAccount(103, 18000);
        acc3.checkBalance();
        acc3.withdraw(4000);
        acc3.withdraw(15000);
    }
}
