
package br.estacio.biblioteca;


public class TesteBiblioteca {
    public static void main(String[] args) {
        Autor a1 = new Autor("Juca", "Brasileiro");
        Autor a2 = new Autor("Angela", "Portuguesa");
        
        Livro l1 = new Livro("Aprendendo Java", "12134", a1);
        Livro l2 = new Livro("Aprendendo Python", "96325", a1);
        Livro l3 = new Livro("Banco de dados", "11223", a2);
        
        Biblioteca b1 = new Biblioteca("ABC");
        
        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);
        b1.adicionarLivro(l3);
        
        b1.listarLivros();
    }
}
