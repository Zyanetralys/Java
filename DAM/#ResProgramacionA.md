# Programación A - DAM | Resumen de Estudio

## FASE 0: FUNDAMENTOS (Tema 0)

| Concepto | Definición | Clave para Examen |
|----------|------------|-------------------|
| Programación | Traducción de problemas reales a instrucciones secuenciales ejecutables por máquina | Base del desarrollo software |
| Algoritmo | Secuencia finita, definida, con entrada/salida, eficiente y no ambigua | Preciso, determinista, terminable |
| Pensamiento Computacional | Descomposición → Patrones → Abstracción → Diseño algorítmico | Metodología sistemática |
| Ciclo de Desarrollo | Análisis → Diseño → Implementación → Pruebas → Corrección → Mantenimiento | Iterativo, nunca lineal |

Línea Temporal: Ábaco → Telar Jacquard (1801) → Ada Lovelace (1843) → Turing/von Neumann → Margaret Hamilton/Apollo (1969) → Java (1995)

---

## FASE 1: ESTRUCTURA (Tema 1)

| Tipo Primitivo | Tamaño | Rango/Valores | Uso |
|----------------|--------|---------------|-----|
| boolean | 1 bit | true / false | Control de flujo |
| byte | 8 bits | -128 a 127 | Optimización memoria |
| short | 16 bits | -32.768 a 32.767 | Enteros pequeños |
| int | 32 bits | -2^31 a 2^31-1 | Entero por defecto |
| long | 64 bits | -2^63 a 2^63-1 | Grandes cantidades (sufijo L) |
| float | 32 bits | ±3.4E38 (6-7 decimales) | Decimales precisión media (sufijo F) |
| double | 64 bits | ±1.8E308 (15 decimales) | Decimal por defecto |
| char | 16 bits | \u0000 a \uffff | Caracteres Unicode |

| Categoría Operadores | Símbolos | Ejemplo | Resultado |
|----------------------|----------|---------|-----------|
| Aritméticos | +, -, *, /, % | 10 % 3 | 1 |
| Unarios | ++, --, ! | ++x, !flag | Incremento/Negación |
| Asignación | =, +=, -=, *=, /= | a += 5 | a = a + 5 |
| Relacionales | ==, !=, >, <, >=, <= | x != y | true/false |
| Lógicos | &&, \|\|, ! | (a>0) && (b<10) | true/false |

Casting:
- Implícito (Widening): Automático, seguro (byte → short → int → long → float → double)
- Explícito (Narrowing): Manual con (tipo), riesgo de truncamiento o pérdida de datos

IDE & Comentarios:
- Entornos: Eclipse, IntelliJ IDEA, NetBeans
- Sintaxis: // línea | /* bloque */ | /** Javadoc */ (documentación de API)
- Regla: Documentar firmas públicas y lógica compleja

---

## FASE 2: LÓGICA (Tema 2)

| Estructura | Sintaxis Base | Uso |
|------------|---------------|-----|
| if / if-else | if (cond) { } else { } | Bifurcación binaria |
| if-else-if | if (c1) {} else if (c2) {} else {} | Selección múltiple secuencial |
| switch | switch (var) { case v: break; default: } | Selección por valor exacto (int, char, String, enum) |

| Bucle | Sintaxis | Condición | Uso Ideal |
|-------|----------|-----------|-----------|
| for | for(init; cond; step) { } | Pre-condición | Iteraciones conocidas |
| while | while(cond) { } | Pre-condición | Iteraciones desconocidas |
| do-while | do { } while(cond); | Post-condición | Garantizar ≥1 ejecución |
| for-each | for(Tipo e : col) { } | N/A | Recorrido completo arrays/colecciones |

| Sentencia | Alcance | Efecto |
|-----------|---------|--------|
| break | Bucle / switch | Sale del bloque más interno |
| continue | Bucle | Omite iteración actual, pasa a siguiente |
| return | Método | Devuelve valor y finaliza método |

Métodos:
- Firma: [modificador] tipoRetorno nombre(tipo param...) { cuerpo }
- Sobrecarga: Mismo nombre, distinta lista de parámetros
- Paso de parámetros: Primitivos por valor | Objetos por referencia (se copia dirección)

