
package br.estacio.loja;


public class Cliente {
    private String nome;
    private Carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    public void adicionarAoCarrinho(Produto produto){
        carrinho.adicionarProduto(produto);
    }
    
    public void verTotal(){
        System.out.println("Total R$" + carrinho.calcularTotal());
    }

    
    
}
