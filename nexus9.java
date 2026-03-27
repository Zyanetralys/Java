import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaAnalisisAvanzado {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        iniciarSistema();
        cargarModulos();
        autenticarUsuario();

        System.out.print("\n[INPUT] Introduce parámetro biométrico: ");
        double valor = scanner.nextDouble();

        analizarDato(valor);

        scanner.close();
    }

    public static void iniciarSistema() throws InterruptedException {
        System.out.println("===============================================");
        System.out.println("   SISTEMA DE ANÁLISIS CUÁNTICO NEURAL v9.7");
        System.out.println("===============================================");

        Thread.sleep(800);
        log("Inicializando núcleo de procesamiento...");
        Thread.sleep(700);
        log("Sincronizando relojes atómicos...");
        Thread.sleep(600);
        log("Estableciendo canal seguro...");
    }

    public static void cargarModulos() throws InterruptedException {
        String[] modulos = {
            "Módulo de Inteligencia Predictiva",
            "Motor de Análisis Biométrico",
            "Red Neuronal Profunda v4",
            "Sistema de Correlación de Datos",
            "Filtro de Ruido Cuántico"
        };

        for (String modulo : modulos) {
            Thread.sleep(500);
            log("Cargando " + modulo + "...");
        }

        log("Todos los módulos cargados correctamente.");
    }

    public static void autenticarUsuario() throws InterruptedException {
        Thread.sleep(500);
        log("Verificando identidad...");
        Thread.sleep(700);
        log("Acceso concedido.");
    }

    public static void analizarDato(double valor) throws InterruptedException {
        log("Iniciando análisis multidimensional...");

        Thread.sleep(800);
        log("Aplicando algoritmos de inferencia...");
        Thread.sleep(800);
        log("Contrastando con base de datos global...");
        Thread.sleep(800);

        System.out.println("\n========= RESULTADO =========");
        System.out.println("Tras un análisis extremadamente complejo...");
        System.out.println("Hemos determinado que:");
        System.out.println("\n>>> El valor introducido es: " + valor);
        System.out.println("=============================\n");

        log("Análisis finalizado.");
    }

    public static void log(String mensaje) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = LocalDateTime.now().format(formatter);
        System.out.println("[" + hora + "] " + mensaje);
    }
}
