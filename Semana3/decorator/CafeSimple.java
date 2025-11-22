package Semana3.decorator;

public class CafeSimple extends Cafe {

    public CafeSimple() {
        descripcion = "Café simple";
    }

    @Override
    public double getCosto() {
        return 1.50;
    }
}
