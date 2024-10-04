package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_01;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[] {
            new EmpleadoTiempoCompleto("Juan", 0, 45, 100, 500),
            new EmpleadoPorComision("Maria", 0, 12000)
        };

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }
    }
}
