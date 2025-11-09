package Semana1.dependencia;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Dependencia");

        Documento docCompleto = new Documento("Mi Documento", "Este es el cuerpo del documento.");
        System.out.println("Título: " + docCompleto.getTitulo());

        Documento docIncompleto = new Documento();
        docIncompleto.setTitulo("Documento Incompleto");
        System.out.println("Título: " + docIncompleto.getTitulo());

        Documento documentoVacio = null;

        Impresora impresora = new Impresora();

        impresora.imprimirDocumento(docCompleto);

        impresora.encender();
        impresora.imprimirDocumento(docCompleto);
        
        impresora.imprimirDocumento(docIncompleto);
        impresora.imprimirDocumento(documentoVacio);
        impresora.apagar();
    }
}
