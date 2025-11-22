package Semana3.adapter;

public class PdfDocument implements Document {
    private final String name;
    private final String content;

    public PdfDocument(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFormat() {
        return "pdf";
    }

    @Override
    public String getContent() {
        return content;
    }
}
