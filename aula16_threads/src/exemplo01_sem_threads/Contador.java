package exemplo01_sem_threads;

public class Contador {
    
    private final int numero;
    
    public Contador(int numero){
        this.numero = numero;
    }
    
    public void executa() {
        for (long i = 1; i <= 100000; i++) {
            System.out.printf("Contador %d: %d \n", numero, i);
        }
        
        System.out.printf("Contador %d terminou de incrementar.\n", numero);
    }
}
