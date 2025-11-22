package Semana2.builder;

public interface CasaBuilder {
    CasaBuilder constrirParedes(int paredes); // invoca el método setParedes de Casa
    CasaBuilder construirTecho(String techo); // invoca el método setTecho de Casa
    CasaBuilder constrinPuertas(int puertas); // invoca el método setPuertas de Casa
    CasaBuilder construirVentanas(int ventanas); // invoca el método setVentanas de Casa
    CasaBuilder construirPiscina(boolean piscina); // invoca el método setPiscina de Casa
    Casa build();// devuelve el objeto Casa construido
    
}
