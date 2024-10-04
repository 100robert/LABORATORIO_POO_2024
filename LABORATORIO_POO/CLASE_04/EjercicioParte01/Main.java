package CLASE_04.EjercicioParte01;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        Gerente gerente = new Gerente("Ana", 8000);

        System.out.println("Bono de " + empleado.getNombre() + ": " + empleado.calcularBono());
        System.out.println("Bono de " + gerente.getNombre() + ": " + gerente.calcularBono());
    }
}
