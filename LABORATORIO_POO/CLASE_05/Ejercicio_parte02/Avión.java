package CLASE_05.Ejercicio_parte02;

public class Avión implements Movible {
    private String nombre;
    public Avión(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void moverse(){
        System.out.println("el avión "+nombre+" surca los cielos");
    }
}
