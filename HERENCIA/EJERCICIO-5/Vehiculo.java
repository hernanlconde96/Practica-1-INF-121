package ejer;

class Vehiculo {
    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public void mostrar() {
        System.out.println("vehiculo placa " + placa);
        System.out.println("conductor: " + conductor);
    }

    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
        System.out.println("el nuevo conductor se llama " + nuevoConductor + " y pertenece al vehiculo " + placa);
    }
}