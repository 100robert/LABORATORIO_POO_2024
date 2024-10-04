package LABORATORIO_POO.CLASE_04.EjercicioParte02;

public class Main {
    public static void main(String[] args) {
        Coche micoche = new Coche("chebrolet", 2023, 300, "Naranja");
        Motocicleta mimotocicleta = new Motocicleta("Honda", 2019, 100, "tubular");

        System.out.println("INFORMACION DEL COCHE");
        System.out.println(micoche);
        System.out.println("\n");
        System.out.println("INFORMACION DE LA MOTOCICETA");
        System.out.println(mimotocicleta);
    }
}
