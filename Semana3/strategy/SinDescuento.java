package Semana3.strategy;

public class SinDescuento implements EstrategiaDescuento {

    @Override
    public double aplicar(double precio) {
        return precio;
    }
}
