package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_01;

public class EmpleadoTiempoCompleto extends Empleado {
    private int horastrabajadas;
    private double tarifaHora;
    private double bonoTiempoExtra;

    public EmpleadoTiempoCompleto(String nombre, double salario, int horastrabajadas, double tarifaHora, double bonoTiempoExtra) {
        super(nombre, salario);
        this.horastrabajadas = horastrabajadas;
        this.tarifaHora = tarifaHora;
        this.bonoTiempoExtra = bonoTiempoExtra;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = horastrabajadas * tarifaHora;
        if (horastrabajadas > 40) {
            salarioBase += bonoTiempoExtra;
        }
        return salarioBase;
    }
    
}
