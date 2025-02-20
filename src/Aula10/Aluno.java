package Aula10;

public class Aluno extends Pessoa{
    //Atributos
    private int matricula;
    private String curso;

    //Metodos
    public void cancelarMatricula(){
        this.setMatricula(0);
        this.setCurso(null);
    }

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
