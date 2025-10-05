package ejer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.println("videojuegos creados");
        Videojuego juego1 = new Videojuego("mario kart", "switch", 4);
        Videojuego juego2 = new Videojuego("fifa 2024");
        
        juego1.mostrarInfo();
        juego2.mostrarInfo();
        
        System.out.println();
        System.out.println("agregando jugadores");
        juego1.agregarJugadores();  
        
        System.out.print("cuantos jugadores agregar: ");
        int cantidad = scanner.nextInt();
        juego2.agregarJugadores(cantidad);  
        
        System.out.println();
        System.out.println("info actualizada");
        juego1.mostrarInfo();
        juego2.mostrarInfo();
        
     
    }
}
