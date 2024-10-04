package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_01;

class EmpleadoPorComision extends Empleado {
    private double ventasTotales;
    private static final double porcentajeComision = 0.1;
    private static final double metaVentas = 10000;
    private static final double bonoMetaVentas = 500;

    public EmpleadoPorComision(String nombre, double salario, double ventasTotales) {
        super(nombre, salario);
        this.ventasTotales = ventasTotales;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = ventasTotales * porcentajeComision;
        if (ventasTotales >= metaVentas) {
            salarioBase += bonoMetaVentas;
        }
        return salarioBase;
    }
}
