package ejer3;

class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void desplazarse() {
        System.out.println("el animal se desplaza de alguna manera");
    }
}