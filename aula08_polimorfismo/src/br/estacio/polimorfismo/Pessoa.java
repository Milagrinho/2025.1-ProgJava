
package br.estacio.polimorfismo;

public class Pessoa{
    private String nome;
    private String email;
    private String cpf;

    public Pessoa(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + 
                "E-mail: " + email + "\n" +
                "CPF: " + cpf + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        //Verificar se o valor é nulo
        if(obj == null){
            return false;
        }
        
        //Verificar se é uma instancia da classe
        if(obj.getClass() == getClass()){
            Pessoa outro = (Pessoa) obj;
            
            return  outro.getCpf().equals(cpf) && 
                    outro.getNome().equals(nome) && 
                    outro.getEmail().equals(email);
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        
        //Sempre utilizar os dados usados no metodo equals
        int primo = 17;
        int resultado = 1;
        
        resultado = resultado * primo * nome.length();
        resultado = resultado * primo * email.length();
        resultado = resultado * primo * Integer.parseInt(cpf.substring(0, 3)) 
                              * primo * Integer.parseInt(cpf.substring(3, 5));
        
        return resultado; 
    }    
}
