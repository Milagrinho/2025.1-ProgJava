
package br.estacio.empresa;


public class Funcionario {
    private String nome;
    private double salario;
    
    //Construtor
    public Funcionario(String nome, double salario) {
        setNome(nome);
        this.salario = salario;
    }
    
    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals("")){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }else{
            this.nome = nome;
        }        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws Exception{
        if(salario <= 0){
            throw new Exception("O salario deve ser um valor positivo!");
        }
        this.salario = salario;
    }    
}
