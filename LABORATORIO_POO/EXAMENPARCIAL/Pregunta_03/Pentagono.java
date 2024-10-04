package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_03;

public class Pentagono extends FiguraConLados {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        super(5);
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 5;
    }
    
}
