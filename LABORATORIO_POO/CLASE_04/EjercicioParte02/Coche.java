package CLASE_04.EjercicioParte02;

public class Coche extends VehículoMotorizado {
    private String color;

    public Coche(String marca, int año, int fuerza, String color) {
        super(marca, año, fuerza);
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return super.toString()+"\nColor: "+color;
    }

}
