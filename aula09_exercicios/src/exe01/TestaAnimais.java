
package exe01;

import java.util.ArrayList;

public class TestaAnimais {
    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();
        
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Vaca cow = new Vaca();
        
        lista.add(dog);
        lista.add(cat);
        lista.add(cow);
        
        for (Animal animal : lista) {
            animal.emitirSom();
        }
    }
}
