package ejer5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("fernando", "choque", "huanca", 17, "123456LP");
		Persona p2 = new Persona("rafael", "copa", "apaza", 25, "789456SC");
		
		p1.mostrarDatos();
		p1.MayorDeEdad();
		System.out.println();
		p2.mostrarDatos();
		p2.MayorDeEdad();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese nueva EDAD:");
		int e = sc.nextInt();
		
		p1.modificarEdad(e);
		
		System.out.println("\ndatos modificados");
		p1.mostrarDatos();
		
		System.out.println("ingrese nueva EDAD:");
		int f = sc.nextInt();
		p1.modificarEdad(f);
		
		System.out.println("\ndatos modificados");
		p1.mostrarDatos();
		System.out.println("los apellidos son iguales?");
		p1.comparaAp(p2);		
		
	
	
	

	

}
}