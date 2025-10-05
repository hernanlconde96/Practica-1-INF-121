package ejer3;

class Pinguino extends Animal {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " nada velozmente por la antartida");
    }
}