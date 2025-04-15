
package br.estacio.listaII;


public class TestaProdutos {
    public static void main(String[] args) {
        Livro p1 = new Livro("Aprendendo Java", Double.valueOf(50), "Juca");
        Livro p2 = new Livro("Banco de dados", Double.valueOf("150"), "Angela");
        CD p3 = new CD("Summer hits", Double.valueOf(20), 16);
        CD p4 = new CD("Rock hits", Double.valueOf(20), 20);
        DVD p5 = new DVD("Predador", Double.valueOf(35), 90);
        
        System.out.println("Produtos: " + Produto.getTotalProdutos());
        System.out.println("CDs: " + CD.getTotalCDs());
        System.out.println("DVDs: " + DVD.getTotalDVDs());
        System.out.println("Livros: " + Livro.getTotalLivros());
        
        p1.imprimeDados();
        p2.imprimeDados();
        p3.imprimeDados();
        p4.imprimeDados();
        p5.imprimeDados();
        
    }
}
