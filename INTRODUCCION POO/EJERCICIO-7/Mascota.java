package ejer7;

public class Mascota {
	
	private String nombre, tipo;
	private int energia;
	public Mascota(String nombre, String tipo, int energia) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.energia = energia;
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", tipo=" + tipo + ", energia=" + energia + "]";
	}
	
	public void Alimentar() {
		
		if (this.energia >=100) {
			
			System.out.println("mucha energia");
			
		}else {
			this.energia += 20;
			
			if (this.energia > 100 ) {
				
				this.energia = 100;
				
			}
			
			
		}
		
		
	}
	
	
	public void Jugar() {
	    if (energia <= 0) {
	        System.out.println("no tiene energia");
	    } else {
	        energia -= 15;
	        if (energia <0) {
	        	
	        	energia = 0;
				
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
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
	
	
	

}
