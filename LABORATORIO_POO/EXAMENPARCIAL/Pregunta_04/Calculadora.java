package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_04;

public class Calculadora {
    public void dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        System.out.println("El resultado de la division es: " + a / b);
    }
    public void raizCuadrada(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raiz cuadrada de un numero negativo");
        }
        System.out.println("La raiz cuadrada de " + a + " es: " + Math.sqrt(a));
    }

}
