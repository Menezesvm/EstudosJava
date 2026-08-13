package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter product #" + i + ": ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'u') {
                System.out.print("Enter date fabrication: ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));

            }
        }
            System.out.println();
            System.out.println("Price tags: ");
            for (Product prod : list){
                System.out.println(prod.priceTag());
            }



        sc.close();
    }
}