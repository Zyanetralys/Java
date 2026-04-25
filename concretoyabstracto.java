abstract class Vehiculo {
    public abstract void acelerar(); // Abstracto
    public void detener() { System.out.println("El vehículo se detiene."); } // Concreto
}
class Coche extends Vehiculo {
    @Override public void acelerar() { System.out.println("El coche acelera."); }
}
