package ejer2;

public class Bus {
    private String marca;
    private String modelo;
    private int capacidad;
    private int pasajeros;

    public Bus(String marca, String modelo, int capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.pasajeros = 0;
    }

    public void subirPasajeros(int cantidad) {
        if (pasajeros + cantidad <= capacidad) {
            pasajeros += cantidad;
        } else {
            System.out.println("ya no hay asientos");
        }
    }

    public double cobrarPasaje() {
        double costo = 1.50;
        return pasajeros * costo;
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    @Override
    public String toString() {
        return "Bus marca=" + marca + ", modelo=" + modelo + " capacidad=" + capacidad + " pasajeros=" + pasajeros;
    }
}
