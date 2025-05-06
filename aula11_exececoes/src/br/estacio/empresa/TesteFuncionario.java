
package br.estacio.empresa;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Juca", 5000);
        
        double resultado = 0;
        
        Funcionario f2 = new Funcionario("", 0);
        
        try{
            //Todo trecho de código que pode vir a lançar um exceção
            resultado = 10 / 0;
        }catch(ArithmeticException e){
            //Exceção --> Exception
            //Bloco onde a exceção será tratada
            System.out.println("Erro: " + e);
            System.out.println("Ocorreu uma exceção por divisão por ZERO!!!");
        }catch(Exception e){
            System.out.println("Erro: " + e);
        }
        System.out.println(resultado); 
                
        int vetor[] = {1,2,3,4,5};
        
        try{
            System.out.println("O elemento na ultima posição é: " + vetor[6]);      
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e);
            System.out.println("O elemento na ultima posição é: " + vetor[4]);
        }                            
        System.out.println("Fim do programa!");        
    }
}
