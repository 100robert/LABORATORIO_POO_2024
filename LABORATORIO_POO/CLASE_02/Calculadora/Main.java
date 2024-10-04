package CLASE_02.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        double resultadoSuma = miCalculadora.Suma(5.0, 3.0);
        double resultadoResta = miCalculadora.Resta(10.0, 4.0);
        double resultadoMultiplicacion = miCalculadora.Multiplicación(2.0, 6.0);
        double resultadoDivision = miCalculadora.División(8.0, 2.0);
    
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
    }
    
    
}
