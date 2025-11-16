package Semana2.factory.factoryCompleto;

public class Iguana implements Animal {
    public Iguana() {
        System.out.println("Se ha creado una Iguana.");
        hacerSonido();
    }
    @Override
    public void hacerSonido() {
        System.out.println("La iguana hace: Ssssss!");
    }
    
}
