package application;

import entities.TaxPrayer;
import entities.Company;
import entities.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPrayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Tax payer #" + i + "Data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.println("Health expenditures: ");
                double healthExpenditure = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditure));
            } else if (type == 'c') {
                System.out.println("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }

            double sum = 0.0;
            System.out.println();
            System.out.println("TAXES PAID: ");
            for (TaxPrayer tp : list) {
                double tax = tp.tax();
                System.out.printf(tp.getName() + String.format("%.2f", tax));
                sum += tax;
            }
            System.out.println();
            System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

            sc.close();
        }
        }
    }
