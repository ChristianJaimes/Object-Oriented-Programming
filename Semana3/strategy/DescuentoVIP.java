package Semana3.strategy;

public class DescuentoVIP implements EstrategiaDescuento {

    @Override
    public double aplicar(double precio) {
        return precio * 0.50; // 50% menos para VIP
    }
}
