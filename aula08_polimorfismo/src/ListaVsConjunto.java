
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListaVsConjunto {
    public static void main(String[] args) {
        int tamanho = 1000000;
        
        //List<Integer> colecao = new ArrayList<>();
        Set<Integer> colecao = new HashSet<>();
        
        double inicio = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            colecao.add(i);
        }
                
        for (Integer integer : colecao) {
            colecao.contains(integer);
        }
        
        double fim = System.currentTimeMillis();
        
        double duracao = (fim - inicio) / 1000;
        
        System.out.println("Duração: " + duracao);
    }
}
