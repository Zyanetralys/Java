public class Main {
    public static void main(String[] args) {
        System.out.println("Agentes activos: " + Agente.obtenerContador()); // 0
        
        Agente one = new Agente("one");
        Agente two = new Agente("two");
        Agente three = new Agente("three");
        
        System.out.println("Agentes activos: " + Agente.obtenerContador()); // 3
        System.out.println("Agente: " + one.getNombre()); // one
    }
}
