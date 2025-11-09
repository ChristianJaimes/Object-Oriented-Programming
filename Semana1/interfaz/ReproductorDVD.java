package Semana1.interfaz;

public class ReproductorDVD implements Reproductor {
    @Override
    public void play() {
        System.out.println("Reproduciendo DVD...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando DVD...");
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo DVD...");
    }

    public void abrirBandeja() {
        System.out.println("Abriendo bandeja del DVD...");
    }
    @Override
    public void reiniciar() {
        System.out.println("Reiniciando DVD...");
    }
}
