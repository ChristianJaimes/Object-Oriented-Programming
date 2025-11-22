package Semana3.decorator;

public class CremaDecorator extends CafeDecorator {

    public CremaDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", con crema";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.30;
    }
}
