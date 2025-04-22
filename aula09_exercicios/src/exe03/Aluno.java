package exe03;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, curso);
    }

    @Override
    public boolean equals(Object obj) {
        //Verifica se o objeto passado é a propria instancia
        if (this == obj) {
            return true;
        }
        //Verifica se o objeto é nulo
        if (obj == null) {
            return false;
        }
        //Verifica se o objeto é da mesma classe e pacote
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }
}
