package ejer7;


public class Parada {
    private String[] admins = new String[10];
    private String[][] autos = new String[10][3]; 
    private String nombreP;

    private int countAdmins = 0;
    private int countAutos = 0;

    
    public Parada() {
        nombreP = "Sin nombre";
    }

   
    
    
    
    public Parada(String nombreP) {
        this.nombreP = nombreP;
    }

  
    
    
    
    public void mostrar() {
        System.out.println("Parada: " + nombreP);

        System.out.println("Admins:");
        for (int i = 0; i < countAdmins; i++) {
            System.out.println(admins[i]);
        }

        System.out.println("Autos:");
        for (int i = 0; i < countAutos; i++) {
            System.out.println(autos[i][0] + " - " + autos[i][1] + " - " + autos[i][2]);
        }
    }

   
    
    
    
    public void adicionar(String admin) {
        if (countAdmins < 10) {
            admins[countAdmins] = admin;
            countAdmins++;
        }
    }

    
    public void adicionar(String modelo, String conductor, String placa) {
        if (countAutos < 10) {
            autos[countAutos][0] = modelo;
            autos[countAutos][1] = conductor;
            autos[countAutos][2] = placa;
            countAutos++;
        }
    }
}
