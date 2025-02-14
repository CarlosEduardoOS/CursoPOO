package Aula05Ex;

import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Construtor
    public ContaBanco(int n) {
        this.setNumConta(n);
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Getters e Setters

        //Número da Conta
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }

        //Tipo da Conta
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

        //Dono da conta
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

        //Saldo da Conta
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }

        //Status atual da conta
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }


    //Metodos Personalizados
    public void abrirConta(String t, String dono) {
        this.setTipo(t);
        this.setDono(dono);
        this.setStatus(true);
        System.out.println(" ");
        System.out.println("-----------------------------------ABRIR CONTA------------------------------------");
        if(t.equals("CC")) {
            System.out.println("Parabéns por criar a sua Conta Corrente, você recebeu um bônus de R$50,00!");
            System.out.println("Existe uma mensalidade de R$12,00 para esse tipo de conta.");
            this.setSaldo(50);
        } else if(t.equals("CP")){
            System.out.println("Parabéns por criar a sua Conta Poupança, você recebeu um bônus de R$150,00!");
            System.out.println("Existe uma mensalidade de R$20,00 para esse tipo de conta.");
            this.setSaldo(150);
        } else {
            System.out.println("O tipo da conta deve ser CC para Conta Corrente ou CP para Conta Poupança.");
        }
        System.out.println("----------------------------------------------------------------------------------");
    }

    public void fecharConta() {
        System.out.println(" ");
        System.out.println("-------------------------------FECHAR CONTA-----------------------------------");
        if(this.saldo > 0) {
            System.out.println("Ainda existe saldo em sua conta, retire todo seu dinheiro para fechar a conta.");
        } else if(saldo < 0) {
            System.out.println("Conta em débito, impossivel fechar.");
        } else {
            System.out.println("Fechando...");
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void depositar(float deposito) {
        System.out.println(" ");
        System.out.println("--------------------DÉPOSITO--------------------");
        if(this.getStatus()) {
            System.out.println("Depositando R$" + deposito + " ao seu saldo de: R$" + this.getSaldo());
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Seu saldo agora é de R$" + this.getSaldo());
        } else {
            System.out.println("Você deve primeiro criar sua conta para depositar.");
        }
        System.out.println("------------------------------------------------");

    }

    public void sacar(float valor) {
        System.out.println(" ");
        System.out.println("---------------------SAQUE----------------------");
        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                System.out.println("Sacando R$" + valor + " da sua conta com saldo R$" + this.getSaldo() + "...");
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado! seu saldo agora é de R$" + this.getSaldo());
            } else {
                System.out.println("Não foi possível realizar o saque de R$" + valor);
                System.out.println("Seu saldo atual é de R$" + this.getSaldo());
            }
        } else {
            System.out.println("Não foi possível sacar da sua conta pois ela não existe.");
        }
        System.out.println("------------------------------------------------");
    }

    public void pagarMensal() {
        System.out.println("--------------------------PAGAR MENSALIDADE------------------------------");
        if (this.getStatus()) {
            int m = 0;
            if (this.getTipo().equals("CC")) {
                m = 12;
                System.out.println("Sua mensalidade é de R$" + m);
            } else if(this.getTipo().equals("CP")) {
                m = 20;
                System.out.println("Sua mensalidade é de R$" + m);
            }

            if (this.getSaldo() >= m) {
                System.out.println("Seu saldo é de R$" + this.getSaldo() + ". Pagando a mensalidade no valor de R$" + m + "...");
                this.setSaldo(this.getSaldo() - m);
                System.out.println("Mensalidade paga! Seu saldo agora é R$" + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade da conta");
            }
        } else {
            System.out.println("A conta não existe");
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public void dados() {
        System.out.println(" ");
        if(this.getStatus()) {
            System.out.println("---------------DADOS-----------------");
            System.out.println("Número da Conta: " + this.getNumConta());

            if (this.getTipo().equals("CC")){
                System.out.println("Tipo da conta: Conta Corrente");
            }else if(this.getTipo().equals("CP")){
                System.out.println("Tipo da conta: Conta Poupança");
            } else {
                System.out.println("Tipo da conta: *Indefinida*");
            }

            System.out.println("Dono da Conta: " + getDono());
            System.out.println("Saldo: R$" + this.getSaldo());

            if (this.getStatus()) {
                System.out.println("Status: Aberta");
            } else {
                System.out.println("Status: Fechada");
            }
            System.out.println("-------------------------------------");
        } else {
            System.out.println("-----------------------------DADOS-----------------------------");
            System.out.println("Você deve primeiro ter uma conta aberta para ver os seus dados");
            System.out.println("---------------------------------------------------------------");
        }


    }
}
