package Aula09Ex;

public class Pessoa implements Humano {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    // Métodos personalizados
    @Override
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("FELIZ ANIVERSÁRIO " + this.getNome() + " você agora tem " + this.getIdade() + " anos.");
    }

    //Construtor, Getters e Setters

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
