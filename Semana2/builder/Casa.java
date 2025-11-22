package Semana2.builder;

public class Casa { // Aplcicando el patrón Builder

    private int paredes;
    private String techo;
    private int puertas;
    private int ventanas;
    private boolean piscina;

    // Constructor privado: evita crear Casa sin Builder
    protected Casa() {}

    // ---------- GETTERS ----------
    public int getParedes() { return paredes; }
    public String getTecho() { return techo; }
    public int getPuertas() { return puertas; }
    public int getVentanas() { return ventanas; }
    public boolean tienePiscina() { return piscina; }

    public void setParedes(int paredes) { this.paredes = paredes; }
    public void setTecho(String techo) { this.techo = techo; }
    public void setPuertas(int puertas) { this.puertas = puertas; }
    public void setVentanas(int ventanas) { this.ventanas = ventanas; }
    public void setPiscina(boolean piscina) { this.piscina = piscina; }

}
