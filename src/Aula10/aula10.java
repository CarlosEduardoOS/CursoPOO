package Aula10;

public class aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        p1.setIdade(19);
        p2.setIdade(22);
        p3.setIdade(43);
        p4.setIdade(12);

        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);



        //p1.receberAumento(550.20); deveria ser p3
        //p2.mudarTrabalho("Caixa"); deveria ser p4
        //p4.cancelarMatricula(); deveseria ser p2

    }
}
