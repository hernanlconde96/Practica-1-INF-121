package ejer1;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("luis", "fernandez", "98445653");
        System.out.println("**********persona********");
        p1.mostrar();
        System.out.println();

    
        Cliente c1 = new Cliente("ana", "gomez", "4323890", "C123", "A001");
        System.out.println("********datos de cliente*********");
        c1.mostrar();
        System.out.println();

      
        Jefe j1 = new Jefe("carlos", "perez", "1234567", "sucursal central", "general");
        System.out.println("********datos de jefe*********");
        j1.mostrar();

	}

}
