package Semana3.adapter;

public interface Document {
    String getName();
    String getFormat(); // "pdf", "docx", "txt", etc.
    String getContent();
}
