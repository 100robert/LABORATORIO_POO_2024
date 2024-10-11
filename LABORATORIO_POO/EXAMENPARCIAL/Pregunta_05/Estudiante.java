package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_05;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String codigo;
    private final List<Prestamo> prestamos;

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.prestamos = new ArrayList<>();
    }
     
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + "\ncodigo=" + codigo + "\nprestamos=" + prestamos + '}';
    }   
}
