public class Interrogatorio {

    public static void log(String mensaje) {
        System.out.println(mensaje);
    }

    public static void estabilizarPrisionera(String nombre) {
        log("[MEDICO] Administrando nanobots reparadores a " + nombre + "...");
        log("[SISTEMA] Signos vitales de " + nombre + ": ESTABLES. Proceder.");
        log("");
    }

    public static void inyectarSueroVerdad(String nombre, int dosis) {

        log("[QUÍMICO] Insertando aguja neural en " + nombre + ".");

        if (dosis > 200) {
            log("!!! ALERTA !!! Dosis letal detectada (" + dosis + "mg). Riesgo de daño cerebral permanente.");
            log(nombre + " convulsiona violentamente.");
        }
        else if (dosis > 50) {
            log("[INFO] Dosis media (" + dosis + "mg). Resistencia psicológica disminuyendo.");
            log(nombre + " muestra signos de estrés psicológico.");
        }
        else {
            log("[INFO] Dosis baja (" + dosis + "mg). El sujeto mantiene lucidez.");
        }

        log("");
    }

    public static void extraerMemoria(String nombre, String sector) {

        log("[HACKER] Conectando al lóbulo temporal de " + nombre + "...");
        log("[HACKER] Accediendo al sector: " + sector);
        log("[DATOS] Extracción completada.");
        log("-----------------------------------");
    }

    // Protocolo de seguridad que puede servir como "ayuda indirecta"
    public static void protocoloContingencia(String nombre) {

        log("[SISTEMA] Ejecutando protocolo de contingencia de seguridad...");
        log("[SISTEMA] Simulación de fallo en cerraduras de contención.");
        log("[SISTEMA] Marcando sujeto " + nombre + " para traslado inmediato.");
        log("[SISTEMA] Ruta alternativa activada.");
        log("-----------------------------------");
    }

    public static void main(String[] args) {

        String objetivo = "X";

        log(">>> INICIANDO PROTOCOLO DE INTERROGATORIO: " + objetivo + " <<<");
        log("");

        estabilizarPrisionera(objetivo);

        int dosis = 120;
        inyectarSueroVerdad(objetivo, dosis);

        extraerMemoria(objetivo, "CLAVES_RED");
        extraerMemoria(objetivo, "COORDENADAS_BASE");

        protocoloContingencia(objetivo);

        log(">>> PROTOCOLO FINALIZADO <<<");
    }
}
