package ejer3;
public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[3];

        animales[0] = new Leon("alex", 5);
        animales[1] = new Pinguino("happy", 3);
        animales[2] = new Canguro("jack", 4);

        
        for (int i = 0; i < animales.length; i++) {
            animales[i].desplazarse();
        }

    }
}