package ejer;

public class Main {
	 public static void main(String[] args) {
	        Celular cel1 = new Celular("72573578", "Fernando", 128, 8, 15);
	        
	        System.out.println("******** Celular 1 ********");
	        cel1.mostrar();
	        
	        System.out.println("******** Celular con más apps ********");
	        cel1.aumentarApps();
	        cel1.mostrar();
	        
	        System.out.println("******** Celular con menos espacio ********");
	        cel1.reducirEspacio();
	        cel1.mostrar();
	    }
	}