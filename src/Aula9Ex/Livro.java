package Aula9Ex;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void detalhes() {
        System.out.println("=================DETALHES==================");
        System.out.println("Título do livro: " + this.getTitulo());
        System.out.println("Autor do livro: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Está aberto?: " + this.isAberto());
        System.out.println("Quem está lendo?: " + this.leitor.getNome());
        System.out.println("===========================================");
    }
    //Métodos da interface
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear() {
        System.out.println("================FOLHEAR====================");
        if (this.isAberto()){
            Random aleatorio = new Random();
            int folheada = aleatorio.nextInt(this.getTotPaginas() - 1);
            this.setPagAtual(folheada);
            System.out.println("Você folheou ate a página: " + this.getPagAtual());
        } else {
            System.out.println("Abra o livro primeiro");
        }
        System.out.println("===========================================");
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Abra o livro primeiro");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Abra o livro primeiro");
        }
    }

    //Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.setLeitor(leitor);
        this.setAberto(false);
        this.setPagAtual(0);
    }
    //Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


}
