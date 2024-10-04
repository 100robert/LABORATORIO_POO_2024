package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_03;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        Cuadrado cuadrado = new Cuadrado(4);
        Pentagono pentagono = new Pentagono(5,3);

        System.out.println("Triangulo: Area: " + triangulo.calcularArea() + ", Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Cuadrado: Area: " + cuadrado.calcularArea() + ", Perimetro: " + cuadrado.calcularPerimetro());
        System.out.println("Pentagono: Area: " + pentagono.calcularArea() + ", Perimetro: " + pentagono.calcularPerimetro());
        

    }
}
