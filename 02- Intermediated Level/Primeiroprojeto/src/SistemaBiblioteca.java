// Importa a classe Scanner para permitir a leitura de dados digitados pelo usuário.
import java.util.Scanner;

// Declara a classe principal do programa.
public class SistemaBiblioteca {

    // Cria um Scanner estático para que todos os métodos possam utilizá-lo.
    static Scanner entrada = new Scanner(System.in);

    // Variáveis que armazenam as informações do livro.
    static String titulo;
    static String autor;
    static int ano;

    // Indica se existe um livro cadastrado.
    static boolean livroCadastrado;

    // Indica se o livro está emprestado.
    static boolean livroEmprestado;

    // Método principal. A execução do programa começa aqui.
    public static void main(String[] args) {

        // Guarda a opção escolhida pelo usuário no menu.
        int opcao = 0;

        // Repete o programa até que o usuário escolha a opção 5 (Sair).
        while (opcao != 5) {

            // Exibe o menu na tela.
            mostraMenu();

            // Solicita a opção desejada.
            System.out.println("Escolha uma opção: ");

            // Lê a opção digitada.
            opcao = entrada.nextInt();

            // Consome o ENTER deixado pelo nextInt().
            entrada.nextLine();

            // Executa uma ação conforme a opção escolhida.
            switch (opcao) {

                case 1:
                    cadastrarLivro();
                    break;

                case 2:
                    emprestarLivro();
                    break;

                case 3:
                    devolverLivro();
                    break;

                case 4:
                    mostrarDados();
                    break;

                case 5:
                    System.out.println("Programa encerrado.");
                    break;

                case 6:
                    limparCadastro();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        // Fecha o Scanner antes de encerrar o programa.
        entrada.close();
    }

    // Exibe todas as opções disponíveis para o usuário.
    public static void mostraMenu() {

        System.out.println("\n====== SISTEMA DE BIBLIOTECA ======");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Emprestar livro");
        System.out.println("3 - Devolver livro");
        System.out.println("4 - Mostrar informações do livro");
        System.out.println("5 - Sair");
        System.out.println("6 - Limpar cadastro");
    }

    // Recebe os dados do livro e os armazena nas variáveis.
    public static void cadastrarLivro() {

        System.out.println("\n--- CADASTRAR LIVRO ---");

        System.out.print("Título: ");
        titulo = entrada.nextLine();

        System.out.print("Autor: ");
        autor = entrada.nextLine();

        System.out.print("Ano: ");
        ano = entrada.nextInt();

        // Informa ao sistema que agora existe um livro cadastrado.
        livroCadastrado = true;

        // Todo livro recém-cadastrado começa disponível.
        livroEmprestado = false;

        System.out.println("Livro cadastrado com sucesso!");
    }

    // Realiza o empréstimo do livro.
    public static void emprestarLivro() {

        // Primeiro verifica se existe algum livro cadastrado.
        if (!livroCadastrado) {

            System.out.println("Nenhum livro cadastrado.");

            // Encerra o método imediatamente.
            return;
        }

        // Verifica se o livro já está emprestado.
        if (livroEmprestado) {

            System.out.println("Livro já está emprestado.");

        } else {

            // Marca o livro como emprestado.
            livroEmprestado = true;

            System.out.println("Livro emprestado com sucesso.");
        }
    }

    // Realiza a devolução do livro.
    public static void devolverLivro() {

        // Só devolve se realmente estiver emprestado.
        if (livroEmprestado) {

            // O livro volta a ficar disponível.
            livroEmprestado = false;

            System.out.println("Livro devolvido com sucesso.");

        } else {

            System.out.println("Nenhum livro está emprestado.");
        }
    }

    // Retorna a situação atual do livro.
    public static String obterSituacao() {

        // Se estiver emprestado, devolve essa informação.
        if (livroEmprestado) {

            return "Emprestado";

        } else {

            return "Disponível";
        }
    }

    // Exibe todas as informações do livro.
    public static void mostrarDados() {

        // Primeiro verifica se existe um livro cadastrado.
        if (livroCadastrado) {

            System.out.println("\n=== DADOS DO LIVRO ===");

            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + ano);

            // Chama outro método para descobrir a situação do livro.
            System.out.println("Situação: " + obterSituacao());

        } else {

            System.out.println("Nenhum livro cadastrado.");
        }
    }

    // Apaga todas as informações armazenadas.
    public static void limparCadastro() {

        titulo = "";
        autor = "";
        ano = 0;

        // Remove a informação de que existe um livro cadastrado.
        livroCadastrado = false;

        // Garante que o livro também não fique marcado como emprestado.
        livroEmprestado = false;

        System.out.println("Cadastro apagado com sucesso!");
    }
}