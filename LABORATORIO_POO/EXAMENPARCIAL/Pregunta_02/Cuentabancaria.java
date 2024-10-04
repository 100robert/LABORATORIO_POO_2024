package LABORATORIO_POO.EXAMENPARCIAL.Pregunta_02;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cuentabancaria {
    private double saldo;
    private final long numeroCuenta;
    private List<String> historialTransacciones = new ArrayList<>();

    public Cuentabancaria(double saldo, long numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void depositar(double monto) {
        saldo += monto;
        agregarTransaccion("Deposito de " + monto + " en fecha " + new Date());
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            agregarTransaccion("Retiro de " + monto + " en fecha " + new Date());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void agregarTransaccion(String transaccion) {
        historialTransacciones.add(transaccion);
    }

    public List<String> getHistorialTransacciones() {
        return new ArrayList<>(historialTransacciones);
    }

    public void imprimirHistorialTransacciones() {
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }

    
}
