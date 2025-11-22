package Semana2.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patrón Builder - Ejemplo de construcción de una casa");
        // creacion de casas con diferentes configuraciones
        
        Casita casa2 = new Casita(4); // Casa Medianera
        Casita casa3 = new Casita(4, "Teja", 1,2); //Casa esquinera

        Casita casa = new Casita(); // casa tipo 1 Lote Basico
            casa.setParedes(4);
            casa.setTecho("Lamina");
            casa.setPuertas(1);
            casa.setVentanas(2);
            casa.setPiscina(false);

        CasaBuilder builder = new CasaConcretaBuilder();

        Casa casa4 = builder.constrirParedes(4)
                            .construirTecho("Teja")
                            .constrinPuertas(2)
                            .construirVentanas(4)
                            .construirPiscina(true)
                            .build(); // Casa de lujo

        Casa casa5 = builder.constrirParedes(4)
                            .construirTecho("MADERA")
                            .construirVentanas(4)
                            .build(); // Casa de lujo


        

    }
    
}
