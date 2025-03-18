public class TestaAutomovel {
    //psvm +  TAB ==> MAIN
    public static void main(String[] args) {
        //Instanciação [new]
        Automovel carro1 = new Automovel();
        
        //Atribuindo valores a uma instancia
        //DOT NOTATION
        carro1.cor = "Amarelo";
        carro1.aro = 17;
        carro1.marca = "Toyota";
        carro1.modelo = "Hilux";
        carro1.placa = "ABC1234";
        carro1.motor = "Turbo";
        
        //Acessando as propriedades de carro1
//        System.out.println("Cor: " + carro1.cor);
//        System.out.println("Aro: " + carro1.aro);
//        System.out.println("Marca: " + carro1.marca);
//        System.out.println("Modelo: " + carro1.modelo);
//        System.out.println("Placa: " + carro1.placa);
//        System.out.println("Motor: " + carro1.motor);
          carro1.exibeDados();


        Automovel carro2 = new Automovel();
        
        carro2.cor = "Vermelho";
        carro2.aro = 14;
        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.placa = "XYZ9876";
        carro2.motor = "Turbo Fire";
        
        System.out.println("");
        
        //Acessando as propriedades de carro2
//        System.out.println("Cor: " + carro2.cor);
//        System.out.println("Aro: " + carro2.aro);
//        System.out.println("Marca: " + carro2.marca);
//        System.out.println("Modelo: " + carro2.modelo);
//        System.out.println("Placa: " + carro2.placa);
//        System.out.println("Motor: " + carro2.motor);
          carro2.exibeDados();
    }
}
