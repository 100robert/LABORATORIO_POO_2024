package LABORATORIO_POO.CLASE_02.Calculadora;


public class Calculadora {
    double a;
    double b;
    // Metodos
    public double Suma(double a, double b){
        return a+b;
    }
    
    public double Resta(double a, double b){
        return a-b;
    } 

    public double Multiplicación(double a, double b){
        return a*b;
    }

    public double División(double a, double b){
        if (b==0){
           System.out.println("el segundo numero tiene que ser diferente a cero");
           return Double.NaN;
        }else{
          return a/b;
        }
    }
}
