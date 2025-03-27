
package br.estacio.javabank.modelo;

public class Titular {
    //Propriedades (encapsuladas)
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String endereco;
    
    public Titular(String nome, String cpf, String dataDeNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
    }
    //ALT + INSERT ==> Generate Code
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }    
}
