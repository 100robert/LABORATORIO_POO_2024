package LABORATORIO_POO.CLASE_02.Empleado;

public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;

    // Método para mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: "+salario);
        System.out.println("Departamento: " + departamento);
        // No mostramos el salario directamente aquí
    }
    public static void main(String[] args) {
        // Crear un objeto Empleado y asignar valores directamente
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Juan Pérez";
        empleado1.salario = 50000.0;
        empleado1.departamento = "Ventas";

        // Mostrar información del empleado
        empleado1.mostrarInformacion();
    }
    
}

