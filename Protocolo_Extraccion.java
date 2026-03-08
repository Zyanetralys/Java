public class Protocolo_Extraccion {
    public static void main(String[] args) {

//No hay vigilancia enemiga (vigilancia_enemiga = false)
        boolean vigilancia_enemiga = false;

// y quedan 3.92 horas (hasta llegada del barco)
        double tiempo_restante = 3.92;

// Decisión táctica: solo extrae si no hay amenaza y aún queda tiempo

        if (!vigilancia_enemiga && tiempo_restante <= 4.0) {
            System.out.println("EXTRACCION AUTORIZADA - PUNTO DELTA");
        } else {
            System.out.println("ABORTAR - ACTIVAR PROTOCOLO SILENCIO");
        }
    }
}
