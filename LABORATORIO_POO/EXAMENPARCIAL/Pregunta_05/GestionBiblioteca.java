package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_05;

import java.util.Date;

public class GestionBiblioteca {
        public static void main(String[] args) {
            // Crear algunos libros
            Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789");
            Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "987654321");
    
            // Crear un estudiante
            Estudiante estudiante = new Estudiante("Juan Pérez", "20210001");
    
            // Crear un préstamo
            Prestamo prestamo1 = new Prestamo(libro1,new Date(), null, "estudiante");
            estudiante.agregarPrestamo(prestamo1);
            libro1.setEstado(false);
    
            // Mostrar la lista de préstamos del estudiante
            System.out.println("Préstamos de " + estudiante.getNombre() + ":");
            for (Prestamo prestamo : estudiante.getPrestamos()) {
                System.out.println(prestamo);
            }
    
            // Mostrar los libros prestados
            System.out.println("Libros prestados:");
            if (!libro1.isEstado()) {
                System.out.println(libro1);
            }
            if (!libro2.isEstado()) {
                System.out.println(libro2);
            }
        }
    
}
