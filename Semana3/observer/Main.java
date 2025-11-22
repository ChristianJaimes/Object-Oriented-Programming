package Semana3.observer;

public class Main {
    public static void main(String[] args) {
        MateriaOOP materia = new MateriaOOP();

        Estudiante e1 = new Estudiante("Alice");
        Estudiante e2 = new Estudiante("Bob");
        Estudiante e3 = new Estudiante("Carlos");

        materia.attach(e1);
        materia.attach(e2);

        // Actualizamos notas; cada actualización notifica a los observadores
        materia.actualizarNota("Alice", 8.5);
        materia.actualizarNota("Bob", 9.2);

        // Quitamos a Alice de la lista de observadores
        materia.detach(e1);

        // Actualizar una nota después de la desconexión
        materia.actualizarNota("Alice", 9.0);

        // Añadimos a Carlos y actualizamos
        materia.attach(e3);
        materia.actualizarNota("Carlos", 7.8);
    }
}
