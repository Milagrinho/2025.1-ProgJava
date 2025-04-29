
package br.estacio.loja;

public class TesteProdutos {
    public static void main(String[] args) {
        //Produto p1 = new Produto("Processador", Double.valueOf(1000));
        
        Software s1 = new Software("Editor de texto", Double.valueOf(200), "1.0");
        Hardware h1 = new Hardware(Fabricantes.Gigabyte, "Placa mãe", Double.valueOf(350));
        Hardware h2 = new Hardware(Fabricantes.Amd, "Processador", Double.valueOf(1000));
        Produto v1 = new Vestuario("GG", "Camiseta", Double.valueOf(50));
        
        System.out.println("Preço de venda: " + s1.calcularPreco());
        System.out.println("Preço de venda: " + h1.calcularPreco());
        System.out.println("Preço de venda: " + v1.calcularPreco());
        
        System.out.println("");
        
        s1.atualizaVersao("1.5");
        h1.atualizaVersao("1.1");
        h2.conectar(h1);
    }
}