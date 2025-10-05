package ejer7;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Mascota m1 = new Mascota("ramoncito", "perro", 20);
		
		Mascota m2 = new Mascota("ferchito", "gato", 80);
		
		System.out.println(m1);
		
		


		m1.Alimentar();
		System.out.println(m1);
	
		

		m1.Jugar();
		System.out.println(m1);
		
		

		m1.Jugar();
		System.out.println(m1);
		

		m1.Jugar();
		System.out.println(m1);
		
		
		
		m2.Alimentar();
		System.out.println(m2);
		
		
		m2.Jugar();
		System.out.println(m2);
		
		m2.Alimentar();
		System.out.println(m2);
		m2.Alimentar();
		System.out.println(m2);
		m2.Alimentar();
		System.out.println(m2);
		
		
		
		
		
		
		
		
	}

}
