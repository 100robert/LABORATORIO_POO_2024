package LABORATORIO_POO.CLASE_05.Ejercicio_parte01;

public class Cuadrado extends Forma {
    private int lado;
    public Cuadrado (int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
}
