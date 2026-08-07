package Application;

import Util.currencyConverter;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars do you want to buy? ");
        double amount = sc.nextDouble();
        double result = currencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n" , result);

        sc.close();
}
}
