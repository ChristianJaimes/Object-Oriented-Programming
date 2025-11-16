package Semana2.factory.factorySimple;

public class AnimalFactory {
    public static Animal crearAnimal(String tipo) { //Tigre .> TIGRE
        switch (tipo.toUpperCase()) {
            case "TIGRE":
                return new Tigre();
            case "IGUANA":
                return new Iguana();
            case "ELEFANTE":
                return new Elefante();
            default:
                throw new IllegalArgumentException("Tipo de animal no reconocido: " + tipo);
        }
    }
}
