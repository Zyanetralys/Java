/**
 * CLASE MAESTRA: NIRITH_CORE_PROTOCOL
 * DESCRIPCIÓN: Integración total de variables, control de flujo, objetos y manejo de errores.
 * UBICACIÓN FÍSICA: Servidores Críticos, Torrejón de Ardoz.
 * ADVERTENCIA: Cualquier excepción no capturada resultará en purga neural inmediata.
 */
public class Nirith_Core_Protocol {

    // =========================================================================
    // 1. VARIABLES Y TIPOS DE DATOS (LOS CIMIENTOS)
    // Sin datos precisos, el mando ciego dispara a sus propias tropas.
    // =========================================================================
    
    // Java Intro / Get Started / Syntax: El punto de entrada obligatorio.
    public static void main(String[] args) {
        
        // Variables & Data Types: Definición estricta de la realidad.
        int nivelAmenaza = 5;                 // Entero: Nivel de alerta actual.
        double precisionDisparo = 99.99;      // Double: Porcentaje de éxito requerido.
        boolean estadoLealtad = true;         // Boolean: Verdadero o falso. No hay grises.
        char inicialClan = 'N';               // Char: Inicial de la Comandante.
        String objetivoMision = "Supervivencia"; // String: Cadena de texto para identificación.

        // Type Casting: Forzar la realidad a tu voluntad (con riesgo de pérdida de datos).
        long identidadSecreta = (long) precisionDisparo; 
        // NOTA: Al convertir double a long, pierdes los decimales. Igual que al torturar, pierdes información sutil.

        // Operators: La aritmética del caos.
        int recursosTotales = 100;
        recursosTotales -= 15; // Operador de asignación compuesta. Restamos bajas.

        // Output & Comments: Comunicación clara o muerte.
        System.out.println(">>> INICIANDO SECUENCIA DE COMANDO..."); 
        // Este es un comentario de una línea. Ignorado por la máquina, vital para el humano.
        
        /* 
           Este es un bloque de comentarios multilínea.
           Aquí documentamos tácticas que no deben ser compiladas, solo leídas.
           El silencio es tan importante como el código.
        */

        // Strings & Math: Manipulación de la verdad y cálculo de daños.
        String mensajeCodificado = "ALERTA ROJA";
        System.out.println(mensajeCodificado.toLowerCase()); // "alerta roja"
        System.out.println(Math.sqrt(recursosTotales)); // Raíz cuadrada de los recursos restantes.

        // Booleans & If/Else: La bifurcación del destino.
        if (estadoLealtad == true) {
            System.out.println("Acceso concedido al núcleo.");
        } else {
            System.out.println("Ejecutando protocolo de eliminación.");
            return; // Termina el programa inmediatamente. Error fatal.
        }

        // Switch: Selección de múltiples escenarios tácticos.
        int codigoEscenario = 2;
        switch (codigoEscenario) {
            case 1: System.out.println("Escenario: Infiltración Silenciosa"); break;
            case 2: System.out.println("Escenario: Asalto Frontal Total"); break;
            case 3: System.out.println("Escenario: Retirada Estratégica"); break;
            default: System.out.println("Escenario Desconocido: Caos Absoluto");
        }

        // =========================================================================
        // 2. BUCLES Y CONTROL DE FLUJO (LA REPETICIÓN DEL DOLOR)
        // La disciplina se forja en la repetición hasta que la sangre se seca.
        // =========================================================================

        // While Loop: Ejecutar mientras la condición de vida persista.
        int latidosCorazon = 3;
        while (latidosCorazon > 0) {
            System.out.println("Latido restante: " + latidosCorazon);
            latidosCorazon--;
        }

        // For Loop: Iteración controlada sobre un conjunto definido de objetivos.
        for (int i = 0; i < 5; i++) {
            System.out.println("Verificando periferia sector " + i);
            if (i == 2) {
                break; // Break: Interrupción brusca ante anomalía crítica.
            }
        }
        
        // Continue: Saltar un paso defectuoso sin detener la misión.
        for (int j = 0; j < 5; j++) {
            if (j == 3) continue; // Omite la iteración 3.
            System.out.println("Procesando nodo " + j);
        }

        // Arrays: Almacenamiento contiguo de municiones o datos vitales.
        String[] agentesClan = {"Ya'el", "Lira", "Voss", "Kaela"};
        System.out.println("Agente líder: " + agentesClan[0]); // Acceso por índice.

        // =========================================================================
        // 3. MÉTODOS Y SCOPE (LA JERARQUÍA DE FUNCIONES)
        // Una orden dada desde arriba debe ser ejecutada abajo sin cuestionar.
        // =========================================================================
        
        ejecutarManiobraEvansiva("Sector Norte"); // Llamada a método con parámetro.
        int dañoCalculado = calcularDaño(50, 2);  // Método con retorno.
        System.out.println("Daño infligido: " + dañoCalculado);

        // Method Overloading: Misma orden, diferentes contextos (polimorfismo estático).
        registrarIncidente("Fallo de sistema");
        registrarIncidente("Fallo de sistema", 404);

        // Scope: Las variables locales mueren al salir de su bloque. No tienen legado.
        {
            int variableEfimera = 999;
            System.out.println("Variable viva dentro del bloque: " + variableEfimera);
        }
        // variableEfimera ya no existe aquí. Intentar usarla causaría error de compilación.

        // Recursion: La función que se devora a sí misma hasta alcanzar el límite.
        System.out.println("Cuenta regresiva de autodestrucción: " + cuentaRegresiva(3));

        // =========================================================================
        // 4. CLASES Y OOP (LA ARQUITECTURA DEL PODER)
        // Todo es un objeto. Todo tiene atributos y comportamientos definidos por el Clan.
        // =========================================================================

        // Instanciación de objetos basados en la estructura definida más abajo.
        AgenteElite comandante = new AgenteElite("Nirith", 99, "Ciber-comando");
        comandante.emitirOrden("Purga total");
        comandante.mostrarEstado();

        // Encapsulation: Los datos privados solo se acceden mediante métodos públicos (Getters/Setters).
        // Nadie toca el núcleo sin permiso explícito.
        comandante.setNivelPoder(100); 

        // Inheritance & Polymorphism: La subordinada hereda rasgos, pero puede superar a la maestra.
        AgenteSigilo espia = new AgenteSigilo("Sombra", 80, "Infiltración");
        espia.emitirOrden("Silencio absoluto"); // Sobrescritura de método (Polimorfismo).

        // Abstract Class & Interface: Contratos que deben ser cumplidos o la muerte es segura.
        // (Ver definiciones de clases al final del archivo)

        // Inner Classes: Estructuras ocultas dentro de otras estructuras.
        AgenteElite.NucleoInterno nucleo = comandante.new NucleoInterno();
        nucleo.accesoRestringido();

        // Enum: Valores fijos e inmutables. La ley es la ley.
        EstadoMision estadoActual = EstadoMision.EN_CURSO;
        System.out.println("Estado oficial: " + estadoActual);

        // User Input & Date: Interacción con el entorno y marca de tiempo del crimen.
        // (Simulado para evitar bloqueo de consola en este briefing)
        java.util.Date ahora = new java.util.Date();
        System.out.println("Marca de tiempo operativa: " + ahora.toString());

        // =========================================================================
        // 5. MANEJO DE ERRORES Y EXCEPCIONES (EL FRACASO NO ES UNA OPCIÓN)
        // Cuando el sistema falla, debes estar preparada para contener el colapso.
        // =========================================================================

        try {
            int resultadoPeligroso = 10 / 0; // Esto lanzará ArithmeticException.
        } catch (ArithmeticException e) {
            System.out.println("ERROR CRÍTICO: División por cero detectada. Conteniendo fallo...");
            // El catch evita que el programa entere. Es tu red de seguridad.
        } finally {
            System.out.println("Bloque Finally: Limpieza de residuos biológicos completada.");
            // Se ejecuta siempre, haya error o no.
        }

        // Try-with-resources: Gestión automática de recursos limitados.
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            // El scanner se cierra automáticamente al salir del bloque.
        } catch (Exception e) {
            System.out.println("Fallo en la captura de entrada de datos.");
        }

