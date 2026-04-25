class Unidad {
    public void activar() { System.out.println("Unidad genérica"); }
}
class Dron extends Unidad {
    @Override
    public void activar() { System.out.println("Dron activado"); }
}
// Uso:
Unidad u = new Dron();
u.activar(); // >> "Dron activado" (polimorfismo)
