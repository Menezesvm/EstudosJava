import java.util.ArrayList;

public class Biblioteca {


    private ArrayList<Livro> livros;


    public Biblioteca() {

        livros = new ArrayList<>();

    }


    public void adicionarLivro(Livro livro) {

        livros.add(livro);

        System.out.println("Livro cadastrado!");

    }


    public void listarLivros() {


        if (livros.size() == 0) {

            System.out.println("Nenhum livro cadastrado.");

        } else {


            for (Livro livro : livros) {

                livro.mostrarDados();

            }

        }

    }


    public Livro buscarLivro(String titulo) {


        for (Livro livro : livros) {


            if (livro.getTitulo().equalsIgnoreCase(titulo)) {

                return livro;

            }

        }


        return null;

    }

}