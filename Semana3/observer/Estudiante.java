package Semana3.observer;

public class Estudiante implements Observer {
    private final String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(MateriaOOP materia) {
        System.out.println("[Notificación] Estudiante " + nombre + ": el tablero de notas fue actualizado.");
        Double miNota = materia.getNota(nombre);
        if (miNota != null) {
            System.out.println("  -> Tu nota ahora es: " + miNota);
        } else {
            System.out.println("  -> No hay una nota registrada para ti todavía.");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
