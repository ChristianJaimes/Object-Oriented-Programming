package Semana2.singleton;

public class Main {

    public static void main(String[] args) {
        ConexionDB conexion1 = ConexionDB.getInstance();
        ConexionDB conexion2 = ConexionDB.getInstance();

        if (conexion1 == conexion2) {
            System.out.println("Ambas conexiones son la misma instancia.");
        } else {
            System.out.println("Las conexiones son instancias diferentes.");
        }
        System.out.println(conexion1.regresarInfoDB());
        System.out.println(conexion2.regresarInfoDB());
    
    }
}

