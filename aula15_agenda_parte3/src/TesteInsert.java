
import java.time.LocalDate;

public class TesteInsert {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Gabi");
        contato.setEmail("gabi@gmail.com");
        contato.setTelefone("21999633228");
        //LocalDate.of(ano, mes, ida)
        //LocalDate.now() ==>data de hoje
        contato.setDt_nasc(LocalDate.of(2015, 03, 27));
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.adiciona(contato);
    }
}
