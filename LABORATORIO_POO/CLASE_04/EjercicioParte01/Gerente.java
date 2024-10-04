package CLASE_04.EjercicioParte01;

public class Gerente extends Empleado {

    public Gerente(String nombre, double salario){
        super(nombre, salario);
    }
    @Override
    public double calcularBono(){
        return getSalario()*1.5;
    }
}
