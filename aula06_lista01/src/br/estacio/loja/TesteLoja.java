
package br.estacio.loja;


public class TesteLoja {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 20);
        Produto p2 = new Produto("Teclado", 30);
        Produto p3 = new Produto("Monitor", 250);
        
        
        
        Cliente cli = new Cliente("Juca");
        
        cli.adicionarAoCarrinho(p1);
        cli.adicionarAoCarrinho(p2);
        cli.adicionarAoCarrinho(p3);
        
        cli.verTotal();
    }
}
