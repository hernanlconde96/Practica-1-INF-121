package EJER;

class Docente extends Persona {
    private double sueldo;
    private String regProfesional;

    public Docente(String nombre, String paterno, String materno, int edad, 
                   double sueldo, String regProfesional) {
        super(nombre, paterno, materno, edad);
        this.sueldo = sueldo;
        this.regProfesional = regProfesional;
    }

    @Override
    public void mostrar() {
        System.out.println("docente:");
        super.mostrar();
        System.out.println("sueldo: " + sueldo);
        System.out.println("registro: " + regProfesional);
        System.out.println();
    }
}