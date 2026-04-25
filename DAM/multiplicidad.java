interface Navegable { void navegar(); }
interface Volador { void volar(); }

class Hidroavion implements Navegable, Volador {
    @Override public void navegar() { System.out.println("Navegando en agua."); }
    @Override public void volar() { System.out.println("Volando en el aire."); }
}
