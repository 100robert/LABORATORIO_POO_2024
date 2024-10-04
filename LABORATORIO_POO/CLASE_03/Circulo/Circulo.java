package CLASE_03.Circulo;

public class Circulo {
    private final double radio;
    private  double PI = 3.1412;

    public Circulo() {
        
        this.radio = 5;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }
}


