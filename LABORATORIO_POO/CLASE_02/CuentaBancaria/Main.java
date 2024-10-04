package LABORATORIO_POO.CLASE_02.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.MostrarInformacion();
        cuenta.depositar(20000);
        System.out.println("NUEVO SALDO: "+cuenta.mostrarSaldo());
        cuenta.retirar(19000);
        System.out.println("NUEVO SALDO: "+cuenta.saldo);
        cuenta.retirar(50000);
    }
}