Recursividad:
- Método que se invoca a sí mismo
- Requiere: Condición base + Caso recursivo
- Riesgo: StackOverflowError sin progresión o base
- Recursión vs Iteración: Recursión (legible, overhead memoria) | Iteración (rápido, control explícito)

Pseudocódigo & Léxico:
- Estructura: ENTRADA → PROCESO → SALIDA
- Palabras reservadas: if, class, void, private, static, etc. No usables como identificadores

---

## FASE 3: DEPURACIÓN (Tema 3)

| Tipo de Error | Detección | Causa | Solución |
|---------------|-----------|-------|----------|
| Compilación | Tiempo de compilación | Sintaxis, tipos, variables no declaradas | Corrección en IDE antes de ejecutar |
| Ejecución | Tiempo de ejecución | Div/0, NullPointerException, índice fuera rango | Validación, try-catch, debugger |
| Lógico | Post-ejecución | Algoritmo incorrecto, condiciones mal planteadas | Pruebas, trazas, revisión de lógica |

Manejo de Excepciones (sintaxis indented para evitar ruptura de bloque):
    try {
        // código con riesgo
    } catch (TipoExcepcion e) {
        // manejo controlado (log, mensaje, recuperación)
    } finally {
        // ejecución obligatoria (liberar recursos)
    }
Reglas: Nunca bloques catch vacíos. Capturar excepciones específicas. finally se ejecuta siempre. Usar throw para propagar.

Monitoreo y Logs:
- System.out: Salida estándar (flujo normal)
- System.err: Canal dedicado a fallos (separar alertas críticas)
- java.util.logging: Niveles SEVERE → WARNING → INFO → FINE. Permite filtrado y persistencia. Sin logs, operación a ciegas.

Depuración (Debugger):
- Breakpoint: Pausa en línea específica
- Step Over: Ejecuta línea actual, salta al siguiente
- Step Into: Entra al método llamado
- Step Out: Termina método actual, vuelve al llamante
- Watch/Inspección: Visualizar y modificar variables en tiempo real

Pruebas Unitarias (JUnit):
- Anotaciones: @Test, @BeforeEach, @AfterEach
- Asertos: assertEquals, assertTrue, assertFalse, assertNull
- Buenas prácticas: 1 test por funcionalidad, cubrir casos límite, tests independientes

Optimización:
- System.currentTimeMillis(): Milisegundos (reloj sistema, baja precisión)
- System.nanoTime(): Nanosegundos (intervalos, alta precisión)
- Principio: Medir primero, optimizar después. La eficiencia es supervivencia.

---

## FASE 4: ARQUITECTURA DE OBJETOS I (Tema 4)

| Concepto | Definición | Implementación |
|----------|------------|----------------|
| Clase vs Objeto | Plantilla vs Instancia | class define estado+comportamiento. new crea en Heap |
| Atributos & Métodos | Propiedades vs Acciones | Encapsulación con private + getters/setters |
| Constructores | Inicialización al instanciar | Mismo nombre clase, sin retorno, permite sobrecarga |
| Paquetes | Organización jerárquica | package declara espacio de nombres. import resuelve referencias |
| Memoria | Heap vs Stack | Heap: objetos. Stack: referencias, variables locales, frames |

Encapsulación:
- Ocultar estado interno, exponer solo comportamiento necesario
- Modificadores: private (clase), default (paquete), protected (paquete+herencia), public (global)

Memoria y Recursión:
- Cada llamada recursiva añade stack frame
- Sin condición base → colapso por desbordamiento
- Comparativa: Iteración usa memoria constante O(1) | Recursión O(n) en stack

---

## FASE 5: INTERFAZ Y LOGÍSTICA AVANZADA (Tema 5)

