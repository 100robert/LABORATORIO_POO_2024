package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_04;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try{
            //calculadora.dividir(10, 0);
            calculadora.dividir(10, 2);
            calculadora.raizCuadrada(4);
            calculadora.raizCuadrada(-4);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
