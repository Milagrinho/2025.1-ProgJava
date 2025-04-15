
package br.estacio.listaII;

public class Produto {
    private static Integer totalProdutos = 0;
    private String nome;
    //Wrapper
    private Double preco;
    
    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
        totalProdutos++;
    }
    
    public Produto(){
        totalProdutos++;
    }
    
    public static int getTotalProdutos(){
        return totalProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
