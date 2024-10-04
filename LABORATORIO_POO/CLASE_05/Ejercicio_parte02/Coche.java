package LABORATORIO_POO.CLASE_05.Ejercicio_parte02;

public class Coche implements Movible {
    private String marca;
    public Coche(String marca){
        this.marca = marca;
    }

    @Override
    public void moverse(){
        System.out.println("el coche "+marca+" se mueve");
    }
}
