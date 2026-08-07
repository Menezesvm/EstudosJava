package Application;

import Entities.Ticket;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the name of the film? ");
        String filmName = sc.nextLine();

        System.out.print("what is your ticket price? ");
        double ticketPrice = sc.nextDouble();

        System.out.print("What is your age? ");
        int age = sc.nextInt();

        System.out.print("Do you have a valid student card?");
        boolean cardStudent = sc.nextBoolean();

        Ticket ticket = new Ticket(filmName, ticketPrice, age, cardStudent);

        ticket.showResult();



        sc.close();
    }
}