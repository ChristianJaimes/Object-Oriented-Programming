package Semana3.strategy;

public class Descuento25 implements EstrategiaDescuento {

    @Override
    public double aplicar(double precio) {
        return precio * 0.75; // 25% menos
    }
}
