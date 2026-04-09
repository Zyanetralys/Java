package codigo;

import java.util.Random;

public abstract class Personaje {
    private String raza;
    private String clase;
    private int nivel;
    private int salud;

    public Personaje(String r) {
        Random rand = new Random();
        this.raza = r;
        this.clase = seleccionarClase(rand.nextInt(4));
        this.nivel = rand.nextInt(10);
        this.salud = rand.nextInt(100);
    }

    public abstract void mostrarInfo();

    public String seleccionarClase(int num) {
        switch (num) {
            case 0: return "Guerrero";
            case 1: return "Mago";
            case 2: return "Clérigo";
            case 3: return "Pícaro";
            default: return "";
        }
    }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public int getSalud() { return salud; }
    public void setSalud(int salud) { this.salud = salud; }
}