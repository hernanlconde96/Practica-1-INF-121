package ejer;



class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;
    
 
    public Videojuego() {
        this.nombre = "sin nombre";
        this.plataforma = "pc";
        this.cantidadJugadores = 1;
    }
    
    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "multiplataforma";
        this.cantidadJugadores = 1;
    }
    
    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    
 
    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("se agrego 1 jugador. total: " + this.cantidadJugadores);
    }
    
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("se agregaron " + cantidad + " jugadores. total: " + this.cantidadJugadores);
    }
    
    public void mostrarInfo() {
        System.out.println("juego: " + nombre + " | plataforma: " + plataforma + " | jugadores: " + cantidadJugadores);
    }
}