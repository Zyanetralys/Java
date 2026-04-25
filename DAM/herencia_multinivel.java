class Animal { public void moverse() { System.out.println("El animal se mueve."); } }
class Mamifero extends Animal { public void respirar() { System.out.println("Respirando."); } }
class Gato extends Mamifero {
    @Override
    public void moverse() { System.out.println("El gato camina sigilosamente."); }
}
