package EJER;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("ana", "garcia", "lopez", 20, "123456", "2024001");
        Estudiante est2 = new Estudiante("carlos", "martinez", "silva", 22, "789012", "2024002");
        Docente doc1 = new Docente("maria", "rodriguez", "perez", 35, 2500.0, "prof-12345");

        System.out.println("**********lista de personas************");
        est1.mostrar();
        est2.mostrar();
        doc1.mostrar();
        System.out.println("*************************************");
        double promedio = (est1.getEdad() + est2.getEdad()) / 2.0;
        System.out.println("promedio de edad: " + promedio);
        System.out.println("**************************************");
        est1.modificarEdad(21);

        System.out.println("**********comparando edades************");
        if (est1.getEdad() == doc1.getEdad()) {
            System.out.println(est1.nombre + " tiene la misma edad que " + doc1.nombre);
        } else {
            System.out.println(est1.nombre + " no tiene la misma edad que " + doc1.nombre);
        }
        
        if (est2.getEdad() == doc1.getEdad()) {
            System.out.println(est2.nombre + " tiene la misma edad que " + doc1.nombre);
        } else {
            System.out.println(est2.nombre + " no tiene la misma edad que " + doc1.nombre);
        }
    }
}