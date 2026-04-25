abstract class Animal {
    public abstract void hacerSonido();
}
class Perro extends Animal {
    @Override public void hacerSonido() { System.out.println("El perro ladra."); }
}
// Uso: Perro perro = new Perro(); perro.hacerSonido();
