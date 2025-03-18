
import java.util.Objects;

public class Automovel {
    //Propriedades [atributos]
    String placa;
    String motor;
    int aro;
    String marca;
    String modelo;
    String cor;
    
    //Comportamentos [funções]
    void exibeDados(){
        System.out.println("Placa: " + placa);
        System.out.println("Motor: " + motor);
        System.out.println("Aro: " + aro);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
    
    void buzinar(){
        System.out.println("Bi bi");
    }    
}