package Semana3.adapter;

public class DocumentToPdfAdapter {
    private final Printer printer;
    private final Document document;

    public DocumentToPdfAdapter(Printer printer, Document document) {
        this.printer = printer;
        this.document = document;
    }

    public void print() {
        if ("pdf".equalsIgnoreCase(document.getFormat())) {
            // Ya es PDF: imprimir directamente (simulamos usando el nombre)
            printer.printPDF(document.getName());
        } else {
            // Convertir a PDF (simulado) y luego imprimir
            String convertedPdfPath = convertToPdf(document);
            printer.printPDF(convertedPdfPath);
        }
    }

    private String convertToPdf(Document doc) {
        System.out.println("[Adapter] Convirtiendo '" + doc.getName() + "' de " + doc.getFormat() + " a PDF...");
        // Aquí se simula la conversión; en una app real se invocaría un conversor.
        // Devolvemos una ruta/identificador simulado del PDF convertido.
        return doc.getName() + " (convertido a PDF)";
    }
}