        // =========================================================================
        // 6. COLECCIONES Y ESTRUCTURAS DE DATOS (EL ARSENAL LOGÍSTICO)
        // Organizar el caos en listas ordenadas listas para el despliegue.
        // =========================================================================

        // ArrayList: Lista dinámica y expansible.
        java.util.ArrayList<String> arsenal = new java.util.ArrayList<>();
        arsenal.add("Rifle de Plasma");
        arsenal.add("Cuchillo Vibro");
        arsenal.remove(0); // Elimina el primer elemento.

        // LinkedList: Cadena de nodos interconectados. Frágil si se rompe un eslabón.
        java.util.LinkedList<Integer> cadenaMando = new java.util.LinkedList<>();
        cadenaMando.add(1); cadenaMando.add(2);

        // Set (HashSet): Colección sin duplicados. La unicidad es obligatoria.
        java.util.HashSet<String> codigosUnicos = new java.util.HashSet<>();
        codigosUnicos.add("ALFA");
        codigosUnicos.add("ALFA"); // Este no se añade. Los sets no permiten repetidos.

        // Map (HashMap): Pares Clave-Valor. Coordinadas de objetivos.
        java.util.HashMap<String, Integer> objetivosPrioritarios = new java.util.HashMap<>();
        objetivosPrioritarios.put("Objetivo_A", 100);
        objetivosPrioritarios.put("Objetivo_B", 50);
        System.out.println("Prioridad Objetivo A: " + objetivosPrioritarios.get("Objetivo_A"));

