
import java.time.LocalDate;

public class TesteInsert {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Juca");
        contato.setEmail("juca12@gmail.com");
        contato.setTelefone("21987633228");
        //LocalDate.of(ano, mes, ida)
        //LocalDate.now() ==>data de hoje
        contato.setDt_nasc(LocalDate.of(1990, 10, 12));
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.adiciona(contato);
    }
}
