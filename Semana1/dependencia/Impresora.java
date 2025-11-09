package Semana1.dependencia;

public class Impresora {
    private boolean estado; // true = encendida, false = apagada
    
    public Impresora() {
    }

    public void imprimirDocumento(Documento documento) {
        if(!this.estado) { //NoT estado estado  == false
            System.out.println("La impresora está apagada. No se puede imprimir.");
            return;
        }
        if (documento == null) {
            System.out.println("No hay documento para imprimir.");
            return;
        }
        if(documento.getTitulo() == null || documento.getCuerpo() == null) {
            System.out.println("El documento está incompleto. No se puede imprimir.");
            return;
        }
        System.out.println("Imprimiendo documento: " + documento.getTitulo());
    }
    public void encender() {
        this.estado = true;
        System.out.println("Impresora encendida");
    }
    public void apagar() {
        this.estado = false;
        System.out.println("Impresora apagada");
    }

}
