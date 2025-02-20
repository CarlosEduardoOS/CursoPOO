package Aula11;

public class Bolsista extends Aluno{
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("=======================================");
        System.out.println("Renovando bolsa de: " + this.getNome());
        System.out.println("=======================================");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("=======================================");
        System.out.println(this.getNome() + " é bolsista! Pagamento concluido");
        System.out.println("=======================================");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
