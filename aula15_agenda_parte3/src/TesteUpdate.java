
import java.time.LocalDate;
import java.sql.Connection;

public class TesteUpdate {
    public static void main(String[] args) {
        Contato contato = new Contato(21, 
                                      "Gabi", 
                                      "gabi@globo.com", 
                                      "21999633228", 
                                      LocalDate.of(2015, 03, 27));
        
        Connection con = new ConnectionFactory().getConnection();
        ContatoDAO dao = new ContatoDAO();
        
        dao.altera(contato);        
    }
}
