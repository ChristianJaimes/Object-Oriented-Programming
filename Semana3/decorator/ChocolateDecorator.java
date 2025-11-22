package Semana3.decorator;

public class ChocolateDecorator extends CafeDecorator {

    public ChocolateDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafe.getDescripcion() + ", con chocolate";
    }

    @Override
    public double getCosto() {
        return cafe.getCosto() + 0.75;
    }
}