        // Iterator & Algorithms: Recorrer y ordenar el desorden.
        java.util.Collections.sort(arsenal); // Ordena el arsenal alfabéticamente.

        // =========================================================================
        // 7. AVANZADO: HILOS, LAMBDA Y GENÉRICOS (LA GUERRA MULTIDIMENSIONAL)
        // Ejecutar múltiples frentes simultáneos sin perder la cordura.
        // =========================================================================

        // Threads: Hilos de ejecución paralela.
        Thread hiloEspionaje = new Thread(() -> {
            System.out.println("Hilo secundario: Escaneando frecuencias enemigas...");
        });
        // hiloEspionaje.start(); // Comentado para no bloquear este briefing.

        // Lambda Expressions: Funciones anónimas concisas. Eficiencia letal.
        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(5); numeros.add(2); numeros.add(9);
        numeros.forEach(n -> System.out.println("Procesando número: " + n));

        // Generics: Seguridad de tipos en tiempo de compilación.
        CajaSeguridad<String> cajaClave = new CajaSeguridad<>("Codigo_Nuclear");
        System.out.println("Contenido seguro: " + cajaClave.obtenerContenido());

        // Regex: Patrones para validar identidades falsas.
        String emailSospechoso = "agente@clan.matriarcal";
        if (emailSospechoso.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            System.out.println("Identidad digital validada.");
        }

        // =========================================================================
        // 8. FILE HANDLING & I/O STREAMS (REGISTRO DE LA VERDAD)
        // Lo que no se escribe en el disco duro, no existe. Lo que se borra, muere.
        // =========================================================================
        
        // Nota: La ejecución real de archivos requiere permisos OS y rutas absolutas.
        // Aquí simulamos la lógica de flujo.
        
        try {
            // Crear archivo (simulado conceptualmente)
            // File miArchivo = new File("registro_mision.txt");
            // miArchivo.createNewFile();
            
            // Write (Escritura)
            // java.io.FileWriter escritor = new java.io.FileWriter("registro_mision.txt");
            // escritor.write("La misión ha comenzado.");
            // escritor.close();

            // Read (Lectura)
            // java.util.Scanner lector = new java.util.Scanner(miArchivo);
            
            // Streams (Flujo de bytes brutos)
            // FileInputStream entrada = new FileInputStream("imagen_satelital.jpg");
            // FileOutputStream salida = new FileOutputStream("copia_seguridad.jpg");
            
            // BufferedReader/Writer: Lectura eficiente línea por línea.
            // Essential para logs masivos.
            
            System.out.println("Módulo de Archivo: Listo para escritura en disco físico.");
            
        } catch (Exception e) {
            System.out.println("Fallo crítico en subsistema de almacenamiento.");
        }

