package LABORATORIO_POO.CLASE_03.Circulo;

public class Main {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo();
        
        System.out.println("El área del círculo con radio " + miCirculo.getRadio() + " es: " +miCirculo.calcularArea());
    }
}
