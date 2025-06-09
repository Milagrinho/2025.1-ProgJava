package exemplo01_sem_threads;

public class Contadores {

    public static void main(String[] args) throws InterruptedException {
        Contador conta01 = new Contador(1);
        Contador conta02 = new Contador(2);
        Contador conta03 = new Contador(3);
        Contador conta04 = new Contador(4);
        Contador conta05 = new Contador(5);
                
        conta01.executa();
        conta02.executa();
        conta03.executa();
        conta04.executa();
        conta05.executa();
        
        System.out.println("***Final do contador global!***");
    }
}

