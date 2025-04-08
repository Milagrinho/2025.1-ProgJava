
package br.estacio.javabank.modelo;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;    
    //JAVA BEANS
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public Funcionario(){
        
    }
       
    public double calculaBonificacao(){
        //10% do salario
        return salario * 0.1;
    }
    
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println(String.format("Salário: R$%.2f", salario));
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