| Componente | Especificación | Uso |
|------------|----------------|-----|
| UI/UX | Interfaz visual vs Experiencia total | Accesibilidad, coherencia, satisfacción usuario |
| CLI | Consola textual | Scanner + do-while + switch para menús |
| JSwing | JFrame, JPanel, JButton, JTextField | Listeners (ActionListener). GUI nativa Java |
| java.io | BufferedReader, FileWriter, flujos | Lectura/escritura de archivos y streams |
| java.util | ArrayList, HashMap, Date, Random | Colecciones dinámicas, fechas, aleatorios |
| java.math | BigInteger, BigDecimal | Cálculos financieros/científicos sin pérdida de precisión |
| JAXB | @XmlElement, @XmlRootElement | Marshaling/Unmarshaling XML a objetos Java |
| JasperReports | Plantillas JRXML, JRBeanCollectionDataSource | Generación dinámica informes (PDF, Excel, HTML) |

Reglas de Integración:
- CLI para prototipado rápido y validación lógica
- JSwing para escritorio, requiere hilo EDT para actualizaciones seguras
- Separar lógica de negocio de capa de presentación (MVC básico)
- Validar siempre entrada de usuario antes de procesar o persistir
Reglas de Integración (continuación):
- Validación de entrada: Sanitizar datos antes de procesar (prevención inyección, errores tipo)
- Gestión de recursos: Usar try-with-resources para AutoCloseable (files, streams, connections)
- Concurrencia básica: Evitar condiciones de carrera con sincronización cuando sea necesario
- Patrón MVC: Modelo (datos/lógica), Vista (UI), Controlador (orquestación). Separación de responsabilidades

---

## APÉNDICE: REFERENCIA RÁPIDA JAVA

### Modificadores de Acceso
| Modificador | Clase | Paquete | Subclase | Global |
|-------------|-------|---------|----------|--------|
| private | ✓ | ✗ | ✗ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| protected | ✓ | ✓ | ✓ | ✗ |
| public | ✓ | ✓ | ✓ | ✓ |

### Palabras Reservadas Esenciales
- Control: if, else, switch, case, default, for, while, do, break, continue, return
- Clases: class, interface, extends, implements, abstract, final, static, new
- Visibilidad: public, private, protected, default
- Excepciones: try, catch, finally, throw, throws
- Tipos: void, boolean, byte, short, int, long, float, double, char
- Otros: package, import, instanceof, super, this, synchronized, volatile, transient, strictfp, assert, enum

### Errores Comunes y Soluciones
| Error | Causa Típica | Solución |
|-------|--------------|----------|
| NullPointerException | Usar objeto no inicializado | Verificar null antes de acceder |
| ArrayIndexOutOfBoundsException | Índice fuera de rango array | Validar 0 <= i < array.length |
| ClassCastException | Casting incorrecto entre tipos | Usar instanceof antes de cast |
| NumberFormatException | Parsear String no numérico | try-catch o validar con regex |
| ConcurrentModificationException | Modificar colección mientras se itera | Usar Iterator.remove() o colecciones concurrentes |

