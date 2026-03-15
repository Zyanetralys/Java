public class Interrogatorio {

    public static void estabilizarPrisionera(String nombre) {
        System.out.println("[MEDICO] Administrando nanobots reparadores a " + nombre + "...");
        System.out.println("[SISTEMA] Signos vitales de " + nombre + ": ESTABLES. Proceder.");
    }

    public static void inyectarSueroVerdad(String nombre, int dosis) {
        System.out.println("[QUÍMICO] Insertando aguja neural en " + nombre + ".");
        
        if (dosis > 200) {
            System.out.println("!!! ALERTA !!! Dosis letal detectada (" + dosis + "mg). Riesgo de daño cerebral permanente.");
            System.out.println(nombre + " convulsiona violentamente. Sus gritos son ahogados por el inhibidor de sonido.");
        } else if (dosis > 50) {
            System.out.println("[INFO] Dosis media (" + dosis + "mg). Resistencia psicológica disminuyendo rápidamente.");
            System.out.println(nombre + " comienza a llorar, sus pupilas se dilatan.");
        } else {
            System.out.println("[INFO] Dosis baja (" + dosis + "mg). Proceso lento. El sujeto mantiene cierta lucidez.");
        }
    }

    public static void extraerMemoria(String nombre, String sector) {
        System.out.println("[HACKER] Conectando al lóbulo temporal de " + nombre + "...");
        System.out.println("[HACKER] Accediendo al sector: '" + sector + "'...");
        System.out.println("[DATOS] Extrayendo archivos encriptados... ÉXITO.");
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        String objetivo = "KAELA";
        
        System.out.println(">>> INICIANDO PROTOCOLO DE INTERROGATORIO PARA: " + objetivo + " <<<");
        System.out.println();

        estabilizarPrisionera(objetivo);

        int miDosis = 150; 
        inyectarSueroVerdad(objetivo, miDosis);

        extraerMemoria(objetivo, "CLAVES_ACCESO_RED_KAEL");
        
        extraerMemoria(objetivo, "COORDENADAS_BASE_SUBTERRANEA");

        System.out.println(">>> INTERROGATORIO FINALIZADO. DATOS OBTENIDOS. <<<");
    }
}
