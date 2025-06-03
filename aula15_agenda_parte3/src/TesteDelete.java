
public class TesteDelete {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setId(13);
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.apaga(contato);
    }
}
