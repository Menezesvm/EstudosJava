package application;


import generics.Box;

public class Program {
    public static <T> void main(String[] args) {

        Box<String> boxTxt = new Box<>();
        boxTxt.guardar("Vamos focar nos estudos Java! ");

        Box<Integer> boxInt = new Box<>();
        boxInt.guardar(1987);

        System.out.println(boxTxt.pegar());
        System.out.println(boxInt.pegar());

        }
    }
