package Aula11;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade(){ // Se colocar public final void vai deixare ele impossivel de ser override, o que deve ser bom para regurança do código.
        System.out.println("=======================================");
        System.out.println("Pagando mensalidade do(a) Aluno(a): " + this.getNome());
        System.out.println("=======================================");
    }

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
