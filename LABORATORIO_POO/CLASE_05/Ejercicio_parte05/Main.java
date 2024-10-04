package CLASE_05.Ejercicio_parte05;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear una instancia de CuentaBancaria y probar el método retirar
            CuentaBancaria cuentaBancaria = new CuentaBancaria(1000);
            cuentaBancaria.retirar(500);
            System.out.println("Saldo después de retirar 500: " + cuentaBancaria.getSaldo());

            // Crear una instancia de CuentaCorriente y probar el método retirar
            CuentaCorriente cuentaCorriente = new CuentaCorriente(1000, 500);
            cuentaCorriente.retirar(1200);
            System.out.println("Saldo después de retirar 1200: " + cuentaCorriente.getSaldo());

            // Intentar retirar una cantidad que excede el límite de sobregiro
            cuentaCorriente.retirar(400); // Esto debería lanzar LimiteSobregiroExcedidoException
        } catch (SaldoInsuficienteException | LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
