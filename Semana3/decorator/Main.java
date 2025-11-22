package Semana3.decorator;

public class Main {
    public static void main(String[] args) {
        
        // Un café simple
        Cafe miCafe = new CafeSimple();
        System.out.println(miCafe.getDescripcion() + " -> $" + miCafe.getCosto());

        // Café con leche
        miCafe = new LecheDecorator(miCafe);
        System.out.println(miCafe.getDescripcion() + " -> $" + miCafe.getCosto());

        // Café con leche y chocolate
        miCafe = new ChocolateDecorator(miCafe);
        System.out.println(miCafe.getDescripcion() + " -> $" + miCafe.getCosto());

        // Café con leche, chocolate y crema
        miCafe = new CremaDecorator(miCafe);
        System.out.println(miCafe.getDescripcion() + " -> $" + miCafe.getCosto());
    }
}
