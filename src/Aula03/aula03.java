package Aula03;

import Aula03.Caneta;

public class aula03 {
    public static void main(String[] args) {
         Caneta c1 = new Caneta();
         c1.modelo = "BIC Crystal";
         c1.cor = "Azul";
         //c1.ponta = 0.5f;
         c1.carga = 80;
         c1.status();
         c1.rabiscar();
    }
}
