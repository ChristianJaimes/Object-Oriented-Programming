package Semana2.factory.factorySimple;

public class Elefante implements Animal {
    public Elefante() {
        System.out.println("Se ha creado un Elefante.");
        hacerSonido();
    }

    @Override
    public void hacerSonido() {
        System.out.println("El elefante hace: Barritooo!");
    }
    
}
