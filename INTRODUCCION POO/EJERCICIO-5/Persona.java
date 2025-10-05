package ejer5;

public class Persona {
	private String nombre, paterno, materno;
	private int edad;
	private String ci;
	
	public Persona(String nombre, String paterno, String materno, int edad, String ci) {
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.edad = edad;
		this.ci = ci;
	}
	
	
	
	
	
		
	public void mostrarDatos() {
		
		
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
    }
	
	
	public void MayorDeEdad() {
		
		if (this.edad>=18) {
			
			System.out.println("la persona es mayor de edad");
			
		}else {
			System.out.println("la persona NO es mayor de edad");
		}
		

	}

	
	public int modificarEdad(int x) {
		
		edad = x;
		
		return edad;
		
	}
	
	
	
	public void comparaAp(Persona p) {
		
		if (this.paterno.equals(p.getPaterno())) {
			
			System.out.println("si son iguales");
			
		}else {
			System.out.println("no son iguales");
		}
		
		
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
}
