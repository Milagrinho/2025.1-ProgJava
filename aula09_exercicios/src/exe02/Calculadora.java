
package exe02;

public class Calculadora {
    /**
     * A função somar recebe 2 valores inteiros e retorna a soma.
     * @param valor1 primeiro valor a ser passado
     * @param valor2 segundo valor a ser passado
     * @return soma dos valores
     */
    public double somar(int valor1, int valor2){
        return valor1 + valor2;
    }
    
    public double somar(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public double somar(int valor1, int valor2, int valor3){
        return valor1 + valor2 + valor3;
    }
    
    //O parametro numeros do tipo int... gera um vetor de tamanho igual 
    //a quantidade de parametros passados. 
    public double somar(int... numeros){
        double soma = 0;
        
        for (int numero : numeros) {
            soma += numero;
        }
        
        return soma;
    }
}
