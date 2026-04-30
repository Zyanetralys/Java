public class Coche {
    private String marca;
    private int velocidad;
    
    // CONSTRUCTOR
    public Coche(String marca) {
        this.marca = marca;           // Inicialización
        this.velocidad = 0;           // Inicialización
    }
}

// Uso:
Coche miCoche = new Coche("Toyota");
//           ↑
//     Se llama al constructor
