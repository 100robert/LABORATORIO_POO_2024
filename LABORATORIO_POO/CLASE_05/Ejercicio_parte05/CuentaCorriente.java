package LABORATORIO_POO.CLASE_05.Ejercicio_parte05;
public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial); // Inicializamos el saldo usando el constructor de la clase base
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) throws LimiteSobregiroExcedidoException, SaldoInsuficienteException {
        // Verificar si el monto a retirar excede el saldo y el límite de sobregiro
        if (cantidad > saldo + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido para retirar " + cantidad);
        }

        // Si el monto a retirar excede el saldo, permite el sobregiro
        if (cantidad > saldo) {
            System.out.println("Advertencia: estás usando tu sobregiro.");
        }
        
        saldo -= cantidad; // Realizamos el retiro
    }
}

