package LABORATORIO_POO.CLASE_04.EjercicioParte02;

public class Motocicleta extends VehículoMotorizado {
    private String tipochasis;
    public Motocicleta(String marca, int año, int furza, String tipochsis){
        super(marca, año, furza);
        this.tipochasis = tipochsis;
    }
    public String getTipochasis(){
        return tipochasis;
    }
    @Override
    public String toString(){
        return super.toString()+"\nTipo de chasis: "+tipochasis;
    }
}
