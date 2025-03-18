
public class Aluno {
    //Propriedades:nome, email, cpf, data de nascimento e telefone
    //Comportamentos: exibeDados 
    //Crie uma classe TestaALuno e instancie 2 alunos
    
    String nome;
    String email;
    String cpf;
    String dataNascimento;
    String telefone;
    
    void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("");
    }
}