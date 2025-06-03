
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;
import java.util.Objects;


public class Contato {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dt_nasc;
    
    //MODELO JAVABEAN 
    //Construtor vazio e cheio, GET* e SET*, toString, equals e hashcode

    public Contato() {
    }
    

    public Contato(Integer id, String nome, String email, String telefone, LocalDate dt_nasc) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dt_nasc = dt_nasc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(LocalDate dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date date = Date.valueOf(dt_nasc);
        String data = formatoData.format(date);
        
        String idFormatado = String.format("%04d", id);        
        String telFormatado = String.format("(%s) %s-%s", telefone.substring(0, 2), 
                                                          telefone.substring(2, 6), 
                                                          telefone.substring(6, 11));
        return String.format("ID: %s\n"
                            + "Nome: %s\n"
                            + "E-mail: %s\n"
                            + "Telefone: %s\n"
                            + "Data de Nascimento: %s\n", 
                            idFormatado, nome, email, telFormatado, data);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.dt_nasc, other.dt_nasc);
    }
    
    
    
}
