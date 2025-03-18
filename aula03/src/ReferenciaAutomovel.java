
public class ReferenciaAutomovel {
    public static void main(String[] args) {
        Automovel carro1 = new Automovel();
        
        carro1.cor = "Amarelo";
        carro1.aro = 17;
        carro1.marca = "Toyota";
        carro1.modelo = "Hilux";
        carro1.placa = "ABC1234";
        carro1.motor = "Turbo";
        
        Automovel carro2 = carro1;
        
        //carro2.modelo = "Corolla";
        
        carro2.exibeDados();
        
        System.out.println(carro1);
        System.out.println(carro2);
        
        Automovel carro3 = new Automovel();
        carro3.cor = "Amarelo";
        carro3.aro = 17;
        carro3.marca = "Toyota";
        carro3.modelo = "Hilux";
        carro3.placa = "ABC1234";
        carro3.motor = "Turbo";
        
        
        System.out.println(carro1 == carro2);
        System.out.println(carro1.equals(carro3));
        
        //System.out.println(carro1.modelo == carro3.modelo);
    }
}
