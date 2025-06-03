
public class TesteBuscaPorEmail {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        
        Contato contato = dao.buscaContatoPorEmail("gabi@globo.com");
        
        if(contato != null){
            System.out.println(contato);
        }else{
            System.out.println("Contato não encontrado!");
        }      
    }
}
