package LABORATORIO_POO.CLASE_02.CuentaBancaria;

class CuentaBancaria {
    //ATRIBUTOS
    String titular;
    int numeroCuenta;
    double saldo;
    public CuentaBancaria() {
        titular = "Robert";
        numeroCuenta = 0222465221;
        saldo = 1000;
    }

    public double mostrarSaldo(){
        return saldo;
    }
    public void depositar(double cantidad){
        saldo+=cantidad;
    }
    public void retirar(double cantidad){
        if (saldo>=cantidad){
            saldo-=cantidad;
        }else{
            System.out.println("ingrsa un  monto menor a retirar");
        }
    }
    public void MostrarInformacion(){
        System.out.println("TITULAR: "+titular);
        System.out.println("NUMERO DE CUENTA: "+numeroCuenta);
        System.out.println("SALDO EN CUENTA: "+saldo);
    }
    
}
