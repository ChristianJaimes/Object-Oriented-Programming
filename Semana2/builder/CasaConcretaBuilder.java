package Semana2.builder;

public class CasaConcretaBuilder implements CasaBuilder {
    private Casa casa;
    
    public CasaConcretaBuilder() {
        this.casa = new Casa();
    }

    @Override
    public CasaBuilder constrirParedes(int paredes) {
        casa.setParedes(paredes);
        return this;
    }

    @Override
    public CasaBuilder construirTecho(String techo) {
        casa.setTecho(techo);
        if (casa.getTecho().equals("Teja") ){
            casa.setPiscina(true);
        }
        return this;
    }

    @Override
    public CasaBuilder constrinPuertas(int puertas) {
        casa.setPuertas(puertas);
        return this;
    }

    @Override
    public CasaBuilder construirVentanas(int ventanas) {
        casa.setVentanas(ventanas);
        return this;
    }

    @Override
    public CasaBuilder construirPiscina(boolean piscina) {
        casa.setPiscina(piscina);
        return this;
    }

    @Override
    public Casa build() {
        return this.casa;
    }
    
}
