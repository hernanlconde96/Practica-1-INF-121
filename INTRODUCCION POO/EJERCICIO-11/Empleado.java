package ejercicio11;

public class Empleado {
	
	private String nombre;
	private String rol;
	
	
	public Empleado(String nombre, String rol) {
		
		
		this.nombre = nombre;
		this.rol = rol;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
		
	}
	
	public void setNombre(String nombre) {
		nombre = nombre;
		
		
	}
	
public String getRol() {
		
		return rol;
		
		
	}
	
	public void setRol(String rol) {
		rol = rol;
		
		
	}
	public void mostrar() {
		System.out.println("nombre de empleado: "+this.nombre);
		System.out.println("rol del empleado: " +this.rol);
		
		
	}
	
	
	

}
