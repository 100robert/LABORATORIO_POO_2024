package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_01;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }
}