package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder:");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(holder, number);
        }

        System.out.println();
        System.out.print("Account data:");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("update account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("update account data:");
        System.out.println(account);

        sc.close();
    }
}