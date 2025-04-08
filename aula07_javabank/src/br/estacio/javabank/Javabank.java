
package br.estacio.javabank;

import br.estacio.javabank.modelo.Conta;
import br.estacio.javabank.modelo.Titular;

public class Javabank {
 
    public static void main(String[] args) {
        //Quantos clientes estão logados nesse momento?
        Conta cc1 = new Conta(1000, new Titular("Angela", "1234", "01/01/2000", "Rua Z" ));
        System.out.println("Total: " + Conta.getTotalContas());
        
        Titular t1 = new Titular("Juca", "4567", "23/12/2005", "Avendia 123");
        Conta cc2 = new Conta(1001, t1);
        System.out.println("Total: " + Conta.getTotalContas());
        
        cc1.deposito(700);
        cc2.deposito(400);
        
        System.out.println("Numero: " + cc1.getNumero());
        System.out.println("Saldo: " + cc1.getSaldo());
        System.out.println("Titular: " + cc1.getTitular());
        System.out.println("");
        
        System.out.println("Numero: " + cc2.getNumero());
        System.out.println("Saldo: " + cc2.getSaldo());
        System.out.println("Titular: " + cc2.getTitular());
        System.out.println("");
        
        cc1.saque(500);
        //Alterando o nome do titular
        cc1.getTitular().setNome("Li");
        
        System.out.println("Numero: " + cc1.getNumero());
        System.out.println("Saldo: " + cc1.getSaldo());
        System.out.println("Titular: " + cc1.getTitular());
        System.out.println("");
        
        System.out.println("Numero: " + cc2.getNumero());
        System.out.println("Saldo: " + cc2.getSaldo());
        System.out.println("Titular: " + cc2.getTitular());
        System.out.println("");
        
        cc2.transferencia(150, cc1);
        
        System.out.println("Numero: " + cc1.getNumero());
        System.out.println("Saldo: " + cc1.getSaldo());
        System.out.println("Titular: " + cc1.getTitular());
        System.out.println("");
        
        System.out.println("Numero: " + cc2.getNumero());
        System.out.println("Saldo: " + cc2.getSaldo());
        System.out.println("Titular: " + cc2.getTitular());
        System.out.println("");
    }
    
}
