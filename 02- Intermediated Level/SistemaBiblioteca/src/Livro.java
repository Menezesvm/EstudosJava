public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private String isbn;
    private int ano;
    private boolean emprestado;


    public Livro(String titulo, String autor, String categoria,
                 String isbn, int ano) {

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
        this.ano = ano;
        this.emprestado = false;

    }


    // GETTERS

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public String getCategoria() {
        return categoria;
    }


    public String getIsbn() {
        return isbn;
    }


    public int getAno() {
        return ano;
    }


    public boolean isEmprestado() {
        return emprestado;
    }


    // SETTERS

    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }


    public void setAno(int ano) {

        if (ano > 0) {

            this.ano = ano;

        } else {

            System.out.println("Ano inválido");

        }

    }


    // COMPORTAMENTOS DO LIVRO

    public void emprestar() {

        if (!emprestado) {

            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");

        } else {

            System.out.println("Livro já está emprestado!");

        }

    }


    public void devolver() {

        if (emprestado) {

            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");

        } else {

            System.out.println("Livro já está disponível!");

        }

    }


    public void mostrarDados() {

        System.out.println("---------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
        System.out.println("Emprestado: " + emprestado);

    }

}