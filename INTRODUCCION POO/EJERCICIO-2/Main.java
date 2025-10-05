package ejer2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus("King Long", "Pumakatari", 30);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero de pasajeros:");
        int p = sc.nextInt();
        b1.subirPasajeros(p);

        System.out.println(b1);
        System.out.println("total pasajes: " + b1.cobrarPasaje() + " Bs");
        System.out.println("asientos libres: " + b1.asientosDisponibles());

        System.out.println("ingrese nuevos pasajeros:");
        int nuevos = sc.nextInt();
        b1.subirPasajeros(nuevos);

        System.out.println(b1);
        System.out.println("total pasajes: " + b1.cobrarPasaje() + " Bs");
        System.out.println("asientos libres: " + b1.asientosDisponibles());

        
    }
}
