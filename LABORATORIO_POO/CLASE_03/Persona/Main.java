package CLASE_03.Persona;

public class Main {
    public static void main(String[]arg){
        Persona persona1 = new Persona();
        persona1.setNombre("Ramos");
        persona1.setEdad(22);
        persona1.setCorreo("ronhaf@gmaill.com");
        System.out.println("NOMBRE: "+persona1.getNombre());
        System.out.println("EDAD: "+persona1.getEdad());
        System.out.println("CORREO: "+persona1.getCorreo());

    }
}
