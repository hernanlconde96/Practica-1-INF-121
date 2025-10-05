package ejer13;

public class Fruta {
	private String nombre;
	private String tipo;
	private int nroVitaminas;
	private String v[] = new String[30];	
	
	
	public Fruta(String nombre, String tipo) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.nroVitaminas = 3;
		this.v[0]= "K";
		this.v[1]= "C";
		this.v[2]= "E";
		
		
		
		
	}
	
	
	public Fruta() {
		
		this.nombre = "pasa";
		this.tipo = "seco";
		this.nroVitaminas = 2;
		this.v[0]= "D";
		this.v[1]= "B";
		
		
	}
	
	
	
public Fruta(String nombre) {
		
		this.nombre = nombre;
		this.tipo = "jugoso";
		this.nroVitaminas = 4;
		this.v[0]= "A";
		this.v[1]= "H";
		this.v[2]= "C";
		this.v[3]= "J";
		
		
	}
	public void mostrar() {
		
		System.out.println("nombre: "+this.nombre);
		System.out.println("tipo: "+this.tipo);
		System.out.println("nro de vitaminas: "+this.nroVitaminas);
		
		for (int i = 0; i < this.nroVitaminas; i++) {
			
			System.out.println("vitamina "+v[i]);
			
			
		}
		
		
			
	}
	
	public void mostrarVitaminas() {
		
		System.out.println("la fruta: "+this.nombre+" y sus vitaminas:");
		for (int i = 0; i < this.nroVitaminas; i++) {
			
			System.out.println("vitaminas: "+this.v[i] );
			
		}
		System.out.println("**********************");
		
		
	}
	
	
	public int vitaminasCitricas() {
	    int vitaCitricas = 0;

	    for (int i = 0; i < this.getNroVitaminas(); i++) {
	        if (this.v[i].equals("A") || this.v[i].equals("C")) {
	            vitaCitricas++;
	        }
	    }

	    return vitaCitricas; // devuelve el conteo
	}

	public void ordenarVitaminas() { 
	    for (int i = 0; i < nroVitaminas - 1; i++) {
	        for (int j = i + 1; j < nroVitaminas; j++) {
	            if (v[i].compareTo(v[j]) > 0) { 
	                // Intercambiar vitaminas
	                String temp = v[i];
	                v[i] = v[j];
	                v[j] = temp;
	            }
	        }
	    }
	}

	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNroVitaminas() {
		return nroVitaminas;
	}
	public void setNroVitaminas(int nroVitaminas) {
		this.nroVitaminas = nroVitaminas;
	}
	public String[] getV() {
		return v;
	}
	public void setV(String[] v) {
		this.v = v;
	}
	

}
