import java.util.Scanner;

public class EntradaSaidadeDados {
    public static void main(String[] args) {
        System.out.println("olá eu faço impressão e pulo a linha");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


    }
}
