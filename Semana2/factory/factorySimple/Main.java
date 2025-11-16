package Semana2.factory.factorySimple;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();// almancea animales
        registrarAnimal("iguana", listaAnimales); //  listaAnimales.add(iguana); 
        registrarAnimal("tigre", listaAnimales); //listaAnimales.add(tigre);
        registrarAnimal("elefante", listaAnimales); // no existe elefante
        llamarListaAnimales(listaAnimales);

    }

    public static void registrarAnimal(String animal, ArrayList<Animal> listaAnimales) {
        Animal animalito = AnimalFactory.crearAnimal(animal);
        listaAnimales.add(animalito);
    }
    
    public static void llamarListaAnimales(ArrayList<Animal> listaAnimales) {
        for (Animal animal : listaAnimales) {
            animal.hacerSonido();
        }
    }

}
