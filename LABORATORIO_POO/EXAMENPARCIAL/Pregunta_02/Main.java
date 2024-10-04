package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_02;

public class Main {
    public static void main(String[] args) {
        Cuentabancaria cuenta = new Cuentabancaria(1000.0, 123456789);

        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(1500.0); 

        //cuenta.agregarHistorialTransaccion("Intento de modificación");
        cuenta.imprimirHistorialTransacciones();
    }
}
