package Semana2.factory.factorySimple;

public class Iguana implements Animal {
    public Iguana() {
        System.out.println("Se ha creado una Iguana.");
        hacerSonido();
    }
    @Override
    public void hacerSonido() {
        System.out.println("La iguaana hace: Ssssss!");
    }
}
