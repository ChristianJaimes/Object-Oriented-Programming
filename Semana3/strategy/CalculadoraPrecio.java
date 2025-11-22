package Semana3.strategy;

public class CalculadoraPrecio {
    private EstrategiaDescuento estrategia;

    public CalculadoraPrecio(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double precio) {
        return estrategia.aplicar(precio);
    }
}
