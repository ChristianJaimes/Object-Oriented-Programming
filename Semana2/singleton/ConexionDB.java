package Semana2.singleton;
// Clase Singleton para la conexión a la base de datos
public class ConexionDB {
    private static ConexionDB instancia;
    private final String url = "jdbc:mysql://localhost:3306/mi_basedatos";
    private final String usuario = "root";
    private final String password = "password123";

    private ConexionDB() {
        System.out.println("Conexión a la base de datos establecida.");
    }
    public static ConexionDB getInstance() {
        if (instancia == null) {
            instancia = new ConexionDB();
        }
        return instancia;
    }
    public String regresarInfoDB() {
        return "URL: " + url + ", Usuario: " + usuario;
    }



    
    
}
