
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private Connection conexao;
    
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/agenda";
        String user = "root";
        String pass = "1234";
        
        try{
            conexao = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Erro: " + e);
        }
        
        return conexao;
    }
}
