
import java.util.List;

public class TesteSelect {

    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        List<Contato> lista = dao.buscaTodos();

        if (!lista.isEmpty()) {
            int posicao = 1;
            for (Contato contato : lista) {
                System.out.println(String.valueOf(posicao)+ "- " + contato);
                posicao++;
            }
        }else{
            System.out.println("Contatos não encontrados");
        }

    }
}
