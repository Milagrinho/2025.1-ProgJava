
package br.estacio.javabank.modelo;


public class Gerente extends Funcionario{
    private String senha;
    
    public Gerente(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }
    
    //Anotação
    //reescrita
    @Override
    public double calculaBonificacao() {
        return getSalario() * 0.15 + 1000;
    }  
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Senha: " + senha);
    }
    
    public boolean login(){
        return false;
    }
    
    //Getters e Setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
