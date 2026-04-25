interface Vehiculo {
    void acelerar();
    void frenar();
}
class Coche implements Vehiculo {
    @Override public void acelerar() { System.out.println("El coche acelera."); }
    @Override public void frenar() { System.out.println("El coche frena."); }
}
