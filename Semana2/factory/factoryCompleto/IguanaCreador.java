package Semana2.factory.factoryCompleto;

public class IguanaCreador extends AnimalCreator {
    @Override
    protected Animal crearAnimal() {
        return new Iguana();
    }
}
