package br.estacio.javabank.modelo;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Juca", "123456", 5000);
        //f1.setNome("Juca");
        //f1.setCpf("12345");
        //f1.setSalario(5000);
        
        Gerente g1 = new Gerente("Angela", "98765", 10000, "ABC1234");
        //g1.setNome("Angela");
        //g1.setCpf("98765");
        //g1.setSalario(10000);
        //g1.setSenha("ABC1234");
        
        System.out.println("Salario [f1]: " + f1.getSalario());
        System.out.println("Bonus [f1]: " + f1.calculaBonificacao());
        System.out.println("");
        System.out.println("Salario [g1]: " + g1.getSalario());
        System.out.println("Bonus [g1]: " + g1.calculaBonificacao());
        
        System.out.println("");
        f1.imprimeDados();
        System.out.println("");
        g1.imprimeDados();
        
         ControlaBonificacao cb = new ControlaBonificacao();
         
         cb.adicionaBonus(f1);
         cb.adicionaBonus(g1);
         
         System.out.println("Total pago (bonus): " + cb.getTotalPago());
         
         System.out.println(f1);
        
    }
}
