package Semana3.adapter;

public class Printer {
    // La impresora original sólo sabe imprimir PDFs
    public void printPDF(String pdfPath) {
        System.out.println("[Printer] Imprimiendo PDF: " + pdfPath);
    }
}
