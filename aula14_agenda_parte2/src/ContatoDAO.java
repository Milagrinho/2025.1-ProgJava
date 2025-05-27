//DAO -->Data Acess Object

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    private final Connection conexao;

    public ContatoDAO() {
        conexao = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato) {
        String sql = "INSERT INTO contato (nome, email, telefone, dt_nasc) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, contato.getNome());
            ps.setString(2, contato.getEmail());
            ps.setString(3, contato.getTelefone());
            ps.setDate(4, Date.valueOf(contato.getDt_nasc()));

            ps.execute();

            System.out.println("Contato gravado com sucesso!");

            ps.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
    }

    public void apaga(Contato contato) {
        String sql = "DELETE FROM contato WHERE id = ?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, contato.getId());

            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Contato apagado com sucesso!");
            } else {
                System.out.println("Contato não encontrado.");
            }

            ps.close();
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
    }

    public void altera(Contato contato) {
        //IMPLEMENTAR
    }

    public List<Contato> buscaTodos() {
        List<Contato> lista = null;
        String sql = "SELECT * FROM contato";
        
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            lista = new ArrayList<Contato>();
            
            while(rs.next()){
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setTelefone(rs.getString("telefone"));
                contato.setEmail(rs.getString("email"));
                LocalDate data = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("dt_nasc")));
                contato.setDt_nasc(data);
                
                lista.add(contato);
            }
            
            rs.close();
            ps.close();
            conexao.close();
        }catch(SQLException e){
            System.out.println("Erro: " + e);
        }
        return lista;
    }
}
