package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessExceptions;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("======SISTEMA BANCÁRIO========\n");
            System.out.println("---Enter account data---");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            try {
                acc.withdraw(amount);
                System.out.printf("New balance: %.2f%n", acc.getBalance());
            }
            catch (BusinessExceptions e) {
                System.out.println(e.getMessage());
            }


        sc.close();

    }
}
