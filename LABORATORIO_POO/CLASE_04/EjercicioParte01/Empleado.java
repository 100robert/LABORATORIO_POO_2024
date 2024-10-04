package LABORATORIO_POO.CLASE_04.EjercicioParte01;

public class Empleado {
    private String nombre;
    private double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public String getNombre(){
        return nombre;
    }
    public double getSalario(){
        return salario;
    }
    public double calcularBono(){
        return salario*0.1;
    }
}
