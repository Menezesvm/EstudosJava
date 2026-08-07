import java.util.Scanner;


class SistemaBiblioteca {


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);


        Biblioteca biblioteca = new Biblioteca();


        int opcao = 0;



        while(opcao != 5) {


            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("5 - Sair");


            System.out.print("Escolha: ");

            opcao = entrada.nextInt();

            entrada.nextLine();



            switch(opcao) {



                case 1:


                    System.out.print("Título: ");
                    String titulo = entrada.nextLine();


                    System.out.print("Autor: ");
                    String autor = entrada.nextLine();


                    System.out.print("Categoria: ");
                    String categoria = entrada.nextLine();


                    System.out.print("ISBN: ");
                    String isbn = entrada.nextLine();


                    System.out.print("Ano: ");
                    int ano = entrada.nextInt();



                    Livro livro = new Livro(
                            titulo,
                            autor,
                            categoria,
                            isbn,
                            ano
                    );


                    biblioteca.adicionarLivro(livro);


                    break;



                case 2:


                    biblioteca.listarLivros();


                    break;



                case 3:


                    System.out.print("Digite o título do livro: ");

                    String tituloEmprestar = entrada.nextLine();


                    Livro livroEmprestar =
                            biblioteca.buscarLivro(tituloEmprestar);



                    if(livroEmprestar != null) {

                        livroEmprestar.emprestar();

                    } else {

                        System.out.println("Livro não encontrado.");

                    }


                    break;



                case 4:


                    System.out.print("Digite o título do livro: ");

                    String tituloDevolver = entrada.nextLine();



                    Livro livroDevolver =
                            biblioteca.buscarLivro(tituloDevolver);



                    if(livroDevolver != null) {


                        livroDevolver.devolver();


                    } else {

                        System.out.println("Livro não encontrado.");

                    }


                    break;



                case 5:


                    System.out.println("Sistema encerrado.");

                    break;



                default:


                    System.out.println("Opção inválida.");

            }


        }


    }

}