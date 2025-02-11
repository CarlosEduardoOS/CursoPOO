package Aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
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
    void rabiscar() {
        if(tampada) {
            System.out.println("Para rabiscar, primeiro você deve destampar a caneta.");
        } else {
            System.out.println("bsbbicbsbcbsacnkcnknxknkncufhuahdusdgsyfguasjakdswokrfhrguuhtdsnvszcmçlamefn");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
