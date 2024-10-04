package LABORATORIO_POO.CLASE_05.Ejercicio_parte01;

public class Triangulo extends Forma {
    private int base;
    private int altura;
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}
