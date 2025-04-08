
package br.estacio.javabank.modelo;

public class Conta {
    //Propriedades
    private int numero;
    private double saldo;
    private Titular titular;
    //Um membro static é compartilhado entre todas as instancias
    private static int totalContas = 0;//Armazena quantas contas foram instanciadas na sessão
    
    //Construtor
    public Conta(int numero, Titular titular){
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
        totalContas++;//adiciona 1 ao total contas quando uma conta for criada
    }
    //Getter & Setters
    public static int getTotalContas(){
        return totalContas;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public Titular getTitular(){
        return titular;
    }
    
    public void setTitular(Titular titular){
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
