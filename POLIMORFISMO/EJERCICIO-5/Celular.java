package ejer;

public class Celular {
    private String nroTel;
    private String duenio;
    private int espacio;
    private int ram;
    private int nroApp;

   
    public Celular(String nroTel, String duenio, int espacio, int ram, int nroApp) {
        this.nroTel = nroTel;
        this.duenio = duenio;
        this.espacio = espacio;
        this.ram = ram;
        this.nroApp = nroApp;
    }


    public void aumentarApps() {
        this.nroApp += 10;
    }


    public void reducirEspacio() {
        this.espacio -= 5;
    }

    public void mostrar() {
        System.out.println("Número de teléfono: " + nroTel);
        System.out.println("Dueño del celular: " + duenio);
        System.out.println("Espacio: " + espacio + " GB");
        System.out.println("Memoria RAM: " + ram + " GB");
        System.out.println("Número de apps: " + nroApp);
        System.out.println("*******************************");
    }
}
