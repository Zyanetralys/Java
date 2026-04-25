// Definición
interface Protocolo {
    void ejecutarAccion(); // Método abstracto implícito
    void autoDeteccion();
}

// Implementación
class Agente implements Protocolo {
    @Override
    public void ejecutarAccion() {
        System.out.println(">> Ejecutando protocolo.");
    }
    @Override
    public void autoDeteccion() {
        System.out.println(">> Sistemas operativos.");
    }
}
