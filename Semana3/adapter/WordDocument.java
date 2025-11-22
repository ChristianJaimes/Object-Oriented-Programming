package Semana3.adapter;

public class WordDocument implements Document {
    private final String name;
    private final String content;

    public WordDocument(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFormat() {
        return "docx";
    }

    @Override
    public String getContent() {
        return content;
    }
}
