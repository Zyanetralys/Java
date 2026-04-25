// Clase abstracta
abstract class Unidad {
    public abstract void activar(); // Sin cuerpo
}

// Subclase concreta
class Dron extends Unidad {
    @Override
    public void activar() {
        System.out.println("Dron activado");
    }
}

// Uso:
// Unidad u = new Unidad(); // ERROR: no se puede instanciar
Unidad u = new Dron(); // OK
u.activar(); // >> "Dron activado"
