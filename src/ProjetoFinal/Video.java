package ProjetoFinal;

public class Video implements AcoesVideo{
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Metodos
    @Override
    public void play() {
        System.out.println("====================== PLAY =======================");
        if (!this.isReproduzindo()){
            System.out.println("O vídeo (" + this.getTitulo() + ") começou a ser reproduzido");
            this.setReproduzindo(true);
        } else {
            System.out.println("O vídeo já está sendo reproduzido");
        }

        System.out.println("===================================================");
    }

    @Override
    public void pause() {
        System.out.println("====================== PAUSE ======================");
        if (this.isReproduzindo()){
            System.out.println("O vídeo (" + this.getTitulo() + ") foi pausado");
            this.setReproduzindo(false);
        } else {
            System.out.println("O vídeo já está pausado");
        }
        System.out.println("===================================================");
    }

    @Override
    public void like() {
        System.out.println("===================== CURTIR ======================");
        this.setCurtidas(this.getCurtidas() + 1);
    System.out.println("Curtida adicionada! o video (" + this.getTitulo() + ") agora tem: " + this.getCurtidas() + " likes!");
        System.out.println("===================================================");
    }

    //Construtor
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    //.toString()
    @Override
    public String toString() {
        return "Video { " +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                " }";
    }

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        if (this.views > 0) {
            int nova = (int) ((this.avaliacao + avaliacao) / this.views);
            this.avaliacao = nova;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
