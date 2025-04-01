
package br.estacio.loja;

import java.util.ArrayList;
import java.util.List;


public class Carrinho {
    List<Produto> lista;

    public Carrinho() {
        lista = new ArrayList();
    }
    
    public void adicionarProduto(Produto produto){
        lista.add(produto);
    }
    
    public float calcularTotal(){
        float total = 0;
        
        for(Produto produto : lista){
            total += produto.getPreco();
        }
        
        return total;
    }
}
