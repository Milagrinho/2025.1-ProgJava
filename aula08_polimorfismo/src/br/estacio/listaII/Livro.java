
package br.estacio.listaII;


public class Livro extends Produto{
    private static Integer totalLivros = 0;
    private String autor;
    
    public Livro(String nome, Double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
        totalLivros++;
    }
    
    public static int getTotalLivros(){
        return totalLivros;
    }    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados(); 
        System.out.println("Autor: " + autor);
    }
    
    
    
}
