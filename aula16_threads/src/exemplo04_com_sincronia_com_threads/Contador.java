package exemplo04_com_sincronia_com_threads;

public class Contador implements Runnable {

    private final int numero;

    public Contador (int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (long i = 1; i <= 100000; i++) {
            synchronized (Contadores.class) {
                System.out.printf("Contador %d: %d \n", numero, (++Contadores.contadorGlobal));
            }
        }

        System.out.printf("Contador %d terminou de incrementar.\n", numero);
    }
}
