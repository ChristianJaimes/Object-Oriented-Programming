package Semana3.decorator;

public abstract class Cafe {
    protected String descripcion = "Café desconocido";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double getCosto();
}
