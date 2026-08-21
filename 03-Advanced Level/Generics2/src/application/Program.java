package application;

import java.util.Arrays;
import java.util.List;

import entities.Product;
import generics.Util;

public class Program {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(5, 12, 8, 30, 17);
        Integer majorNum = Util.major(num);
        System.out.println("Major number: " + majorNum);

        List<Product> product = Arrays.asList(
                new Product("Teclado", 150.0),
                new Product("Monitor", 890.0),
                new Product("Mouse", 60.0)
        );
        Product majorProduct = Util.major(product);
        System.out.println("Most expensive product: " + majorProduct);
    }
}