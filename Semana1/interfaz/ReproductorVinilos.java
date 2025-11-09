package Semana1.interfaz;

public class ReproductorVinilos implements Reproductor {
    @Override
    public void play() {
        System.out.println("Reproduciendo vinilo...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando vinilo...");
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo vinilo...");
    }
    
    @Override
    public void reiniciar() {
        System.out.println("Reiniciando vinilo...");    
    }
    
}
