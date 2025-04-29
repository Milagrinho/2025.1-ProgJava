
package br.estacio.loja;

public abstract class Produto {
    private String nome;
    private Double precoBase;
    
    public Produto(String nome, Double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }
    
    //Um método abstrato não possui implementação, apenas a sua assinatura.
    //Todo filho concreto de Produto deve reescrever a função calcularPreco.
    public abstract double calcularPreco();
}
