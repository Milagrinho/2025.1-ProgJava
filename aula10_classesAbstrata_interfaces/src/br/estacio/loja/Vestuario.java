
package br.estacio.loja;
//O modificador final em classes indica que ela não poderá possuir subclasses
public final class Vestuario extends Produto{
    private String tamanho;

    public Vestuario(String tamanho, String nome, Double precoBase) {
        super(nome, precoBase);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 1.5;//50%
    }
}
