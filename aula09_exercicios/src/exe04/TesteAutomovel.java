
package exe04;


public class TesteAutomovel {
    public static void main(String[] args) {
        
        //Duas instancias apenas com placas diferentes
        Automovel auto1 = new Automovel("Gol", "VW", 2010, "ABC1234");
        Automovel auto2 = new Automovel("Gol", "VW", 2010, "XYZ9876");
        
        //O padrao é verificar as posicoes de memoria
        System.out.println(auto1 == auto2);//false
        
        System.out.println(auto1);
        System.out.println(auto2);
        
        System.out.println(auto1.hashCode());
        System.out.println(auto2.hashCode());
    }
}

