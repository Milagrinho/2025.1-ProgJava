package br.estacio.listaII;

public class CD extends Produto{
    private Integer numeroFaixas;
    private static Integer totalCDs = 0;
    
    public CD(String nome, Double preco, Integer numeroFaixas){
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
        totalCDs++;
    }
    
    public static int getTotalCDs(){
        return totalCDs;
    }

    public Integer getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(Integer numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados(); 
        System.out.println("Numero de faixas: " + numeroFaixas);
    }
    
    
}
