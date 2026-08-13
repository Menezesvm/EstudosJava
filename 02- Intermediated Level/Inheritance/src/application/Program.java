package application;

import entities.Account;
import entities.BusinessAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc1 = new Account(200, "Vinícius", 5000.00);
        Account acc2 = new BusinessAccount(201,"Menezes", 0.0,10000.00);

        acc1.deposit(500.00);
        System.out.println(acc1.getBalance());
        acc1.withdraw(300.00);
        System.out.println(acc1.getBalance());


        acc2.deposit(5000.00);
        System.out.println(acc2.getBalance());
        acc2.withdraw(300.00);
        System.out.println(acc2.getBalance());



        sc.close();
        }
    }