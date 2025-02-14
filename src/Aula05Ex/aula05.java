package Aula05Ex;

public class aula05 {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(1);
        ContaBanco conta2 = new ContaBanco(2);
        ContaBanco conta3 = new ContaBanco(3);

        conta1.abrirConta("CP", "Pedro");

        conta1.depositar(1000);
        conta1.pagarMensal();
        conta1.sacar(200);
        conta1.dados();
        conta1.sacar(930);
        conta1.fecharConta();








    }
}
