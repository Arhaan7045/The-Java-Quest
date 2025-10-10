package Day8.Inheritance_Polymorphism;

/*
Online Payment System
Base Class: Payment
Subclasses: CreditCardPayment, UPIPayment, NetBankingPayment
Override method pay(double amount)
Show runtime polymorphism by processing payments differently.
 */

import java.util.Scanner;

class Payment {
    public void pay(double amount) {
        System.out.println("Processing generic payment of ₹" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("💳 Processing Credit Card Payment of ₹" + amount);
        System.out.println("Applying 2% transaction fee...");
        double total = amount + (amount * 0.02);
        System.out.println("Total charged to credit card: ₹" + total);
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("📱 Processing UPI Payment of ₹" + amount);
        System.out.println("No transaction fee applied.");
        System.out.println("Payment successful through UPI!");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("💻 Processing NetBanking Payment of ₹" + amount);
        System.out.println("Applying ₹5 service charge...");
        double total = amount + 5;
        System.out.println("Total debited from bank account: ₹" + total);
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payment paymentMethod;

        System.out.println("===== 💰 Online Payment System =====");
        System.out.println("1. Credit Card Payment");
        System.out.println("2. UPI Payment");
        System.out.println("3. NetBanking Payment");
        System.out.print("Choose your payment method: ");
        int choice = scanner.nextInt();

        System.out.print("Enter payment amount: ₹");
        double amount = scanner.nextDouble();

        switch (choice) {
            case 1 -> paymentMethod = new CreditCardPayment();
            case 2 -> paymentMethod = new UPIPayment();
            case 3 -> paymentMethod = new NetBankingPayment();
            default -> {
                System.out.println("⚠️ Invalid choice! Defaulting to generic payment.");
                paymentMethod = new Payment();
            }
        }

        System.out.println("\n--- Transaction Details ---");
        paymentMethod.pay(amount); // polymorphic call

        System.out.println("\n✅ Payment Processed Successfully!");
        scanner.close();
    }
}
