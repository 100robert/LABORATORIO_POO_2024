package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_05;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean estado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + "\nautor=" + autor + "\nisbn=" + isbn + "\n estado=" + estado + '}';
    }

}
