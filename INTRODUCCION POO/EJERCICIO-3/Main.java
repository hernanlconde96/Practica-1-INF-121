package ejer3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto("guitarra", 500, 5);
		
		
		System.out.println(p1);
		
		p1.vender(3);
		
		System.out.println(p1);
		
		p1.reabastecer(15);
		System.out.println(p1);
		
		
	}

}
