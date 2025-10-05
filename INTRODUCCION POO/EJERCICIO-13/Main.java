package ejer13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta f1 = new Fruta("kiwi","subtropical");
		
		f1.mostrar();
		System.out.println("***********************");
		Fruta f2 = new Fruta("naranja");
		f2.mostrar();
		System.out.println("***********************");
		Fruta f3 = new Fruta();
		
		f3.mostrar();
		 
		System.out.println("***********fruta con mas vitaminas!!!************");
		Fruta masVitaminas = f1;

	        if (f2.getNroVitaminas() > masVitaminas.getNroVitaminas()) {
	            masVitaminas = f2;
	        }

	        if (f3.getNroVitaminas() > masVitaminas.getNroVitaminas()) {
	            masVitaminas = f3;
	        }
	        System.out.println("la fruta con mas vitamina es " + masVitaminas.getNombre()+" con "+ masVitaminas.getNroVitaminas() +" vitaminas");
	        	
	        
	        System.out.println("***********mostrando vitaminas************");
		
	        f1.mostrarVitaminas();
	        
	        f2.mostrarVitaminas();
	        f3.mostrarVitaminas();
	        
	        System.out.println("***********vitaminas citricas************");
	        
	     System.out.println("numero de vitaminas citricas: "+f1.vitaminasCitricas()+" de "+f1.getNombre());
	     System.out.println("numero de vitaminas citricas: "+f2.vitaminasCitricas()+" de "+f2.getNombre());
	     System.out.println("numero de vitaminas citricas: "+f3.vitaminasCitricas()+" de "+f3.getNombre());
	     
	     System.out.println("***********ordenar vitaminas************");
	     
	     f1.ordenarVitaminas();
	     f2.ordenarVitaminas();
	     f3.ordenarVitaminas();
	     f1.mostrar();
	     f2.mostrar();
	     f3.mostrar();

	     
	        


	}
	
}
