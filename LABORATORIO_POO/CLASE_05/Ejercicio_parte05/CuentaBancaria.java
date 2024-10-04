package LABORATORIO_POO.CLASE_05.Ejercicio_parte05;
public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}


