package Semana3.adapter;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Document pdf = new PdfDocument("informe.pdf","Contenido del PDF");
        Document docx = new WordDocument("tesis.docx","Contenido del Word");
        Document txt = new TextDocument("nota.txt","Contenido de texto simple");

        // Si el documento ya es PDF, la impresora lo maneja directamente
        DocumentToPdfAdapter adapterPdf = new DocumentToPdfAdapter(printer, pdf);
        adapterPdf.print();

        // Para documentos que NO son PDF usamos el Adapter para convertirlos
        DocumentToPdfAdapter adapterDocx = new DocumentToPdfAdapter(printer, docx);
        adapterDocx.print();

        DocumentToPdfAdapter adapterTxt = new DocumentToPdfAdapter(printer, txt);
        adapterTxt.print();

        System.out.println("Ejemplo Adapter finalizado.");
    }
}
