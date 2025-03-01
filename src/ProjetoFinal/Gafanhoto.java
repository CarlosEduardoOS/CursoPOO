package ProjetoFinal;

public class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;

    //Metodos
    public void viuMaisUm(){
        System.out.println("========================== VÍDEO ASSISTIDO =========================");
        System.out.println(this.getNome() + " acabou de assistir mais um vídeo!");
        this.setTotAssistido(this.getTotAssistido() + 1);
        System.out.println("====================================================================");

    }

    //Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); //isso aqui é um construtor que vai referenciar a classe mãe
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    //.toString()
    @Override
    public String toString() {
        return "Gafanhoto { " +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                ", login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                " }";
    }


    //Getteres e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
