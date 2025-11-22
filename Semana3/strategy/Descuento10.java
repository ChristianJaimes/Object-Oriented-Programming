package Semana3.strategy;

public class Descuento10 implements EstrategiaDescuento {

    @Override
    public double aplicar(double precio) {
        return precio * 0.90; // 10% menos
    }
}
