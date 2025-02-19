package Aula9Ex;

public class aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        p[0] = new Pessoa("Carlos", 19, "Masculino");
        p[1] = new Pessoa("Malu", 17, "Feminino");
        p[2] = new Pessoa("Suelen", 19, "Feminino");

        Livro l1 = new Livro("Harry Potter", "J.K Rowling", 512, p[0]);
        l1.abrir();
        l1.folhear();
        l1.detalhes();
        l1.avancarPag();
        l1.avancarPag();
        l1.avancarPag();
        l1.detalhes();
        l1.voltarPag();
        l1.voltarPag();
        l1.detalhes();




    }
}
