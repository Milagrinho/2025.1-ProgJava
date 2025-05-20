//Verificar se a biblioteca usada é de java.sql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao;
        String url = "jdbc:mysql://localhost:3306/agenda";
        String user = "root";
        String pass = "1234";
        
        conexao = DriverManager.getConnection(url, user, pass);
        
        System.out.println("Conexão criada!!!");
        
        conexao.close();
        System.out.println("Conexão encerrada");
    }
}
