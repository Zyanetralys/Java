public class Calculo_Extraccion {
    public static void main(String[] args) {
      
        // Velocidad del barco en nudos náuticos
        double velocidad_nudos = 25.5;
        
        /*
         * Cálculo de tiempo de llegada para extracción
         * Fórmula: tiempo = distancia / velocidad
         * Critical para sincronización con equipo en muelle
         */
      
        int distancia_millas = 100;
        
        double tiempo_horas = distancia_millas / velocidad_nudos;
        
        System.out.println(tiempo_horas);
    }
}
