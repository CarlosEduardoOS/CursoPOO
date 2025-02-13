package Aula04;

public class Caneta {
    private String modelo;
    public String cor;
    private float ponta;
    public boolean tampada;

    public Caneta(String m, String c, float p) { //Metodo contrutor é so public e o nome do metodo.
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
