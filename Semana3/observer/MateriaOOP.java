package Semana3.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MateriaOOP implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final Map<String, Double> tablero = new HashMap<>();

    @Override
    public void attach(Observer o) {
        if (o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : new ArrayList<>(observers)) {
            o.update(this);
        }
    }

    // Actualiza el tablero de notas y notifica a los observadores
    public void actualizarNota(String alumno, double nota) {
        tablero.put(alumno, nota);
        notifyObservers();
    }

    // Devuelve una vista no modificable del tablero
    public Map<String, Double> getTablero() {
        return Collections.unmodifiableMap(tablero);
    }

    // Obtener la nota de un alumno concreto (o null si no existe)
    public Double getNota(String alumno) {
        return tablero.get(alumno);
    }
}
