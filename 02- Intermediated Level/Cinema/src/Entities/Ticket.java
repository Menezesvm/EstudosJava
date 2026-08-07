package Entities;

 public class Ticket {
     private String filmName;
     private double ticketPrice;
     private int age;
     private boolean cardStudent;

     public Ticket(String filmName, double ticketPrice, int age, boolean cardStudent) {
         this.filmName = filmName;
         this.ticketPrice = ticketPrice;
         this.age = age;
         this.cardStudent = cardStudent;
     }

    public double discountTicket() {
        if (this.age < 10) {
            return this.ticketPrice * 0.5;
        } else if (this.age >= 60) {
            return this.ticketPrice * 0.6;
        } else if (this.cardStudent) {
            return this.ticketPrice * 0.7;
        } else {
            return this.ticketPrice;
        }
    }

    public String getFilmName(){
         return this.filmName;

     }

     public double getTicketPrice(){
        return this.ticketPrice;

     }

     public int getAge(){
         return this.age;
     }

     public boolean getCardStudent(){
         return this.cardStudent;
     }

     public void setFilmName(String filmName) {
         this.filmName = filmName;
     }

     public void setTicketPrice(double ticketPrice) {

         if (ticketPrice > 0) {
             this.ticketPrice = ticketPrice;
         } else {
             System.out.println("Invalid ticket price.");
         }

     }

     public void setAge(int age) {

         if (age >= 0) {
             this.age = age;
         } else {
             System.out.println("Invalid age.");
         }

     }

     public void setCardStudent(boolean cardStudent) {
         this.cardStudent = cardStudent;
     }



     public void showResult() {
            System.out.println("Film : " + getFilmName());
            System.out.printf("Ticket Price : R$ %.2f%n ", getTicketPrice());
            System.out.println("Age : " + getAge());
            System.out.println("Card Student : " + (getCardStudent() ? "Yes" : "No"));
            System.out.printf("The price final is R$ %.2f%n", discountTicket());
        }


    }




