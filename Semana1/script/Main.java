package Semana1.script;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Usuario pepito = new Usuario("Juan", 123,"hola");
        pepito.logear();
        pepito.leerNota();

        Administrador admin = new Administrador("Admin", 1, "adminpass");
        admin.logear();
        admin.crearNota();
    }
    
}
