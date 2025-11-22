package Semana3.decorator;

public class LecheDecorator extends CafeDecorator {

    public LecheDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", con leche";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.50;
    }
}
