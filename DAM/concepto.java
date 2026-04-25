// ==========================================
// 1. LA CLASE
// ==========================================
public class Expediente {
    // ATRIBUTOS (Estado interno del objeto)
    private String claveAgente;
    private String autor;
    private int paginas;

    // CONSTRUCTOR (Protocolo de inicialización)
    // Se ejecuta AUTOMÁTICAMENTE al usar 'new'
    public Expediente(String clave, String autor, int paginas) {
        this.claveAgente = clave;
        this.autor = autor;
        this.paginas = paginas;
        System.out.println(">> [INIC] Expediente " + clave + " compilado en memoria.");
    }

    // MÉTODOS (Comportamientos/Acciones)
    public void desplegarInfo() {
        System.out.println(">> CLAVE: " + claveAgente);
        System.out.println(">> AUTORA: " + autor);
        System.out.println(">> PÁGINAS: " + paginas);
        System.out.println("--------------------------");
    }

    public void actualizarPaginas(int nuevasPaginas) {
        if (nuevasPaginas > 0) {
            this.paginas = nuevasPaginas;
            System.out.println(">> [UPDATE] Páginas actualizadas a: " + this.paginas);
        } else {
            System.err.println(">> ERROR: El número de páginas no puede ser negativo.");
        }
    }
}

// ==========================================
// 2. PUNTO DE ENTRADA
// ==========================================
public class Main {
    public static void main(String[] args) {
        // INSTANCIACIÓN: Crear OBJETOS a partir de la CLASE
        // 'new' asigna memoria en Heap. La referencia se guarda en Stack.
        Expediente exp1 = new Expediente("ALFA-01", "Valeria", 42);
        Expediente exp2 = new Expediente("BRAVO-07", "Kaela", 18);

        System.out.println("\n>> DESPLIEGUE DE REGISTROS:");
        exp1.desplegarInfo();
        exp2.desplegarInfo();

        // MODIFICACIÓN DE ESTADO vía métodos
        exp1.actualizarPaginas(55);
        exp1.desplegarInfo(); // Refleja el nuevo estado
    }
}
