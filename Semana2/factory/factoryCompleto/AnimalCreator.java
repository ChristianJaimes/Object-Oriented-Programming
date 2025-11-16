package Semana2.factory.factoryCompleto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class AnimalCreator {
    public ArrayList<Animal> registrarAnimal(ArrayList<Animal> listaAnimales) {
        Animal animal = crearAnimal();
        animal.hacerSonido();
        listaAnimales.add(animal);
        return listaAnimales;
    }

    protected abstract Animal crearAnimal();

}
