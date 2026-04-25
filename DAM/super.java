class Vehiculo {
    public void describir() { System.out.println("Este es un vehículo."); }
}
class Coche extends Vehiculo {
    @Override
    public void describir() {
        super.describir(); // Llama al método de la clase base
        System.out.println("Este es un coche.");
    }
}
