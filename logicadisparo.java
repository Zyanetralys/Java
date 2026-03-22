public class Dron {
    public static void main(String[] args) {
        int balas = 5;
        int distanciaObjetivo = 100;
        boolean seguroActivado = false;
        double precision = 0.95;

        if (balas > 0 && !seguroActivado) {
            System.out.println("Estado: Listo para disparar");
            
            if (distanciaObjetivo < 150) {
                System.out.println("Objetivo dentro de rango");
                
                System.out.println("¡FUEGO!");
                balas--;
                
                System.out.println("Munición restante: " + balas);
            } else {
                System.out.println("ALERTA: Objetivo fuera de rango.");
            }
        } else {
            System.out.println("BLOQUEO: Sin munición o Seguro Activo.");
        }
    }
}
