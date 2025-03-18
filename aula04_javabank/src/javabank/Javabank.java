
package javabank;


public class Javabank {

 
    public static void main(String[] args) {
        Conta cc1 = new Conta(1000, "Angela");
        Conta cc2 = new Conta(1001, "Juca");
        
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
        cc1.setTitular("Angela Farias");
        
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