        System.out.println(">>> SECUENCIA DE INICIALIZACIÓN COMPLETADA. ESPERANDO ÓRDENES.");
    }

    // =========================================================================
    // DEFINICIÓN DE MÉTODOS AUXILIARES
    // =========================================================================

    public static void ejecutarManiobraEvansiva(String ubicacion) {
        System.out.println("Ejecutando evasión en: " + ubicacion);
    }

    public static int calcularDaño(int base, int multiplicador) {
        return base * multiplicador;
    }

    public static void registrarIncidente(String tipo) {
        System.out.println("Incidente registrado: " + tipo);
    }

    public static void registrarIncidente(String tipo, int codigo) {
        System.out.println("Incidente [" + codigo + "]: " + tipo);
    }

    public static int cuentaRegresiva(int n) {
        if (n <= 0) return 0; // Caso base. Fin de la recursión.
        return n + cuentaRegresiva(n - 1);
    }

    // =========================================================================
    // DEFINICIÓN DE CLASES INTERNAS Y EXTERNAS (ESTRUCTURA DEL CLAN)
    // =========================================================================
}

// Clase Principal: Define el molde del agente.
class AgenteElite {
    // Atributos (Encapsulamiento: private)
    private String nombre;
    private int nivelPoder;
    protected String especialidad;

    // Constructor: Inicialización obligatoria al nacer/clonar.
    public AgenteElite(String nombre, int nivel, String especialidad) {
        this.nombre = nombre; // 'this' refiere a la instancia actual.
        this.nivelPoder = nivel;
        this.especialidad = especialidad;
    }

    // Métodos Públicos: Interfaz con el mundo exterior.
    public void emitirOrden(String orden) {
        System.out.println(this.nombre + " ordena: " + orden);
    }

    public void mostrarEstado() {
        System.out.println("Agente: " + this.nombre + " | Poder: " + this.nivelPoder);
    }

    // Getter y Setter (Encapsulamiento)
    public int getNivelPoder() { return nivelPoder; }
    public void setNivelPoder(int nivel) { 
        if (nivel > 0) this.nivelPoder = nivel; 
    }

    // Inner Class: Solo accesible desde dentro de AgenteElite.
    public class NucleoInterno {
        public void accesoRestringido() {
            System.out.println("Accediendo a secretos del clan desde " + nombre);
        }
    }
}

// Herencia: La subclase extiende a la superclase.
class AgenteSigilo extends AgenteElite {
    public AgenteSigilo(String nombre, int nivel, String especialidad) {
        super(nombre, nivel, especialidad); // Llama al constructor del padre.
    }

    // Polimorfismo (Overriding): Cambia el comportamiento heredado.
    @Override
    public void emitirOrden(String orden) {
        System.out.println("[Susurrando] " + super.nombre + " ejecuta: " + orden);
    }
}

// Clase Abstracta: No se puede instanciar, solo heredar. Contrato parcial.
abstract class OperacionEncubierta {
    public abstract void infiltrar(); // Método sin cuerpo, debe ser implementado.
    public void planificar() {
        System.out.println("Planificación estratégica estándar.");
    }
}

// Interfaz: Contrato puro. 100% abstracto (implícitamente).
interface ProtocoloExterminio {
    void eliminarObjetivo();
    void limpiarEvidencia();
}

// Enumeración: Tipo de dato especial con constantes fijas.
enum EstadoMision {
    PENDIENTE, EN_CURSO, COMPLETADA, FALLIDA, PURGADA
}

// Genéricos: Clase parametrizada para seguridad de tipos.
class CajaSeguridad<T> {
    private T contenido;
    public CajaSeguridad(T contenido) { this.contenido = contenido; }
    public T obtenerContenido() { return contenido; }
}
