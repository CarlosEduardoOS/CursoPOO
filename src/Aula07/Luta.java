package Aula07;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado; // a gente usa o nome da outra classe que queremos agregar como tipo do atribudo, como se fosse String ou int.
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    // Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){ // se as categorias forem as mesmas e se o lutador 1 for diferente do lutador 2
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch(vencedor) {
                case 0: //Empate
                    System.out.println("A LUTA TERMINOU EM EMPATE!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado ganhou
                    System.out.println("O DESAFIADO " + this.desafiado.getNome() + " GANHOU A LUTA!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante ganhou
                    System.out.println("O DESAFIANTE " + this.desafiante.getNome() + " GANHOU A LUTA!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else{
            System.out.println("A luta não pode acontecer");
        }
    }
    // Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
