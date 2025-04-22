package exe03;

import java.util.HashSet;

public class TestaAlunos {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Juca", "12345", "Banco de dados");
        Aluno a2 = new Aluno("Ana", "96325", "Gestão de TI");
        Aluno a3 = new Aluno("Bia", "78451", "Redes");
        Aluno a4 = new Aluno("Juca", "96321", "Analise de sistemas");
        Aluno a5 = new Aluno("Bia", "78451", "Redes");
        
        HashSet<Aluno> conjunto = new HashSet<>();
        
        conjunto.add(a1);
        conjunto.add(a2);
        conjunto.add(a3);
        conjunto.add(a4);
        conjunto.add(a5);//Não consegue adicionar ao conjunto. Um conjunto recebe apenas valores unicos
        
        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
            System.out.println("");
        }
    }
}
