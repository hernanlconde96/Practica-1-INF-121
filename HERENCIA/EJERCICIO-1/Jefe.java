package ejer1;

public class Jefe extends Persona {
    private String sucursal;
    private String tipo;

    public Jefe(String nombre, String apellido, String ci, String sucursal, String tipo) {
        super(nombre, apellido, ci);
        this.sucursal = sucursal;
        this.tipo = tipo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("sucursal: " + sucursal);
        System.out.println("tipo: " + tipo);
    }
}