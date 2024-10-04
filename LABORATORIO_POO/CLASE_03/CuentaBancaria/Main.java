package CLASE_03.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numerodecuenta = 025454215;
        cuenta1.setSaldo(100);
        cuenta1.setTitular("Robert");
        System.out.println("NÚMERO DE CUEMTA: "+ cuenta1.numerodecuenta);
        System.out.println("SALDO: "+cuenta1.getSaldo());
        System.out.println("TITULAR: "+cuenta1.getTitular());
        System.out.println();
        cuenta1.depositarDinero(2895);
        System.out.println("NUEVO SALDO: " + cuenta1.getSaldo());
        cuenta1.retirarDinero(1500);
        System.out.println("NUEVO SALDO: "+cuenta1.getSaldo());
        cuenta1.retirarDinero(7000);
    }
}
