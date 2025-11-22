package Semana3.adapter;

public class TextDocument implements Document {
    private final String name;
    private final String content;

    public TextDocument(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFormat() {
        return "txt";
    }

    @Override
    public String getContent() {
        return content;
    }
}
