# EJERCICIOS PROGRAMACION A

## ÍNDICE

- [0. Qué es la programación](#0)
  - [0.1 Pequeña historia](#01)
  - [0.2 El algoritmo](#02)
  - [0.3 Pensamiento computacional](#03)
  - [0.4 Proceso de creación](#04)
- [1. Programación estructurada](#1)
  - [1.1 Primer programa en Java](#11)
  - [1.2 Variables](#12)
  - [1.3 Operadores](#13)
  - [1.4 Casting](#14)
  - [1.5 IDE y comentarios](#15)
- [2. Estructuras de control](#2)
  - [2.1 Condicionales](#21)
  - [2.2 Bucles](#22)
  - [2.3 De salto](#23)
  - [2.4 Funciones](#24)
  - [2.5 Recursividad](#25)
  - [2.6 Palabras reservadas](#26)
  - [2.7 Pseudocódigo](#27)
- [3. Depuración del código](#3)
  - [3.1 Qué es un bug](#31)
  - [3.2 Manejo de excepciones](#32)
  - [3.3 La salida de error (System.err)](#33)
  - [3.4 Uso de logs](#34)
  - [3.5 El depurador](#35)
  - [3.6 Test unitarios](#36)
  - [3.7 Toma de tiempos y optimización](#37)
- [4. POO I](#4)
  - [4.1 Qué es una clase](#41)
  - [4.2 Qué es un objeto](#42)
  - [4.3 Métodos y atributos](#43)
  - [4.4 Encapsulación](#44)
  - [4.5 El constructor](#45)
  - [4.6 Los paquetes](#46)
  - [4.7 La memoria de un programa](#47)
  - [4.8 La recursividad en la memoria](#48)
- [5. GUI y librerías](#5)
  - [5.1 Qué es UI y UX](#51)
  - [5.2 Interfaz de comando (CLI)](#52)
  - [5.3 Librería JSwing](#53)
  - [5.4 Paquete java.io](#54)
  - [5.5 Paquete java.util](#55)
  - [5.6 Paquete java.math](#56)
  - [5.7 Manejo de XML con JAXB](#57)
  - [5.8 Creación de informes con JasperReports](#58)
- [Anexo: BDOO](#bdoo)
  - [Fundamentos, OID, OQL, BDO-R, NoSQL](#bdoo-core)

---

<a id="0"></a>
## 0. QUÉ ES LA PROGRAMACIÓN

<a id="01"></a>
### 0.1 Pequeña historia
```java
/**
 * 0.1 Evolución: Ábaco -> Telar Jacquard (1801) -> Máquina Analítica Babbage -> 
 * Ada Lovelace (primer algoritmo) -> Apollo AGC (1960s, ensamblador, circuitos integrados).
 * Margaret Hamilton demostró la crítica del software en misiones espaciales.
 */
public class HistoriaProgramacion {
    public static void main(String[] args) {
        System.out.println("1801: Telar Jacquard (tarjetas perforadas)");
        System.out.println("1843: Ada Lovelace (algoritmo máquina analítica)");
        System.out.println("1969: Apollo 11 AGC (Margaret Hamilton, ensamblador)");
        System.out.println("1995: Java (James Gosling, WORA)");
    }
}
// EJERCICIO 0.1: Investiga y añade una línea imprimiendo el año de creación de Java (1995) y su creador.
```

<a id="02"></a>
### 0.2 El algoritmo
```java
// Características: Finitud, Definido, Entrada, Salida, Eficiencia
public class AlgoritmoEstructurado {
    public static void main(String[] args) {
        // Entrada
        double precioBase = 100.0;
        double iva = 0.21;
        // Proceso definido y finito
        double total = precioBase * (1 + iva);
        // Salida
        System.out.println("Total IVA incluido: " + total);
    }
}
// EJERCICIO 0.2: Crea un algoritmo que reciba peso y altura, calcule IMC = peso/(altura^2). Define entrada, proceso y salida.
```

<a id="03"></a>
### 0.3 Pensamiento computacional
```java
// Pilares: Descomposición, Patrones, Abstracción, Algoritmos
public class PensamientoComputacional {
    public static void main(String[] args) {
        int[] datos = {10, 20, 5, 9, 15, 12, 1, 8};
        int objetivo = 9;
        boolean encontrado = false;
        // Descomposición + Abstracción + Algoritmo (Búsqueda lineal)
        for(int num : datos) {
            if(num == objetivo) { encontrado = true; break; }
        }
        System.out.println("Encontrado: " + encontrado);
    }
}
// EJERCICIO 0.3: Aplica descomposición a "ordenar lista". Escribe pasos lógicos antes de codificar.
```

<a id="04"></a>
### 0.4 Proceso de creación
```java
// Flujo: Análisis -> Diseño -> Implementación -> Pruebas -> Corrección -> Entrega
public class CicloVida {
    public static void main(String[] args) {
        String[] fases = {"Análisis problema", "Diseño algoritmo", "Implementación código", 
                          "Pruebas unitarias", "Corrección errores", "Despliegue"};
        for(String f : fases) System.out.println("[FASE] " + f);
    }
}
// EJERCICIO 0.4: Documenta en comentarios el ciclo para una app de "gestión de inventario".
```

<a id="1"></a>
## 1. PROGRAMACIÓN ESTRUCTURADA

<a id="11"></a>
### 1.1 Primer programa en Java
```java
public class PrimerPrograma {
    public static void main(String[] args) {
        System.out.println("Tabla de Multiplicar del 4");
        System.out.println("--------------------------");
        for(int i=1; i<=10; i++) System.out.println("4x" + i + "= " + (4*i));
    }
}
// EJERCICIO 1.1: Modifica para generar tabla del 7 usando concatenación String.
```

<a id="12"></a>
### 1.2 Variables
```java
public class Variables {
    public static void main(String[] args) {
        boolean activo = true; byte edad = 34; short puerto = 8080;
        int id = 100500; long trans = 9999999999L;
        float peso = 75.5f; double precio = 19.99;
        char rango = 'A'; String nombre = "Agente";
        // Características: Nombre, Tipo, Valor, Alcance, Duración
        System.out.println(nombre + " (" + edad + " años) | ID: " + id);
    }
}
// EJERCICIO 1.2: Declara temperatura, humedad, presión. Imprime reporte climático.
```

<a id="13"></a>
### 1.3 Operadores
```java
public class Operadores {
    public static void main(String[] args) {
        int a = 10, b = 3;
        // Aritméticos: +, -, *, /, % (resto)
        System.out.println("Módulo: " + (a % b)); // 1
        // Unarios: ++, --, ! (pre/post afecta orden evaluación)
        System.out.println("Pre-INC: " + (++a) + " | Post-DEC: " + (b--));
        // Relacionales: ==, !=, >, <, >=, <=
        System.out.println("Mayor: " + (a > b));
        // Lógicos: && (AND), || (OR), ! (NOT)
        System.out.println("AND: " + ((a>5) && (b<3)));
        // Ternario: (cond) ? valTrue : valFalse
        String nivel = (a >= 10) ? "Alto" : "Bajo";
    }
}
// EJERCICIO 1.3: Determina si un año es bisiesto usando operadores lógicos/aritméticos.
```

<a id="14"></a>
### 1.4 Casting
```java
public class Casting {
    public static void main(String[] args) {
        // Implícito (Widening): seguro, menor -> mayor
        double d = 10; 
        // Explícito (Narrowing): riesgo truncamiento, mayor -> menor
        double pi = 3.14159;
        int i = (int) pi; // Trunca a 3
        System.out.println("Truncado: " + i);
    }
}
// EJERCICIO 1.4: Convierte float 9.99f a int, multiplica x2, convierte a double. Imprime intermedios.
```

<a id="15"></a>
### 1.5 IDE y comentarios
```java
/**
 * 1.5 IDE (Eclipse/IntelliJ): Editor, Compilador, Debugger, Build, VCS, Doc.
 * Comentarios: // línea, /* bloque */, /** Javadoc */
 * @author Zyanetralys
 */
public class ComentariosIDE {
    public static void main(String[] args) {
        // Validación de entrada
        /* Desactivado temporalmente: validarPermisos(); */
        System.out.println("IDE operativo.");
    }
}
// EJERCICIO 1.5: Instala IDE, crea proyecto, añade Javadoc a función, genera HTML.
```

<a id="2"></a>
## 2. ESTRUCTURAS DE CONTROL

<a id="21"></a>
### 2.1 Condicionales
```java
public class Condicionales {
    public static void main(String[] args) {
        int score = 85;
        if(score >= 90) System.out.println("Rango A");
        else if(score >= 75) System.out.println("Rango B");
        else System.out.println("Rango C");
        
        int dia = 3;
        switch(dia) {
            case 1: System.out.println("Lunes"); break;
            case 3: System.out.println("Miércoles"); break;
            default: System.out.println("Otro"); break;
        }
    }
}
// EJERCICIO 2.1: Semáforo con switch: 1=Alto, 2=Precaución, 3=Avanzar.
```

<a id="22"></a>
### 2.2 Bucles
```java
public class Bucles {
    public static void main(String[] args) {
        // For: iteración conocida
        for(int i=0; i<3; i++) System.out.println("For: " + i);
        // While: condición previa
        int j = 0;
        while(j < 3) { System.out.println("While: " + j); j++; }
        // Do-While: ejecución mínima 1
        int k = 5;
        do { System.out.println("DoWhile: " + k); } while(k < 3);
    }
}
// EJERCICIO 2.2: Suma 1 al 100 usando cada tipo de bucle.
```

<a id="23"></a>
### 2.3 De salto
```java
public class Salto {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if(i == 5) break;      // Termina bucle
            if(i % 2 == 0) continue; // Omite iteración
            System.out.println("Impar < 5: " + i);
        }
    }
    static int retorna() { return 42; } // return sale inmediatamente
}
// EJERCICIO 2.3: Usa break para salir de bucle infinito buscando primo aleatorio > 100.
```

<a id="24"></a>
### 2.4 Funciones
```java
public class Funciones {
    public static void main(String[] args) {
        saludar(); // void, sin params
        System.out.println("Suma: " + suma(5, 3));
    }
    static void saludar() { System.out.println("Hola, agente."); }
    static int suma(int a, int b) { return a + b; }
}
// EJERCICIO 2.4: Crea función que reciba array y devuelva valor máximo.
```

<a id="25"></a>
### 2.5 Recursividad
```java
public class Recursividad {
    public static void main(String[] args) {
        System.out.println("Fact 5: " + factorial(5)); // 120
        System.out.println("Fib 6: " + fib(6));        // 8
    }
    // Condición base evita bucle infinito
    static int factorial(int n) { return (n==0) ? 1 : n * factorial(n-1); }
    static int fib(int n) { return (n<=1) ? n : fib(n-1) + fib(n-2); }
}
// EJERCICIO 2.5: Implementa potencia(base^exp) recursiva. Caso base: exp=0 -> 1.
```

<a id="26"></a>
### 2.6 Palabras reservadas
```java
// Sintaxis Java: class, public, static, void, int, if, else, for, while, 
// break, continue, return, try, catch, new, this, extends, implements, import, package
public class PalabrasReservadas {
    // No pueden ser identificadores. El compilador las reserva.
}
// EJERCICIO 2.6: Intenta compilar `int public = 10;`. Documenta error del compilador.
```

<a id="27"></a>
### 2.7 Pseudocódigo
```text
ALGORITMO Potencia
  ENTRADA: base, exp
  SALIDA: res
  SI exp = 0 ENTONCES res <- 1
  SINO
    res <- 1
    PARA i <- 1 HASTA exp HACER res <- res * base
    FIN PARA
  FIN SI
  DEVOLVER res
FIN ALGORITMO
```
```java
// Traducción directa
public class Pseudocodigo {
    public static int potencia(int base, int exp) {
        if(exp == 0) return 1;
        int res = 1;
        for(int i=1; i<=exp; i++) res *= base;
        return res;
    }
}
// EJERCICIO 2.7: Escribe pseudocódigo para invertir String. Tradúcelo a Java.
```

<a id="3"></a>
## 3. DEPURACIÓN DEL CÓDIGO

<a id="31"></a>
### 3.1 Qué es un bug
```java
public class Bugs {
    public static void main(String[] args) {
        // Compilación: String t = "Hola; (falta comilla)
        // Runtime: int x = 10/0; (ArithmeticException)
        System.out.println("Depurar = investigar pista por pista.");
    }
}
// EJERCICIO 3.1: Introduce NullPointerException. Usa debugger para inspeccionar stack trace.
```

<a id="32"></a>
### 3.2 Manejo de excepciones
```java
public class Excepciones {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]); // IndexOutOfBounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango.");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally (siempre ejecuta)");
        }
    }
}
// EJERCICIO 3.2: Maneja FileNotFoundException al leer archivo inexistente.
```

<a id="33"></a>
### 3.3 System.err
```java
public class SalidaError {
    public static void main(String[] args) {
        int divisor = 0;
        if(divisor == 0) {
            System.err.println("[CRÍTICO] División por cero interceptada."); // Flujo separado
        }
    }
}
// EJERCICIO 3.3: Redirige System.err a "errores.log" con System.setErr().
```

<a id="34"></a>
### 3.4 Uso de logs
```java
import java.util.logging.*;
public class Logs {
    private static final Logger LOG = Logger.getLogger(Logs.class.getName());
    public static void main(String[] args) {
        LOG.info("Inicio misión");
        try { throw new RuntimeException("Fallo conexión"); }
        catch(Exception e) { LOG.log(Level.SEVERE, "Error crítico", e); }
    }
}
// EJERCICIO 3.4: Configura FileHandler para guardar logs en "app.log" formato XML.
```

<a id="35"></a>
### 3.5 El depurador
```java
// Breakpoints, Step Over/Into/Out, Watch, Modify en tiempo real
public class Depurador {
    public static void main(String[] args) {
        int a = 10, b = 20; // Breakpoint aquí
        int res = calcular(a, b); // Step Into
        System.out.println(res);
    }
    static int calcular(int x, int y) { return x + y; }
}
// EJERCICIO 3.5: Modifica `b` a 5 en runtime antes de llamar a `calcular`.
```

<a id="36"></a>
### 3.6 Test unitarios
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test void testSuma() { assertEquals(5, new Calc().sumar(2, 3)); }
    @Test void testDivCero() { assertThrows(ArithmeticException.class, () -> new Calc().div(10, 0)); }
}
class Calc { int sumar(int a, int b){ return a+b; } int div(int a, int b){ return a/b; } }
// EJERCICIO 3.6: Escribe test para `esPar(int n)` verificando true/false.
```

<a id="37"></a>
### 3.7 Toma de tiempos
```java
public class Benchmark {
    public static void main(String[] args) {
        long t1 = System.nanoTime();
        long sum = 0;
        for(long i=0; i<1_000_000; i++) sum += i;
        long t2 = System.nanoTime();
        System.out.println("Tiempo: " + (t2-t1) + " ns");
    }
}
// EJERCICIO 3.7: Compara `String +` vs `StringBuilder` para 10k concatenaciones.
```

<a id="4"></a>
## 4. POO I

<a id="41"></a>
### 4.1 Clase
```java
// Plantilla: atributos + métodos + constructor
class Agente { String codigo; int nivel; }
public class Clases { public static void main(String[] args) { /* Clase = plano */ } }
// EJERCICIO 4.1: Define clase `Vehiculo` con marca, modelo, anio.
```

<a id="42"></a>
### 4.2 Objeto
```java
public class Objetos {
    public static void main(String[] args) {
        Agente op = new Agente(); // Instanciación Heap
        op.codigo = "X-99"; op.nivel = 5; // Estado único
        System.out.println(op.codigo);
    }
}
// EJERCICIO 4.2: Crea 3 objetos `Vehiculo` con datos distintos. Imprime atributos.
```

<a id="43"></a>
### 4.3 Métodos y atributos
```java
class Cuenta {
    String titular; double saldo;
    void depositar(double c) { if(c>0) saldo += c; }
    void retirar(double c) { if(c<=saldo) saldo -= c; }
}
public class MetAtributos {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(); c.titular="Ana"; c.depositar(1000);
    }
}
// EJERCICIO 4.3: Añade `mostrarEstado()` que imprima titular y saldo formateado.
```

<a id="44"></a>
### 4.4 Encapsulación
```java
class CajaFuerte {
    private int clave; // Acceso restringido
    public void setClave(int k) { if(k>999) this.clave = k; } // Validación
    public int getClave() { return clave; }
}
public class Encapsulacion {
    public static void main(String[] args) {
        CajaFuerte cf = new CajaFuerte();
        cf.setClave(1234); // cf.clave = 0; // Error compilación
    }
}
// EJERCICIO 4.4: Encapsula `edad` en `Persona`. Setter rechaza <0 o >120.
```

<a id="45"></a>
### 4.5 Constructor
```java
class Operativo {
    String id; int rango;
    public Operativo(String id, int rango) { this.id=id; this.rango=rango; }
    public Operativo() { this.id="GEN"; this.rango=1; } // Sobrecarga
}
public class Constructores {
    public static void main(String[] args) {
        Operativo op = new Operativo("ALFA", 7);
    }
}
// EJERCICIO 4.5: Crea constructor por defecto. Usa sobrecarga.
```

<a id="46"></a>
### 4.6 Paquetes
```java
// pkg/seguridad/Agente.java -> package pkg.seguridad; public class Agente { public String id; }
// Main.java -> import pkg.seguridad.Agente;
public class Paquetes {
    public static void main(String[] args) {
        Agente a = new Agente(); a.id="X-9";
    }
}
// EJERCICIO 4.6: Crea `com.mision.armas` y `com.mision.intel`. Importa clases cruzadas.
```

<a id="47"></a>
### 4.7 Memoria
```java
public class Memoria {
    public static void main(String[] args) {
        // Stack: refs, locales, llamadas. Heap: objetos new
        Agente ref = new Agente(); // ref en Stack, objeto en Heap
    }
}
// EJERCICIO 4.7: Dibuja en comentarios estado Stack/Heap tras crear 2 objetos y asignar uno a otro.
```

<a id="48"></a>
### 4.8 Recursividad en memoria
```java
public class RecMemoria {
    public static void main(String[] args) {
        // Cada llamada apila frame. Sin base -> StackOverflowError
        profunda(10);
    }
    static void profunda(int n) {
        if(n==0) return;
        System.out.println("Frame: " + n);
        profunda(n-1);
    }
}
// EJERCICIO 4.8: Quita condición base, ejecuta, documenta StackOverflowError.
```

<a id="5"></a>
## 5. GUI Y LIBRERÍAS

<a id="51"></a>
### 5.1 UI y UX
```java
// UI = Interfaz visual (botones, layout, colores)
// UX = Experiencia total (flujo, accesibilidad, satisfacción, iteración)
public class UI_UX {
    // En código: UI se implementa con Swing/JavaFX. UX se valida con tests usabilidad.
}
// EJERCICIO 5.1: Analiza app bancaria. Lista 3 UI y 3 principios UX.
```

<a id="52"></a>
### 5.2 Interfaz de comando (CLI)
```java
import java.util.Scanner;
public class CLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Calcular  2.Salir");
        int op = sc.nextInt();
        if(op==1) System.out.println("Modo cálculo activo");
        sc.close();
    }
}
// EJERCICIO 5.2: Menú CLI completo para "Calculadora Áreas" (Cuadrado, Rectángulo, Círculo, Triángulo).
```

<a id="53"></a>
### 5.3 Librería JSwing
```java
import javax.swing.*;
public class SwingApp {
    public static void main(String[] args) {
        JFrame f = new JFrame("Panel");
        f.setSize(300,200); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("Ejecutar");
        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "Misión iniciada"));
        f.add(b); f.setVisible(true);
    }
}
// EJERCICIO 5.3: Añade JTextField y JLabel. Al presionar botón, muestra texto en JLabel.
```

<a id="54"></a>
### 5.4 Paquete java.io
```java
import java.io.*;
public class IOFiles {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter w = new BufferedWriter(new FileWriter("log.txt"))) { w.write("Datos operativos."); }
        try(BufferedReader r = new BufferedReader(new FileReader("log.txt"))) { System.out.println(r.readLine()); }
    }
}
// EJERCICIO 5.4: Copia "origen.txt" a "destino.txt" línea por línea con buffers.
```

<a id="55"></a>
### 5.5 Paquete java.util
```java
import java.util.*;
public class Utilidades {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(); l.add("A");
        Map<String,Integer> m = new HashMap<>(); m.put("Nivel",5);
        Random r = new Random(); System.out.println(r.nextInt(100));
    }
}
// EJERCICIO 5.5: Usa `Collections.sort()` y `Arrays.binarySearch()` en array desordenado.
```

<a id="56"></a>
### 5.6 Paquete java.math
```java
import java.math.*;
public class Precisión {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("999999999999999999");
        System.out.println(big.pow(2));
        BigDecimal precio = new BigDecimal("19.99");
        System.out.println(precio.multiply(new BigDecimal("3")).setScale(2, RoundingMode.HALF_UP));
    }
}
// EJERCICIO 5.6: Calcula 1/3 con BigDecimal a 10 decimales. Evita división por cero.
```

<a id="57"></a>
### 5.7 Manejo XML con JAXB
```java
import javax.xml.bind.*; import javax.xml.bind.annotation.*;
@XmlRootElement class Dato { @XmlElement String id; Dato(){} Dato(String i){id=i;} }
public class XMLBind {
    public static void main(String[] args) throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(Dato.class);
        Marshaller m = ctx.createMarshaller(); m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(new Dato("OP-44"), System.out);
    }
}
// EJERCICIO 5.7: Crea clase `Agente` con JAXB. Genera XML, guárdalo, lee y deserializa.
```

<a id="58"></a>
### 5.8 Creación informes JasperReports
```java
import net.sf.jasperreports.engine.*; import java.util.*;
public class Informes {
    public static void main(String[] args) throws Exception {
        String jasper = JasperCompileManager.compileReportToFile("plantilla.jrxml");
        JasperPrint print = JasperFillManager.fillReport(jasper, new HashMap<>(), new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(print, "informe.pdf");
    }
}
// EJERCICIO 5.8: Pasa `List<Usuario>` como `JRBeanCollectionDataSource`. Genera PDF con tabla.
```

<a id="bdoo"></a>
## ANEXO: BDOO

<a id="bdoo-core"></a>
### Fundamentos, OID, OQL, BDO-R, NoSQL
```java
/**
 * 1. BDOO vs Relacional: Elimina "gap de impedancia" objeto-relacional. Persistencia nativa.
 * 2. OID: Identificador único, inmutable, global. Equivalente a identidad POO persistente.
 * 3. POO en BDOO: Herencia, Polimorfismo, Encapsulación, Sobrecarga, Colecciones (sets/bags/lists), Atributos multivaluados.
 * 4. OQL: Lenguaje declarativo (estándar ODMG). Sintaxis SQL-like adaptada a objetos. SELECT a FROM Clase a WHERE...
 * 5. Excepciones: PersistenceException/SQLException para fallos de acceso.
 * 6. BDO-R: Híbrido. Mantiene tablas, añade tipos definidos usuario, LOBs, Herencia de tablas. Abstracción/Encapsulación limitada.
 * 7. MongoDB/NoSQL: Documentos BSON (JSON binario). Estructuras anidadas nativas. Cercano a BDOO pero sin esquema fijo.
 */
class EntidadBDOO {
    private final String oid = java.util.UUID.randomUUID().toString(); // OID único
    private String estado;
    public String getOid() { return oid; }
    // Métodos persistentes: lógica ligada a datos directamente.
}
public class BDOO_Demo {
    public static void main(String[] args) {
        EntidadBDOO e = new EntidadBDOO();
        System.out.println("OID Generado: " + e.getOid());
        // Simulación OQL lógica: buscar en colección por atributo, sin JOINs complejos.
        // Ejemplo documento MongoDB: { "_id": ObjectId(...), "agente": "Zyanetralys", "misiones": ["A","B"], "perfil": {"nivel":5} }
    }
}
// EJERCICIO BD.1: Diseña modelo BDOO para "Sistema de Misiones". Clases: Mision, Agente, Equipo. Usa composición/herencia.
// EJERCICIO BD.2: Escribe consulta OQL simulada para misiones con nivel > 5 y estado "Completada".
// EJERCICIO BD.3: Comenta ventajas/desventajas de BDOO puro vs MongoDB vs PostgreSQL (BDO-R).
```
