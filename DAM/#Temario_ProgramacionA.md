# RESUMEN DE PROGRAMACIÓN A

---

## ÍNDICE
1. [TEMA 0: QUÉ ES LA PROGRAMACIÓN](#tema-0)
2. [TEMA 1: PROGRAMACIÓN ESTRUCTURADA](#tema-1)
3. [TEMA 2: ESTRUCTURAS DE CONTROL](#tema-2)
4. [TEMA 3: DEPURACIÓN DEL CÓDIGO](#tema-3)
5. [TEMA 4: PROGRAMACIÓN ORIENTADA A OBJETOS I](#tema-4)
6. [TEMA 5: GUI Y LIBRERÍAS](#tema-5)
7. [ANEXO: BASES DE DATOS ORIENTADAS A OBJETOS (BDOO)](#anexo-bdoo)
8. [GLOSARIO TÉCNICO Y REFERENCIA RÁPIDA](#glosario)

---

<a name="tema-0"></a>
# TEMA 0: QUÉ ES LA PROGRAMACIÓN

## Definición y Elementos
- **Programación**: Proceso de crear un conjunto de instrucciones (código) en un lenguaje que el ordenador comprende para resolver un problema o ejecutar una tarea.
- **Elementos fundamentales**:
  1. Problema/Tarea a resolver.
  2. Solución/Conjunto de instrucciones en un lenguaje de programación.
- **Casos de aplicación**:
  - **Banca**: Recuentos de capital → COBOL (desde años 60).
  - **Salud**: Diagnóstico cáncer de mama → Python + Machine Learning.
  - **Videojuegos**: FC 25 EA Sports → Motor gráfico EA SPORTS IGNITE.

## 0.1 Historia de la Programación
| Hito | Descripción | Relevancia |
|------|-------------|------------|
| **Ábaco** | Herramienta con cuentas en varillas para operaciones aritméticas. | Primera calculadora física. |
| **Telar Jacquard (1801)** | Tarjetas perforadas para patrones textiles. | Inspiró la programación secuencial por instrucciones. |
| **Máquina Analítica (Babbage, 1840s)** | Diseño de computadora de propósito general. | Separación clara entre datos y procedimiento. |
| **Ada Lovelace** | Desarrolló programas para la máquina de Babbage. | Primera programadora de la historia. Concepto de algoritmo. |
| **Programa Apollo (1960s)** | Software de vuelo en ensamblador para AGC. Liderado por Margaret Hamilton. | Código open-source disponible. Primer ordenador con circuitos integrados. |

## 0.2 El Algoritmo
- **Definición**: Secuencia finita y ordenada de pasos/instrucciones que resuelven un problema o realizan una tarea.
- **Características obligatorias**:
  1. **Finitud**: Número finito de pasos.
  2. **Definido**: Cada paso claramente especificado.
  3. **Entrada**: Acepta cero o más entradas.
  4. **Salida**: Produce al menos una salida.
  5. **Eficiencia**: Resuelve en tiempo/recursos razonables.
- **Ejemplo 1: Receta macarrones boloñesa**
  - Entrada: Ingredientes.
  - Definido/Finitud: Picar, cocinar salsa, hervir pasta, mezclar.
  - Salida: Plato listo.
  - Eficiencia: 30-45 min.
- **Ejemplo 2: Cambio de aceite coche**
  - Entrada: Aceite, filtro, herramientas.
  - Definido/Finitud: Elevar coche, drenar, cambiar filtro, verter nuevo.
  - Salida: Motor con aceite nuevo.
  - Eficiencia: 30-45 min.

## 0.3 Pensamiento Computacional
- **Definición**: Proceso de resolución de problemas que aplica técnicas computacionales para que un ordenador ayude en la solución.
- **4 Pilares**:
  1. **Descomposición**: Dividir problema complejo en partes manejables.
  2. **Reconocimiento de patrones**: Identificar similitudes/diferencias para reutilizar soluciones.
  3. **Abstracción**: Enfocarse en detalles esenciales, ignorar lo irrelevante.
  4. **Algoritmos**: Diseñar pasos ordenados para implementación.
- **Aplicaciones**: Educativa (lógica/creatividad), Industria (eficiencia/decisiones), Vida diaria (resolución lógica/adaptación).
- **Ejemplo**: Buscar número en lista desordenada `[10, 20, 5, 9, 15, 12, 1, 8, 4, 7, 16, 3]` → Dividir segmentos (descomposición), buscar repeticiones (patrones), ignorar tipo dato (abstracción), diseñar búsqueda (algoritmo).

## 0.4 Proceso de Creación de un Programa
Ciclo recurrente e independiente del lenguaje:
Análisis del problema: comprender el problema antes de codificar.
- Diseño de la solución: crear algoritmos y estructura lógica.
- Implementación: escribir código en el lenguaje elegido. Incluye:
  • Pruebas: verificar con diferentes entradas que la salida sea correcta.
  • Corregir errores: identificar fallos, modificar y volver a probar.
- Programa terminado: código verificado y listo para uso.

# TEMA 1: PROGRAMACIÓN ESTRUCTURADA

Definición: Paradigma de programación que enfatiza la mejora de la claridad, calidad y tiempo de desarrollo, utilizando estructuras de control de flujo claras y bien definidas. Se basa en dividir el programa en módulos o bloques más pequeños y manejables que se pueden desarrollar y probar de manera independiente, facilitando la reutilización de código.

1.1 Primer programa en Java
- Entorno recomendado: OnlineGDB (compilador online).
- Estructura base:
public class Main {
    public static void main(String[] args) {
        // Instrucciones aquí
        System.out.println("Hola Mundo!");
    }
}
- Conceptos clave:
  • System.out.println(): imprime texto con salto de línea.
  • "texto": cadenas de texto (String en Java).
  • Concatenación: "4x5= " + 20 permite combinar texto y números.
- Ejemplo: Tabla de multiplicar del 4 usando múltiples println() para mostrar cada operación en una línea distinta.

1.2 Variables
Definición: Espacio de almacenamiento que se utiliza para almacenar datos modificables durante la ejecución de un programa. Permiten etiquetar, manipular y reutilizar datos de manera eficiente.
Características:
1. Nombre: identificador único.
2. Tipo de dato: especifica qué valores puede almacenar.
3. Valor: contenido que puede cambiar durante la ejecución.
4. Alcance: contexto donde es accesible (local/global).
5. Duración: tiempo de existencia en memoria.
Tipos primitivos en Java:
- boolean: true o false
- byte: 8 bits
- int: 32 bits
- float: 32 bits (requiere sufijo 'f', ej: 10.5f)
- double: 64 bits
- char: 16 bits Unicode
- String: cadena de texto (tipo referencia, no primitivo)
Ejemplo:
String texto = "La temperatura máxima en Oviedo es: ";
double temperatura = 21.5;
System.out.println(texto + temperatura + "ºC");

1.3 Operadores
Símbolos que indican al ordenador realizar operaciones matemáticas, lógicas o de manipulación de datos.
- Aritméticos: + (suma), - (resta), * (multiplicación), / (división), % (módulo/resto). El módulo devuelve el resto de una división entera. Útil para comprobar paridad: n % 2 == 0.
- Unarios: + (positivo), - (negación), ++ (incremento), -- (decremento), ! (negación lógica). Nota: a++ devuelve el valor actual y luego incrementa; ++a incrementa primero y luego devuelve el valor.
- Asignación: =, +=, -=, *=, /=, %=
- Relacionales: ==, !=, >, <, >=, <=
- Lógicos: && (AND: true solo si ambos operandos son true), || (OR: true si al menos uno es true), ! (NOT: invierte el valor)
- Ternario: (condición) ? valor_si_true : valor_si_false
- Bit a bit: &, |, ^, ~, <<, >>, >>> (operaciones a nivel de bits)

1.4 Casting
Definición: Proceso de convertir un valor de un tipo de dato a otro.
- Casting Implícito (Widening): Automático. Convierte de menor a mayor tamaño (int -> long, int -> double). Sin pérdida de datos.
- Casting Explícito (Narrowing): Manual. Convierte de mayor a menor tamaño. Sintaxis: (tipo) valor. Puede provocar pérdida de datos.
Ejemplo:
double numeroDecimal = 9.78;
int numeroEntero = (int) numeroDecimal; // Resultado: 9 (se pierden los decimales)

1.5 IDE y Comentarios
IDE (Integrated Development Environment): Entorno que combina editor de código, compilador/intérprete, depurador, constructor de proyectos, control de versiones, entorno de ejecución y documentación. Ventajas: productividad, depuración eficiente, gestión organizada, colaboración y funciones avanzadas (refactorización, autocompletado). Ejemplos: Eclipse, IntelliJ IDEA, Visual Studio, PyCharm, NetBeans.
Comentarios en Java: Ignorados por el compilador, sirven para documentar.
- // Comentario de una línea
- /* Comentario de múltiples líneas */
- /** Javadoc */: Genera documentación HTML. Usa etiquetas @param, @return, @author.

# TEMA 2: ESTRUCTURAS DE CONTROL

Permiten controlar el flujo de ejecución: tomar decisiones, repetir tareas y alterar el flujo de manera controlada.

2.1 Condicionales
- if: Ejecuta bloque si la condición es verdadera.
- if-else: Ejecuta un bloque si es true, otro si es false.
- if-else if: Evalúa múltiples condiciones en secuencia; ejecuta el primer bloque cuya condición sea true.
- switch: Selección por valor exacto. Usa case para valores específicos y default para el resto. Requiere break para evitar fall-through (ejecución de casos siguientes).

2.2 Bucles (repetición)
- for: Ideal cuando se conoce el número de iteraciones. Sintaxis: for(inicialización; condición; actualización) { }
- while: Se ejecuta mientras la condición sea true. Útil cuando el número de iteraciones es desconocido.
- do-while: Garantiza al menos una ejecución. Evalúa la condición al final. Sintaxis: do { } while(condición);

2.3 Estructuras de salto
- break: Sale inmediatamente de un bucle o estructura switch.
- continue: Omite la iteración actual y salta a la siguiente.
- return: Finaliza la ejecución del método y devuelve un valor si el tipo de retorno no es void.

2.4 Funciones
Definición: Bloque de código organizado y reutilizable que realiza una tarea específica. Permite dividir programas grandes en piezas manejables.
Características: Nombre único, parámetros (entrada), cuerpo (instrucciones), valor de retorno (salida opcional).
Tipos:
1. Sin parámetros, sin retorno: void imprimirMensaje() { System.out.println("Bienvenido"); }
2. Con parámetros, con retorno: int sumar(int a, int b) { return a + b; }
3. Con parámetros, sin retorno: void imprimirSaludo(String nombre) { System.out.println("Hola " + nombre); }

2.5 Recursividad
Definición: Técnica donde una función se llama a sí misma para resolver subproblemas más pequeños del mismo tipo. Analogía: muñecas matrioska.
Requisitos obligatorios: 1) Condición base (caso de parada), 2) Llamada recursiva que avance hacia la base.
Ejemplo Factorial:
Iterativo: for(int i=1; i<=n; i++) resultado *= i;
Recursivo: if(n==0) return 1; return n * factorial(n-1);
Ejemplo Fibonacci:
Iterativo: variables fib0=0, fib1=1; bucle calcula siguiente.
Recursivo: if(n<=1) return n; return fibonacci(n-1) + fibonacci(n-2);
Nota: La recursión consume memoria en la Stack. Sin condición base provoca StackOverflowError. Para problemas con solapamiento de subproblemas (Fibonacci), la versión iterativa es más eficiente.

2.6 Palabras reservadas
Identificadores predefinidos por el lenguaje con significado especial. No pueden usarse como nombres de variables, métodos o clases.
Categorías:
- Tipos de datos: boolean, byte, char, double, float, int, long, short, void
- Control de flujo: if, else, switch, case, default, while, do, for, break, continue, return
- Modificadores: public, private, protected, static, final, abstract
- Clases/Objetos: class, interface, extends, implements, new, this, super
- Otras: import, package, null, instanceof, synchronized, native, volatile, transient, try, catch, finally, throw, throws, assert, enum

2.7 Pseudocódigo
Definición: Descripción de alto nivel de un algoritmo usando lenguaje natural mezclado con estructuras de programación. No se ejecuta. Sirve para planificar lógica y reutilizar entre lenguajes.
Estructura: ALGORITMO Nombre \n ENTRADA: ... \n SALIDA: ... \n acciones \n DEVOLVER ... \n FIN ALGORITMO
Ejemplo Potencia:
ALGORITMO CalcularPotencia
ENTRADA: base (entero), exponente(entero)
SALIDA: resultado (entero)
SI exponente = 0 ENTONCES
  resultado <- 1
SINO
  resultado <- 1
  PARA i <- 1 HASTA exponente HACER
    resultado <- resultado * base
  FIN PARA
FIN SI
DEVOLVER resultado
FIN ALGORITMO

# TEMA 3: DEPURACIÓN DEL CÓDIGO

Definición: Proceso de identificar, diagnosticar y corregir errores (bugs) para asegurar el correcto funcionamiento del programa. Representa una parte significativa del tiempo de desarrollo.

3.1 Qué es un bug
Error o comportamiento inesperado en el código.
Clasificación:
- Errores de compilación: Impiden la generación del ejecutable. Causas: sintaxis incorrecta, tipos incompatibles, variables no declaradas. Ej: falta comilla de cierre en String, usar variable sin declararla.
- Errores en tiempo de ejecución: Ocurren durante la ejecución. Causas: división por cero (ArithmeticException), índice fuera de rango (ArrayIndexOutOfBoundsException), referencia nula (NullPointerException), conversión inválida (NumberFormatException), archivo inexistente (FileNotFoundException).

3.2 Manejo de excepciones
Mecanismo para gestionar eventos anómalos sin detener abruptamente el programa.
Sintaxis:
try {
    // Código que puede lanzar excepción
} catch (TipoExcepción e) {
    // Manejo del error
} finally {
    // Código que siempre se ejecuta (liberación de recursos)
}
Ejemplos de uso: Capturar ArithmeticException al dividir por 0, NullPointerException al acceder a métodos de objeto null, ArrayIndexOutOfBoundsException al acceder a índice inválido, FileNotFoundException al leer archivo inexistente.

3.3 Salida de error (System.err)
Flujo dedicado específicamente para mensajes de error y advertencias. Se separa de System.out, facilitando la redirección a logs o consolas de monitorización.
Uso: System.err.println("Error: Índice fuera de límites"); e.printStackTrace(System.err);

3.4 Uso de logs
Registro cronológico de eventos, errores y estados durante la ejecución. Fundamental para monitoreo y diagnóstico.
Niveles típicos en Java (java.util.logging):
- logger.info(): operación normal
- logger.warning(): situación potencialmente problemática
- logger.severe(): fallo crítico
- logger.log(Level.SEVERE, msg, e): con stack trace
Usos: SO (arranque/seguridad), Apps (comportamiento/rendimiento), Redes (tráfico/intrusiones), Programas personalizados (transacciones/estado).

3.5 El depurador (Debugger)
Herramienta integrada en IDE para ejecución controlada paso a paso.
Funciones clave:
- Breakpoints: Pausan ejecución en líneas específicas.
- Step Over: Avanza línea por línea sin entrar en métodos.
- Step Into: Entra en el código interno del método llamado.
- Step Out: Termina el método actual y retorna.
- Inspección/Modificación: Visualización y cambio de valores de variables en tiempo real.
Escenarios: Depurar suma incorrecta, inspeccionar valor de contador en bucle, seguir flujo de condicional if-else, modificar variable pausada para probar rama alternativa.

3.6 Test unitarios
Pruebas automatizadas que validan el comportamiento correcto de una unidad de código (función/método) de forma aislada.
Framework Java: JUnit.
Anotaciones y asserts: @Test, assertEquals(), assertTrue(), assertFalse(), assertNull().
Buenas prácticas: Cubrir casos normales, límites y errores. Mantener independencia entre tests. Nombres descriptivos.
Ejemplos: testSumar() verifica suma(2,3)==5; testEsPar() verifica true para pares/false impares; testMaximo() verifica mayor de dos; testConvertirAMayusculas() verifica conversión y manejo de null.

3.7 Toma de tiempos y optimización
Medición de la duración de ejecución para identificar cuellos de botella y validar mejoras.
Métodos en Java:
- System.currentTimeMillis() (milisegundos)
- System.nanoTime() (nanosegundos, mayor precisión)
Proceso: long inicio = now(); // código // long fin = now(); long duracion = fin - inicio;
Ejemplos: Medir bucle de 1M iteraciones, comparar bucle for vs IntStream.range().sum(), medir carga de archivo grande con Files.readAllBytes(), medir Arrays.sort() con 1M números aleatorios.

# TEMA 4: PROGRAMACIÓN ORIENTADA A OBJETOS I

Paradigma que organiza el código en torno a objetos (instancias de clases), combinando datos (estado) y comportamientos (métodos).

4.1 Qué es una clase
Definición: Plantilla o modelo que define la estructura (atributos) y comportamiento (métodos) de un tipo de entidad.
Sintaxis: class NombreClase { tipoDato atributo; public NombreClase(params) { this.atributo = params; } public void metodo() { } }
Ejemplo: class Libro { String titulo, autor; int numeroPaginas; public Libro(...) { ... } public void mostrarInformacion() { ... } }

4.2 Qué es un objeto
Definición: Instancia concreta de una clase, con valores específicos en sus atributos. Entidad autónoma que refleja un concepto del mundo real.
Ciclo de vida: Declaración -> Instanciación (new) -> Uso (acceso/modificación) -> Liberación (Garbage Collector cuando no hay referencias).
Ejemplo: Libro libro1 = new Libro("Cien Años de Soledad", "Gabo", 417); libro1.mostrarInformacion();

4.3 Métodos y atributos
- Atributos (propiedades/campos): Variables que definen el estado o características del objeto.
- Métodos: Funciones que definen las acciones o comportamientos del objeto. Operan sobre los atributos.
Acceso: objeto.atributo / objeto.metodo()
Ejemplo Persona: atributos nombre, edad; métodos mostrarInformacion(), cumplirAños().
Ejemplo CuentaBancaria: atributos titular, saldo; métodos depositar(), retirar() con validaciones lógicas.

4.4 Encapsulación
Definición: Principio que restringe el acceso directo a los datos internos de un objeto, permitiendo su modificación solo mediante métodos controlados. Protege la integridad de los datos y facilita el mantenimiento.
Modificadores de acceso:
- private: Solo accesible dentro de la misma clase.
- default (sin modificador): Accesible dentro del mismo paquete.
- protected: Accesible en mismo paquete y subclases.
- public: Accesible desde cualquier clase.
Implementación: Atributos privados + métodos públicos (getters/setters) con validación lógica.
Metáfora: Iceberg (parte pública visible, parte privada oculta).

4.5 El constructor
Método especial que se ejecuta automáticamente al instanciar un objeto con new.
Características: Mismo nombre que la clase, sin tipo de retorno, inicializa el estado del objeto. Puede tener parámetros. Si no se define, Java crea uno por defecto (sin parámetros).
Buena práctica: Garantizar que el objeto nace en un estado válido.

4.6 Los paquetes
Definición: Mecanismo para organizar y agrupar clases, interfaces y subpaquetes relacionados. Evita conflictos de nombres y mejora la modularidad.
Uso: package nombre.paquete; (primera línea del archivo). import nombre.paquete.Clase; o import nombre.paquete.*;
Estructura típica: src/main/java/com/app/modelo/, /servicio/, /util/

4.7 La memoria de un programa
Java gestiona memoria automáticamente en dos áreas principales:
- Heap (Montón): Almacena los objetos creados con new. Gestionada por el Garbage Collector.
- Stack (Pila): Almacena variables locales, referencias a objetos y marcos de llamadas a métodos. Gestión LIFO automática.
Proceso: new Clase() reserva espacio en Heap. La referencia se guarda en Stack y apunta al objeto en Heap. Al salir del ámbito, la referencia se elimina de Stack. Si ningún objeto referencia el Heap, el Garbage Collector lo libera.

4.8 La recursividad en la memoria
Cada llamada recursiva genera un nuevo stack frame en la Stack que almacena variables locales, parámetros y dirección de retorno.
Riesgo: Sin condición base o con profundidad excesiva -> acumulación infinita -> StackOverflowError.
Comparativa: Fibonacci recursivo naive tiene llamadas duplicadas exponenciales. Preferir iteración o memoización para n grande. La iteración es más eficiente en memoria y tiempo.

# TEMA 5: GUI Y LIBRERÍAS

5.1 UI y UX
- UI (User Interface): Elementos visuales e interactivos (botones, menús, colores, layout). Enfocada en apariencia y manejo.
- UX (User Experience): Experiencia completa del usuario (facilidad, eficiencia, satisfacción). Enfocada en sensación y resolución de necesidades.
Herramientas: Figma, Adobe XD. Implementación en Java: Swing, JavaFX.

5.2 Interfaz de comando (CLI)
Interacción mediante comandos de texto en terminal. Potente para automatización, scripts y administración de sistemas.
Ejemplo: Menú interactivo con Scanner para calcular áreas (cuadrado, rectángulo, círculo, triángulo) usando do-while y switch, con métodos separados por figura.

5.3 Librería JSwing
Librería gráfica 100% Java para aplicaciones de escritorio. Basada en MVC. Multiplataforma sin dependencias nativas.
Contenedores: JFrame (ventana principal), JDialog (ventana emergente), JPanel (organizador), JScrollPane (barras desplazamiento).
Componentes: JButton, JLabel, JTextField, JTextArea, JTable, JCheckBox, JRadioButton, JComboBox, JList, JProgressBar.
Eventos: Manejados mediante listeners. addActionListener(e -> {...}) para clics. Otros: MouseListener, KeyListener, WindowListener.
Nota: Swing es ligero y compatible; JavaFX es preferible en proyectos modernos.

5.4 Paquete java.io
Operaciones de Entrada/Salida (E/S): archivos, consola, flujos.
Clases principales:
- Bytes: InputStream, OutputStream, FileInputStream, FileOutputStream
- Caracteres: Reader, Writer, FileReader, FileWriter
- Buffered: BufferedReader, BufferedWriter (mejoran rendimiento con memoria intermedia)
- Formato: PrintStream, PrintWriter
Práctica: Uso de try-with-resources para cierre automático de flujos.

5.5 Paquete java.util
Utilidades generales y estructuras de datos.
Colecciones: ArrayList (lista dinámica, acceso por índice), LinkedList (lista enlazada), HashSet (sin duplicados), HashMap (clave-valor, acceso rápido).
Otros: Random (nextInt, nextDouble, nextBoolean), Date/Calendar (gestión fechas), Arrays (sort, binarySearch).
Ejemplos: ArrayList añadir/eliminar/mostrar; HashMap put/get/actualizar; Random generar valores aleatorios.

5.6 Paquete java.math
Cálculos de alta precisión.
BigInteger: Enteros de tamaño arbitrario. Métodos: add(), multiply(), pow(). Útil para criptografía y cálculos científicos grandes.
BigDecimal: Decimales de precisión exacta. Crucial para finanzas. Usa constructor con String para evitar errores de punto flotante. Métodos: setScale(2, RoundingMode.HALF_UP) para redondeo controlado.

5.7 Manejo de XML con JAXB
Convierte objetos Java a XML (Marshaling) y XML a objetos Java (Unmarshaling) automáticamente mediante anotaciones.
Anotaciones clave: @XmlRootElement, @XmlElement, @XmlAttribute.
Flujo: Crear JAXBContext -> Crear Marshaller/Unmarshaller -> Ejecutar conversión.
Nota: Descontinuado como módulo estándar en Java 9+, requiere dependencia externa en proyectos modernos.

5.8 Creación de informes con JasperReports
Librería open-source para generar informes dinámicos (PDF, Excel, HTML, CSV) desde BD, objetos o XML.
Flujo: Diseño de plantilla (.jrxml con Jaspersoft Studio) -> Compilación a binario (.jasper) -> Llenado con datos (JRBeanCollectionDataSource o JDBC) -> Exportación al formato final.
Exportadores: exportReportToPdfFile(), JRXlsExporter (con configuración SimpleXlsReportConfiguration), exportReportToHtmlFile().

# ANEXO: BASES DE DATOS ORIENTADAS A OBJETOS (BDOO)

1. Introducción y Fundamentos
Limitaciones de las BDR:
- Representación: Descomponen objetos complejos en múltiples tablas, perdiendo cohesión natural.
- Almacenamiento: Modelo relacional no está diseñado para objetos POO directamente. Requiere ORM (mapeo objeto-relacional) con conversiones costosas.
- Identificación: Clave primaria identifica registro en tabla, pero no es un identificador de objeto persistente a través del sistema.
Concepto BDOO: Sistema gestor que integra SGBD tradicional + POO.
Objetivo: Plasmar el modelo de objetos directamente en la BD, eliminando o reduciendo drásticamente el gap de impedancia y las conversiones ORM.

2. Características Clave
- Mapeo natural: Tabla -> Clase, Fila -> Instancia de objeto, Columna -> Atributo.
- Objetos complejos: Almacenamiento directo de objetos anidados y colecciones sin tablas intermedias.
- OID (Object Identifier): Identificador único, inmutable y global para cada objeto persistente. Equivalente a identidad en POO.
- Encapsulación y métodos: Lógica de negocio ligada a los datos en la BD.
- Relaciones: Soporte nativo para agregaciones (SET, LIST, BAG), atributos multivaluados.

3. Principios POO en BDOO
- Herencia: Tipos/clases derivadas heredan estructura y comportamiento de superclases.
- Polimorfismo: Objetos relacionados responden a misma llamada de método de forma distinta según tipo real.
- Sobrecarga: Múltiples métodos con mismo nombre, distintos parámetros.
- Extensibilidad y tipos definidos por usuario.

4. Lenguajes de Consulta y Acceso
- OQL (Object Query Language): Estándar ODMG. Sintaxis declarativa similar a SQL pero consulta "alcance de clases", navega objetos sin JOINs. Diseñado solo para lectura; modificaciones vía métodos/OML.
- Excepciones: Gestión estándar de errores de persistencia (ej. PersistenceException, SQLException en entornos híbridos/JDBC).
- Ventajas: Manejo eficiente de datos complejos (imágenes, jerarquías), modelado idéntico a la aplicación, sin conversiones ORM.

5. Bases de Datos Objeto-Relacionales (BDO-R)
Modelo híbrido: Extiende relacional con conceptos objeto sin abandonar tablas.
Características: Tipos definidos por usuario, atributos compuestos, LOBs (Large Objects), herencia de tablas (subtabla hereda columnas de supertabla).
Implementación POO limitada: Abstracción, encapsulación (vía funciones/métodos almacenados), polimorfismo restringido a nivel de consultas y tipos.
Comparativa: BDR (tablas puras, ORM obligatorio) vs BDO-R (híbrida, extensiones SQL) vs BDOO (objetos nativos, sin ORM).

6. Tipos de Datos y SGBDOO Modernos
Tipos disponibles: Primitivos del sistema, clases definidas por desarrollador, colecciones (SET, LIST, MAP), referencias persistentes (OID).
Sistemas modernos: ObjectDB, db4o, Versant (BDOO puras). MongoDB (NoSQL documental): Documentos BSON (JSON binario) ≈ objetos anidados, OID nativo (_id), colecciones y métodos integrados. Modelo flexible y cercano a filosofía BDOO para datos semi-estructurados.
