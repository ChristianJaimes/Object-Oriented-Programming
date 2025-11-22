package Semana3.strategy;

public class Main {
    public static void main(String[] args) {

        CalculadoraPrecio calculadora = new CalculadoraPrecio(new SinDescuento());

        double precio = 100.0;

        // Sin descuento
        System.out.println("Sin descuento: $" + calculadora.calcular(precio));

        // Cambiar a descuento del 10%
        calculadora.setEstrategia(new Descuento10());
        System.out.println("Descuento 10%: $" + calculadora.calcular(precio));

        // Cambiar a descuento del 25%
        calculadora.setEstrategia(new Descuento25());
        System.out.println("Descuento 25%: $" + calculadora.calcular(precio));

        // Cambiar a descuento VIP 50%
        calculadora.setEstrategia(new DescuentoVIP());
        System.out.println("Descuento VIP 50%: $" + calculadora.calcular(precio));
    }
}

