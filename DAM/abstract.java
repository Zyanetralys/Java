abstract class Animal {
    public abstract void hacerSonido(); // Método abstracto: sin cuerpo
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra."); // Implementación obligatoria
    }
}
