public class TunelSheol {
    public static void main(String[] args) {
        // Bucle FOR: Recorre los sectores del 1 al 5
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("--- Entrando al Sector " + i + " ---");

            // SWITCH: Decide la acción según el sector actual (i)
            switch (i) {
                case 1:
                    System.out.println("Protocolo Alpha: Amenaza Baja. Solo registro.");
                    break; // ¡Frena aquí!
                
                case 2:
                    System.out.println("Protocolo Beta: Amenaza Media. Escudos ON.");
                    break; 
                
                case 3:
                    System.out.println("Protocolo Gamma: Amenaza Alta. Contramedidas ACTIVAS.");
                    break; 
                
                case 4:
                    System.out.println("Protocolo Delta: CRÍTICO. Artillería solicitada.");
                    break; 
                
                case 5:
                    System.out.println("Protocolo Omega: Base alcanzada. Reinicio completo.");
                    break; 
                    
                default:
                    System.out.println("ERROR: Coordenadas inválidas.");
            }
        }
        
        System.out.println("Patrulla completada. Túnel asegurado.");
    }
}
