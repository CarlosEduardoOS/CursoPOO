package ProjetoFinal;

public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;

    //Metodos
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        if (nota >= 0 && nota <= 10){
            this.filme.setAvaliacao(nota);
        } else {
            System.out.println("A sua avaliação deve ser de 0 a 10 estrelas");
        }

    }
    public void avaliar(float porc){ // porc = porcentagem
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <=50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }


    //Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.setTotAssistido(this.getEspectador().getTotAssistido());
        this.filme.setViews(this.getFilme().getViews() + 1);

    }

    //.toString()
    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    //Getters e Setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
