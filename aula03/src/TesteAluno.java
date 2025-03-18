
public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Angela";
        a1.cpf = "1234567890";
        a1.email = "angela@email.com";
        a1.dataNascimento = "05/05/2010";
        a1.telefone = "9877665543";
        
        a1.exibeDados();
        
        Aluno a2 = new Aluno();
        a2.nome = "Juca";
        a2.cpf = "85236974111";
        a2.email = "juca@email.com";
        a2.dataNascimento = "15/09/2000";
        a2.telefone = "9632547896";
        
        a1.exibeDados();
        
        a2.exibeDados();
        
        a2.dataNascimento = "31/02/2000";
    }
}
