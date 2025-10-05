package EJER;


class Estudiante extends Persona {
    private String ru;
    private String matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad, 
                      String ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }

    @Override
    public void mostrar() {
        System.out.println("estudiante:");
        super.mostrar();
        System.out.println("ru: " + ru);
        System.out.println("matricula: " + matricula);
        System.out.println();
    }

    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("se cambio la edad de " + nombre + " a " + nuevaEdad);
    }
}