public class Main {
    public static void main(String[] args) {
        int claveEnemiga = 47;
        int umbral = 50;
        boolean accesoPermitido = (claveEnemiga < umbral) && (claveEnemiga % 3 != 0);
        
        if (accesoPermitido) {
            System.out.println(">> SEÑAL AUTORIZADA: Extracción");
        } else {
            System.out.println(">> ALERTA: Señal comprometida. Abortar.");
        }
    }
}
