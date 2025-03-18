
package javabank;

public class Conta {
    //Propriedades
    private int numero;
    private double saldo;
    private String titular;
    //Construtor
    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    //Comportamentos
    public boolean saque(double valor){
        if (valor <= saldo && valor > 0){
            saldo = saldo - valor;
            return true;
        }else{
            System.out.println("Falha na operação!");
            return false;
        }
    }
    
    public boolean deposito(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }else{
            System.out.println("Falha na operação!");
            return false;
        }        
    }
    public void transferencia(double valor, Conta favorecido){ 
        if(saque(valor) == true){
            favorecido.deposito(valor);
            System.out.println("Transferencia realizada com sucesso!");
        }
    }
}
