package LABORATORIO_POO.CLASE_03.Utilidades;

public class Main {
    static void convertirCelsiusFahrenheit() {
        float gradosCelsius = 25; // Cambia este valor según los grados Celsius deseados
        float fahrenheit = (gradosCelsius * 1.8f) + 32;
        System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit", gradosCelsius, fahrenheit);
    }
}

