public class Agente {
    // Variable estática: compartida por todos los agentes
    public static int contadorAgentes = 0;
    
    // Variable de instancia: única por objeto
    private String nombre;
    
    // Constructor
    public Agente(String nombre) {
        this.nombre = nombre;
        contadorAgentes++; // Modifica el estado compartido
    }
    
    // Método estático: opera sobre la clase, no sobre instancias
    public static int obtenerContador() {
        return contadorAgentes;
    }
    
    // Método de instancia: opera sobre el objeto específico
    public String getNombre() {
        return nombre;
    }
}
