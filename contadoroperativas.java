public class Main {
    public static void main(String[] args) {
        System.out.println("Agentes activos: " + Agente.obtenerContador()); // 0
        
        Agente valeria = new Agente("one");
        Agente kaela = new Agente("two");
        Agente rina = new Agente("three");
        
        System.out.println("Agentes activos: " + Agente.obtenerContador()); // 3
        System.out.println("Agente: " + one.getNombre()); // one
    }
}
