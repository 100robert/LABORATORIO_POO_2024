package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_05;
import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String estudiante;

    public Prestamo(Libro libro, Date fechaPrestamo, Date fechaDevolucion, String estudiante) {
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getEstudiante() {
        return estudiante;
    }


}
