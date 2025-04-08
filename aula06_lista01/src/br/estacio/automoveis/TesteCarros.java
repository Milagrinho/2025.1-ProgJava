
package br.estacio.automoveis;

import java.util.ArrayList;
import java.util.List;


public class TesteCarros {
    public static void main(String[] args) {
        Motor m1 = new Motor(150, 200);
        Pneu p1 = new Pneu("Pirelli", 18);
        List<Pneu> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p1);
        lista.add(p1);
        lista.add(p1);
        lista.add(p1);
        Carro c1 = new Carro("Gol", m1, lista);
        
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Motor: " + c1.getMotor().getPotencia());
        System.out.println("Pneus: " + c1.getPneus().get(0).getMarca());
    }
}