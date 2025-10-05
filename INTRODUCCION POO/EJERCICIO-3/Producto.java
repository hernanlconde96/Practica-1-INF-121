package ejer3;

public class Producto {

	private String nombre;
	private double precio;
	private int stock;
	

	public String getNombre() {
		return nombre;
	}
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}
	public int vender(int cant) {
		
		stock =stock - cant;
		return stock	;
	}
	
public int reabastecer(int cant) {
		
		stock =stock + cant;
		return stock	;
	}
	
	
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
