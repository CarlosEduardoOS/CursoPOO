package ProjetoFinal;

public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];
            v[0] = new Video("Aula 1 de POO");
            v[1] = new Video("Aula 12 de PHP");
            v[2] = new Video("Aula 10 de HTML5");
        Gafanhoto g[] = new Gafanhoto[3];
            g[0] = new Gafanhoto("Carlos", 19, "M", "Dudu");
            g[1] = new Gafanhoto("Maria", 22, "F", "Mari");
            g[2] = new Gafanhoto("João", 25, "M", "Jão");

        Visualizacao vis[] = new Visualizacao[5];
            vis[0] = new Visualizacao(g[0], v[2]); //Jubileu assiste HTML5
            System.out.println(vis[0].toString());
            vis[1] = new Visualizacao(g[0], v[1]); //Jubileu assite PHP
            System.out.println(vis[1].toString());
        /*
        System.out.println("========== VÍDEOS =========");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("======== GAFANHOTOS =======");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());
        */
    }
}
