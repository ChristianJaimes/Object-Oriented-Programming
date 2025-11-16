package Semana2.factory.factoryCompleto;

public class Tigre implements Animal {
    
    public Tigre() {
        System.out.println("Se ha creado un Tigre.");
        hacerSonido();
    }
    @Override
    public void hacerSonido() {
        System.out.println("El tigre ruge: Grrr!");
    }
    
}
