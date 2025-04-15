
package br.estacio.listaII;


public class DVD extends Produto{
    private static Integer totalDVDs = 0;
    private Integer duracao;
    
    public DVD(String nome, Double preco, Integer duracao) {
        super(nome, preco);        
        this.duracao = duracao;
        totalDVDs++;
    }
    
    public static int getTotalDVDs(){
        return totalDVDs;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados(); 
        System.out.println("Duração: " + duracao);
    }
}
