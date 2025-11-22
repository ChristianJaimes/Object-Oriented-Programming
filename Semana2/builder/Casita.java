package Semana2.builder;

public class Casita {

    private int paredes;
    private String techo;
    private int puertas;
    private int ventanas;
    private boolean piscina;

    // Constructor privado: obliga a usar el Builder
    public Casita() {}
    
    public Casita(int paredes, String techo, int puertas, int ventanas) {
        this.paredes = paredes;
        this.techo = techo;
        this.puertas = puertas;
        this.ventanas = ventanas;
        if (techo.equals("Teja")) {
            this.piscina = true;
        }
    }
    public Casita(int paredes){
        this.paredes = paredes;
    } 
    
    


    // ---------- GETTERS ----------
    public int getParedes() { return paredes; }
    public String getTecho() { return techo; }
    public int getPuertas() { return puertas; }
    public int getVentanas() { return ventanas; }
    public boolean tienePiscina() { return piscina; }
     // ------------ SETTERS -----
    public void setParedes(int paredes) { this.paredes = paredes; }
    public void setTecho(String techo) { this.techo = techo; }
    public void setPuertas(int puertas) { this.puertas = puertas; }
    public void setVentanas(int ventanas) { this.ventanas = ventanas; }
    public void setPiscina(boolean piscina) { this.piscina = piscina; }
    
}
