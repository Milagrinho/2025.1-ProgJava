
package br.estacio.biblioteca;


public class Livro {
    private String titulo;
    private String ISBN;
    private Autor autor;

    public Livro(String titulo, String ISBN, Autor autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
