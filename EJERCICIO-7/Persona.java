package EJER;

class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected int edad;

    public Persona(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println(nombre + " " + paterno + " " + materno);
        System.out.println("edad: " + edad);
    }

    public int getEdad() {
        return this.edad;
    }
}
