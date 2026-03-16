package codigo;

class Heroe extends Personaje {

    String nombre;
    String apellidos;

    public Heroe(String n, String a, String r) {
        super(r);
        this.nombre = n;
        this.apellidos = a;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Héroe: " + this.nombre + " " + this.apellidos);
        System.out.println("Raza: " + this.getRaza());
        System.out.println("Clase: " + this.getClase());
        System.out.println("Nivel: " + this.getNivel());
        System.out.println("Salud: " + this.getSalud());
    }
}
