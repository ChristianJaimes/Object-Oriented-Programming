package Semana2.factory.factoryCompleto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patrón Factory Completo - Ejemplo de creación de animales");
        ArrayList<Animal> listaAnimales = new ArrayList<>();// almancea animales
        AnimalCreator fabricaTigres = new TigreCreador();
        AnimalCreator fabricaIguanas = new IguanaCreador();

        fabricaIguanas.registrarAnimal(listaAnimales);
        fabricaTigres.registrarAnimal(listaAnimales);

        for (Animal animal : listaAnimales) {
            animal.hacerSonido();
        }
        
    }
    
}
