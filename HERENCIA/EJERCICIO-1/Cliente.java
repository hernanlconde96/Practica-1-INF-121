package ejer1;

public class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;

    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }

   
    public void mostrar() {
        super.mostrar();
        System.out.println("id Cliente: " + idCliente);
        System.out.println("nimero de compra: " + nroCompra);
    }
}