package LABORATORIO_POO.CLASE_05.Ejercicio_parte03;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.saludar();
        Estudiante estudiante = new Estudiante("Miguel");
        estudiante.saludar();
        estudiante.saludar("Roca");
    }
}
