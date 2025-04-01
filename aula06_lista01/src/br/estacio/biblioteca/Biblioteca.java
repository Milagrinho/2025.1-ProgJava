
package br.estacio.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private String nome;
    //Array
    //private Livro[] livro = new Livro[40];
    private List<Livro> lista;

    public Biblioteca(String nome) {
        this.nome = nome;
        lista = new ArrayList();
    }
    
    public void adicionarLivro(Livro livro){
        //Adiciona um livro a lista
        lista.add(livro);
    }
    
    public void listarLivros(){
        //for each
        for(Livro livro : lista){
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("");
        }
    }
    
    
}