### Buenas Prácticas de Código
- Nombres significativos: variables en camelCase, clases en PascalCase, constantes en UPPER_SNAKE_CASE
- Métodos cortos: Una responsabilidad por método, máximo 20-30 líneas
- Comentarios útiles: Explicar el porqué, no el qué (el código ya dice el qué)
- DRY (Don't Repeat Yourself): Extraer lógica repetida a métodos reutilizables
- Validación temprana: Fail fast, validar parámetros al inicio del método
- Inmutabilidad: Usar final cuando el estado no deba cambiar

### Plantilla de Clase Java Estándar
```java
package com.dominio.paquete;

import java.util.Objects;

/**
 * Descripción breve de la clase.
 * @author Nombre
 * @version 1.0
 */
public class MiClase {
    
    // Atributos privados
    private String atributo1;
    private int atributo2;
    
    // Constructor
    public MiClase(String atributo1, int atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    
    // Getters y Setters
    public String getAtributo1() { return atributo1; }
    public void setAtributo1(String atributo1) { this.atributo1 = atributo1; }
    
    // Métodos de negocio
    public boolean validar() {
        return atributo1 != null && !atributo1.isEmpty();
    }
    
    // Overrides esenciales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MiClase)) return false;
        MiClase that = (MiClase) o;
        return atributo2 == that.atributo2 && 
               Objects.equals(atributo1, that.atributo1);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(atributo1, atributo2);
    }
    
    @Override
    public String toString() {
        return "MiClase{atributo1='" + atributo1 + "', atributo2=" + atributo2 + "}";
    }
}

```

### Checklist Pre-Entrega
- [ ] Código compila sin warnings críticos
- [ ] Todos los casos de prueba pasan (JUnit)
- [ ] Manejo adecuado de excepciones (sin bloques vacíos)
- [ ] Recursos cerrados correctamente (try-with-resources)
- [ ] Nombres de variables/métodos descriptivos
- [ ] Comentarios en lógica compleja y firmas públicas
- [ ] Sin código comentado o bloques unreachable
- [ ] Formato consistente (indentación, espacios, llaves)

---

## GLOSARIO TÉCNICO RÁPIDO

| Término | Significado |
|---------|-------------|
| API | Interfaz de Programación de Aplicaciones. Contrato entre componentes software |
| Bytecode | Instrucciones intermedias generadas por javac, ejecutadas por JVM |
| JVM | Java Virtual Machine. Entorno de ejecución independiente del sistema operativo |
| JDK | Java Development Kit. Herramientas de desarrollo (javac, jdb) + JRE |
| JRE | Java Runtime Environment. Bibliotecas estándar + JVM para ejecutar aplicaciones |
| IDE | Entorno de Desarrollo Integrado. Editor + compilador + depurador unificados |
| POO | Programación Orientada a Objetos. Encapsulación, herencia, polimorfismo, abstracción |
| DRY | Don't Repeat Yourself. Evitar duplicación de lógica o código |
| KISS | Keep It Simple, Stupid. Priorizar soluciones claras y directas |
| MVC | Model-View-Controller. Patrón para separar datos, interfaz y control |
| Stack Overflow | Desbordamiento de pila de llamadas (recursión sin base o anidación excesiva) |
| Heap | Memoria dinámica para objetos. Gestionada por Garbage Collector |
| GC | Garbage Collector. Liberación automática de memoria no referenciada |
| Try-with-resources | Sintaxis Java 7+ para cierre automático de recursos AutoCloseable |
| Polimorfismo | Mismo método, comportamiento distinto según tipo real del objeto en ejecución |
| Sobrescritura | Redefinición de método heredado en subclase (misma firma exacta) |

---

## ERRORES FRECUENTES

| Situación | Error Típico | Solución Rápida |
|-----------|--------------|-----------------|
| `==` con objetos | Compara referencias de memoria, no contenido | Usar `.equals()` para Strings y objetos |
| Bucle infinito | Condición de salida nunca se cumple | Verificar actualización de variable de control |
| `Scanner.nextLine()` tras `nextInt()` | Captura salto de línea residual del buffer | Insertar `scanner.nextLine()` vacío tras leer primitivos |
| Arrays estáticos | Tamaño fijo, no permiten redimensionado dinámico | Usar `ArrayList` o `LinkedList` para colecciones flexibles |
| Concatenación en bucle | `String` es inmutable, genera objetos temporales | Usar `StringBuilder` o `StringBuffer` para rendimiento |
| Herencia múltiple de clases | Java no lo permite para evitar ambigüedad | Implementar múltiples interfaces con `implements` |
| Métodos estáticos | No acceden a `this` ni a atributos de instancia | Diseñarlos para lógica pura, utilidades o fábricas |
| `NullPointerException` | Invocar método sobre referencia null | Inicializar objetos o validar con `if (obj != null)` |

---

## MAPA DE PROGRESIÓN TEMÁTICA (Resumen Visual)

- TEMA 0: Base → Algoritmo → Pensamiento Computacional → Ciclo de Vida
- TEMA 1: Tipos Primitivos → Operadores → Casting → IDE y Documentación
- TEMA 2: Condicionales → Bucles → Estructuras de Salto → Métodos → Recursividad
- TEMA 3: Clasificación de Errores → Try-Catch-Finally → Logs → Debugger → JUnit → Métricas
- TEMA 4: Clase/Objeto → Encapsulación → Constructores → Paquetes → Gestión de Memoria (Heap/Stack)
- TEMA 5: CLI/JSwing → Colecciones (List/Map) → E/S Archivos → JAXB/XML → JasperReports

FIN DEL DOCUMENTO
