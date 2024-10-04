package LABORATORIO_POO.CLASE_04.EjercicioParte02;

public class Vehículos {
    private String marca;
    private int año;
    public Vehículos(String marca, int año){
        this.marca = marca;
        this.año = año;
    }
    public String getMarca(){
        return marca;
    }
    public int getAño(){
        return año;
    }
    public String toString(){
        return "Marca: "+marca+"\nAño: "+año;
    }
}
