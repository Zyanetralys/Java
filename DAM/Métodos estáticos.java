package core;

public class Vehiculo {
    private Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    /**
     * Patrón factory.
     * @return
     */
    public static Vehiculo getInstance(String nombre) {
        return new Vehiculo(nombre);
    }

    public static String[] getTipo() {
        String[] result = new String[] {"Coche", "Moto", "Camion"};

        return result;
    }
}
