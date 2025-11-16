package Semana2.factory.factoryCompleto;

public class TigreCreador extends AnimalCreator {
    @Override
    protected Animal crearAnimal() {
        return new Tigre();
    }
    
}
