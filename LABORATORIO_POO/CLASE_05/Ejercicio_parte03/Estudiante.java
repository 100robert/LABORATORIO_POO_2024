package CLASE_05.Ejercicio_parte03;

class Estudiante extends Persona {
    private String nombre;

    // Constructor para inicializar el nombre del estudiante
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("soy: " + nombre + " un estudiante");
    }

    // Sobrecargar el método saludar() para aceptar un parámetro con el nombre de otra persona
    public void saludar(String otrtapersona) {
        System.out.println("hola " + nombre + ", soy " + otrtapersona + " tambien un estudiante");
    }
}
