package Semana1.dependencia;

public class Documento {
    private String cuerpo;//contenido del documento
    private String titulo;//titulo del documento

    public Documento(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    public Documento() {
    }
    
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public String getTitulo() {
        return titulo;
    }

}
