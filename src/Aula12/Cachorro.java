package Aula12;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("AUAU!");
    }

    public void abanharRabo(){
        System.out.println("Abanando o rabo");
    }
    public void enterrarOsso(){
        System.out.println("Enterrando o Osso");
    }
}
