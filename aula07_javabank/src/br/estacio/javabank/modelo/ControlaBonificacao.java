
package br.estacio.javabank.modelo;


public class ControlaBonificacao {
    private double totalPago = 0;
    
    public double getTotalPago(){
        return totalPago;
    }
    
    public void adicionaBonus(Funcionario funcionario){
        totalPago = totalPago + funcionario.calculaBonificacao();
    }
}
