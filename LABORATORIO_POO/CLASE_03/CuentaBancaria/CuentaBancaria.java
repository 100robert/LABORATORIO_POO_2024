package CLASE_03.CuentaBancaria;

public class CuentaBancaria {
   public int numerodecuenta;
   private double saldo;
   protected String titular;

    public double getSaldo() {
    return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    

   public double depositarDinero(double cantidad){
    return saldo+=cantidad;
   }
   public double retirarDinero(double cantidad){
    if(saldo>= cantidad && saldo>0){
        return saldo-=cantidad;
    }else{
        System.out.println("la cantidiad a retirar es mayor al saldo");
    }
    return saldo;
   }
}

