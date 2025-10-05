package ejer1;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String ci;

    public Persona(String nombre, String apellido, String ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + " " + apellido);
        System.out.println("CI: " + ci);
    }
}
