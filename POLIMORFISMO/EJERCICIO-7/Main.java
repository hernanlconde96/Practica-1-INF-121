package ejer7;

public class Main {
    public static void main(String[] args) {
        Parada p1 = new Parada();
        p1.adicionar("fernando");
        p1.adicionar("toyota", "max choque", "ABC123");
        p1.mostrar();

        System.out.println();

        Parada p2 = new Parada("Parada Central");
        p2.adicionar("carla");
        p2.adicionar("honda", "edwin gomez", "XYZ321");
        p2.mostrar();
    }
}
