package LABORATORIO_POO.CLASE_04.EjercicioParte02;

public class VehículoMotorizado extends Vehículos{
    private int fuerza;

    public VehículoMotorizado(String marca, int año, int fuerza) {
        super(marca, año);
        this.fuerza = fuerza;
    }
    public int getFuerza(){
        return fuerza;
    }
    @Override
    public String toString(){
        return super.toString()+"\nPotencia: "+fuerza+" cc";
    }
}
