package ejer;

public class Main {
    public static void main(String[] args) {
      
        Bus bus = new Bus("carlos", "bus-123", 1, 40, "Sindicato Central");
        Auto auto = new Auto("lucía", "auto-456", 2, 120, true);
        Moto moto = new Moto("juan", "moto-789", 3, 150, true);

       
        System.out.println("*****vehiculos mostrar*****");
        bus.mostrar();
        auto.mostrar();
        moto.mostrar();

        System.out.println();
        System.out.println("********cambiar al conductor*******");
        
        bus.cambiarConductor("Pedro");
        auto.cambiarConductor("María");
        moto.cambiarConductor("Luis");

        System.out.println("******mostrar dato actualizado******");
        bus.mostrar();
        auto.mostrar();
        moto.mostrar();
    }
}