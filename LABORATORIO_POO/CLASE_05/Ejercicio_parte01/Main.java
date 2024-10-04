package CLASE_05.Ejercicio_parte01;

public class Main {
    public static void main(String[] args) {
        Cuadrado micuadrado = new Cuadrado(5);
        Triangulo mitriangulo = new Triangulo(3, 7);
        System.out.println("el area del cuadrado: "+micuadrado.calcularArea());
        System.out.println("el area del triangulo: "+mitriangulo.calcularArea());
    }
}
