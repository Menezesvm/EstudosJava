import java.util.Scanner;

public class CaixaEletronico {
   static Scanner input = new Scanner(System.in);

   static double saldo = 1000.00;
   static double valor;
   static int senha = 1234;
   static int senhaDigitada;
   static int novaSenha;
   static int quantidadeDeposito;
   static int quantidadeSaque;
   static int quantidadeTransferencia;
   static String nomeCliente = "Vinícius";



    public static void main(String[] args) {

        int opcao = 0;

        while(opcao != 7){

          mostrarMenu();

          System.out.println();
          System.out.println("Escolha uma opcao: ");

          opcao = input.nextInt();
          input.nextLine();

          switch(opcao){
              case 1:
                  consultaSaldo();
                  break;
              case 2:
                  depositar();
                  break;
              case 3:
                  sacar();
                  break;
              case 4:
                  transferir();
                  break;
              case 5:
                  alterarSenha();
                  break;
              case 6:
                  mostrarExtrato();
                  break;
              case 7:
                  System.out.println("Programa finalizado!");
                  break;
              default:
                  System.out.println("Opção inválida!");
                  break;


          }

        }
        input.close();
        }

    public static void mostrarMenu() {
        System.out.println("===============================");
        System.out.println("       Caixa Eletrônico");
        System.out.println("===============================");

        System.out.println();

        System.out.println("Seja muito Bem vindo, " + nomeCliente + "!");
        System.out.println();

        System.out.println("1. Consulta saldo");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Transferir");
        System.out.println("5. Alterar senha");
        System.out.println("6. Mostrar Extrato");
        System.out.println("7. Sair");
        }

    public static void consultaSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", saldo);
    }

    public static void depositar() {

            System.out.println("Digite o valor do deposito: ");
            valor = input.nextDouble();

        if (valor > 0){

            System.out.println(" Deposito realizado com sucesso!");
            saldo = saldo + valor;
            quantidadeDeposito++;
            System.out.println("Saldo atual: "  + saldo);

            }else{

            System.out.println("Erro ao depositar!");
            }

    }

    public static void sacar() {
            System.out.println("Digite o valor do saque: ");
            valor = input.nextInt();

        if (valor <= 0) {

            System.out.println("Opção inválida");

        }else if(valor > saldo) {

            System.out.println("Saldo insuficiente!");

        }else{

            saldo = saldo - valor;
            quantidadeSaque++;
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f%n ", saldo);

        }

    }

    public static void transferir() {

            System.out.println("Digite o valor a transferir: ");
            valor = input.nextInt();

        if(valor <= 0 ){

            System.out.println("Valor inválido!");

        }else if(valor > saldo){

            System.out.println("Saldo insuficiente!");

        }else{

            saldo = saldo - valor;
            quantidadeTransferencia++;
            System.out.println("Transferência realizada com sucesso!");
            System.out.printf("Saldo disponível: R$ %.2f%n", saldo);

        }

    }

    public static void alterarSenha() {

            System.out.println("Digite sua senha atual:");
            senhaDigitada = input.nextInt();

        if(senhaDigitada == senha){

            System.out.println("Senha correta");
            System.out.println("Digite a senha que deseja alterar!");
            novaSenha = input.nextInt();

            senha = novaSenha;

            System.out.println("Senha alterada com sucesso!");

        }else{

            System.out.println("Senha incorreta!");
        }
    }

    public static void mostrarExtrato() {

            System.out.println("===========================");
            System.out.println("         EXTRATO");
            System.out.println("===========================");

            System.out.println();

            System.out.println("Cliente: " + nomeCliente);

            System.out.println();

            System.out.printf("Saldo disponível: R$ %.2f%n", saldo);

            System.out.println();

            System.out.println("Quantidade de deposito: " + quantidadeDeposito);
            System.out.println("Quantidade de saque: " + quantidadeSaque);
            System.out.println("Quantidade de transferencia: " + quantidadeTransferencia);

            System.out.println();

            System.out.println("Obrigado por utilizar o nosso banco!" + "Volte sempre");
        }

    }




