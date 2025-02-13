package Aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        if(tampada) {
            System.out.println("Está tampada: Sim");
        } else {
            System.out.println("Está tampada: Não");
        }
    }
    public void rabiscar() {
        if(tampada) {
            System.out.println("Para rabiscar, primeiro você deve destampar a caneta.");
        } else {
            System.out.println("bsbbicbsbcbsacnkcnknxknkncufhuahdusdgsyfguasjakdswokrfhrguuhtdsnvszcmçlamefn");
        }
    }
    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}
