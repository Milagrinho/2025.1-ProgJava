
package exe02;


public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(7.0, 4.4));//2 doubles
        System.out.println(calc.somar(8, 5)); // 2 ints
        System.out.println(calc.somar(7, 4, 9));//3 ints
        System.out.println(calc.somar(1,2,3,4,5,6,7,8,9,10));
    }
}
