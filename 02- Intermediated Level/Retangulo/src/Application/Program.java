package Application;

import Entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo rect = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        rect.Weidth = sc.nextDouble();
        rect.Height = sc.nextDouble();

        System.out.println();
        System.out.println("Area is " + rect.Area());
        System.out.println("Perimeter is " + rect.Perimeter());
        System.out.println("Diagonal is " + rect.Diagonal());

        sc.close();


        }
    }
