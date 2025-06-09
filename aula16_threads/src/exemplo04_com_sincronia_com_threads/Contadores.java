package exemplo04_com_sincronia_com_threads;

public class Contadores {

    public static int contadorGlobal = 0; // Recurso compartilhado

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Contador(1));
        Thread t2 = new Thread(new Contador(2));
        Thread t3 = new Thread(new Contador(3));
        Thread t4 = new Thread(new Contador(4));
        Thread t5 = new Thread(new Contador(5));
        
        long inicio = System.currentTimeMillis();        

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        // Espera as threads terminarem para verificar o resultado
        t1.join(); // Faz a thread principal esperar t1 terminar
        t2.join(); // Faz a thread principal esperar t2 terminar
        t3.join(); // Faz a thread principal esperar t3 terminar
        t4.join(); // Faz a thread principal esperar t4 terminar
        t5.join(); // Faz a thread principal esperar t5 terminar

        long fim = System.currentTimeMillis();
        // O valor esperado seria 500000
        System.out.println("***Final do contador global!***" + ((fim - inicio) /1000)  + " segundos");
    }
}
