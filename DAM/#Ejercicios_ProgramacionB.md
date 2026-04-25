# EJERCICIOS PROGRAMACION A
  
  # Índice

- [6. Programación Orientada a Objetos II](#6-programación-orientada-a-objetos-ii)
  - [6.1. Métodos y variables estáticas](#61-métodos-y-variables-estáticas)
  - [6.2. Herencia](#62-herencia)
  - [6.3. Interfaces](#63-interfaces)
  - [6.4. Métodos y variables abstractas](#64-métodos-y-variables-abstractas)
  - [6.5. Sobreescritura de métodos](#65-sobreescritura-de-métodos)
  - [6.6. Polimorfismo](#66-polimorfismo)
  - [6.7. Casting entre tipos de referencia](#67-casting-entre-tipos-de-referencia)
- [7. Estructuras de Datos](#7-estructuras-de-datos)
  - [7.1. Arrays](#71-arrays)
  - [7.2. Genericidad](#72-genericidad)
  - [7.3. Listas enlazadas](#73-listas-enlazadas)
  - [7.4. Pilas](#74-pilas)
  - [7.5. Colas](#75-colas)
  - [7.6. Grafos](#76-grafos)
  - [7.7. Otras estructuras de datos](#77-otras-estructuras-de-datos)
- [8. Programación y Bases de Datos](#8-programación-y-bases-de-datos)
  - [8.1. Conexión a SQLite](#81-conexión-a-sqlite)
  - [8.2. Conexión a MySQL](#82-conexión-a-mysql)
  - [8.3. Docker](#83-docker)
  - [8.4. Conexión a PostgreSQL](#84-conexión-a-postgresql)
- [9. CRUD con Bases de Datos](#9-crud-con-bases-de-datos)
  - [9.1. CRUD con SQLite](#91-crud-con-sqlite)
  - [9.2. CRUD con MySQL](#92-crud-con-mysql)
  - [9.3. CRUD con PostgreSQL](#93-crud-con-postgresql)
  - [9.4. CRUD con db4o](#94-crud-con-db4o)
- [10. Próximos Pasos](#10-próximos-pasos)
  - [10.1. Qué puedo hacer con lo aprendido](#101-qué-puedo-hacer-con-lo-aprendido)
  - [10.2. Qué es lo siguiente](#102-qué-es-lo-siguiente)
  - [10.3. Probemos otro lenguaje: Python](#103-probemos-otro-lenguaje-python)

---

# 6. Programación Orientada a Objetos II

## 6.1. Métodos y variables estáticas
```java
public class ContadorObjetos {
    // Variable estática: compartida por TODAS las instancias
    private static int contador = 0;
    
    public ContadorObjetos() { contador++; }
    
    // Método estático: accesible sin instanciar
    public static int getContador() { return contador; }
    
    public static void main(String[] args) {
        new ContadorObjetos(); new ContadorObjetos();
        System.out.println("Total: " + ContadorObjetos.getContador()); // 2
    }
}
```

## 6.2. Herencia
```java
class Animal { protected String nombre; public void mover() { System.out.println("Se mueve"); } }
class Perro extends Animal {
    @Override public void mover() { System.out.println(nombre + " corre"); }
    public void ladrar() { System.out.println("Guau"); }
}
public class TestHerencia {
    public static void main(String[] args) {
        Perro p = new Perro(); p.nombre = "Rex";
        p.mover(); // Polimorfismo básico
    }
}
```

## 6.3. Interfaces
```java
interface Volador { void volar(); }
interface Navegable { void navegar(); }
// Una clase puede implementar múltiples interfaces
class Hidroavion implements Volador, Navegable {
    @Override public void volar() { System.out.println("Volando..."); }
    @Override public void navegar() { System.out.println("Navegando..."); }
}
```

## 6.4. Métodos y variables abstractas
```java
abstract class Figura {
    protected String color;
    // Método abstracto: obliga a la subclase a implementarlo
    public abstract double calcularArea();
    public void mostrarInfo() { System.out.println("Color: " + color); }
}
class Circulo extends Figura {
    private double radio;
    @Override public double calcularArea() { return Math.PI * radio * radio; }
}
// Figura f = new Figura(); // ERROR: no se puede instanciar una clase abstracta
```

## 6.5. Sobreescritura de métodos
```java
class Vehiculo { public void encender() { System.out.println("Motor on"); } }
class Coche extends Vehiculo {
    @Override public void encender() {
        super.encender(); // Llama al comportamiento original
        System.out.println("Sistemas de confort activados");
    }
}
```

## 6.6. Polimorfismo
```java
class Calculadora {
    // Polimorfismo en compilación (Sobrecarga)
    public int sumar(int a, int b) { return a + b; }
    public double sumar(double a, double b) { return a + b; }
}
// Polimorfismo en ejecución (Sobreescritura)
Animal[] zoo = {new Perro(), new Gato()};
for(Animal a : zoo) a.hacerSonido(); // Cada uno ejecuta su versión
```

## 6.7. Casting entre tipos de referencia
```java
Animal a = new Perro(); // Upcasting (implícito y seguro)
// Downcasting (explícito): convertir base a derivada
if (a instanceof Perro) {
    Perro p = (Perro) a; // Conversión segura verificada
    p.ladrar(); // Acceso a método específico
} else { System.out.println("No es un Perro"); }
```

# 7. Estructuras de Datos

## 7.1. Arrays
```java
int[] notas = {8, 9, 7, 10, 6};
notas[1] = 10; // Modificar índice 1
double suma = 0;
for(int n : notas) suma += n;
System.out.println("Promedio: " + (suma / notas.length));
// Nota: tamaño fijo. Para dinámico usar List.
```

## 7.2. Genericidad
```java
// Clase genérica segura en tipos
class Caja<T> {
    private T contenido;
    public void guardar(T item) { this.contenido = item; }
    public T obtener() { return contenido; }
}
// Uso
Caja<String> cajaTxt = new Caja<>(); cajaTxt.guardar("Hola");
Caja<Integer> cajaNum = new Caja<>(); cajaNum.guardar(42);
```

## 7.3. Listas enlazadas
```java
import java.util.LinkedList;
LinkedList<String> tareas = new LinkedList<>();
tareas.add("T1"); tareas.addFirst("Urgente"); tareas.addLast("Backup");
tareas.removeFirst(); // Elimina por cabeza
for(String t : tareas) System.out.println(t); // Acceso secuencial
```

## 7.4. Pilas (Stack - LIFO)
```java
import java.util.Stack;
Stack<Character> pila = new Stack<>();
String expr = "(a+b)*[c-d]";
for(char c : expr.toCharArray()) {
    if(c == '(' || c == '[') pila.push(c);
    else if(c == ')' || c == ']') if(!pila.isEmpty()) pila.pop();
}
System.out.println("Balanceada: " + pila.isEmpty());
```

## 7.5. Colas (Queue - FIFO)
```java
import java.util.LinkedList, java.util.Queue, java.util.PriorityQueue;
Queue<String> cola = new LinkedList<>();
cola.offer("Cliente 1"); cola.offer("Cliente 2");
while(!cola.isEmpty()) System.out.println("Atendiendo: " + cola.poll());

// PriorityQueue ordena por prioridad
PriorityQueue<Integer> urgencias = new PriorityQueue<>((a,b)->b-a);
urgencias.offer(3); urgencias.offer(9); urgencias.offer(1);
System.out.println("Urgencia máxima: " + urgencias.peek()); // 9
```

## 7.6. Grafos
```java
import java.util.*;
class Grafo {
    private Map<String, List<String>> adj = new HashMap<>();
    public void addNodo(String n) { adj.putIfAbsent(n, new ArrayList<>()); }
    public void addArista(String o, String d) {
        adj.computeIfAbsent(o, k->new ArrayList<>()).add(d);
        adj.computeIfAbsent(d, k->new ArrayList<>()).add(o); // No dirigido
    }
    public void dfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        Stack<String> pila = new Stack<>(); pila.push(inicio);
        while(!pila.isEmpty()) {
            String n = pila.pop();
            if(!visitados.contains(n)) {
                System.out.print(n + " "); visitados.add(n);
                pila.addAll(adj.getOrDefault(n, Collections.emptyList()));
            }
        }
    }
}
```

## 7.7. Otras estructuras de datos
```java
// HashMap (Diccionario)
Map<String, Integer> edades = new HashMap<>();
edades.put("Ana", 25); edades.put("Luis", 30);
System.out.println("Edad Ana: " + edades.get("Ana"));

// Árbol Binario de Búsqueda (BST) básico
class NodoBST { int val; NodoBST izq, der; }
class BST {
    NodoBST raiz;
    public void insert(int v) { raiz = insertRec(raiz, v); }
    private NodoBST insertRec(NodoBST r, int v) {
        if(r==null) return new NodoBST(){val=v};
        if(v<r.val) r.izq = insertRec(r.izq, v); else r.der = insertRec(r.der, v);
        return r;
    }
}
```

# 8. Programación y Bases de Datos

## 8.1. Conexión a SQLite
```xml
<!-- pom.xml -->
<dependency><groupId>org.xerial</groupId><artifactId>sqlite-jdbc</artifactId><version>3.34.0</version></dependency>
```
```java
import java.sql.*;
public class ConSQLite {
    public static void main(String[] args) {
        try(Connection c = DriverManager.getConnection("jdbc:sqlite:app.db");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM users")) {
            Class.forName("org.sqlite.JDBC"); // Driver
            while(rs.next()) System.out.println(rs.getString("name"));
        } catch(Exception e) { e.printStackTrace(); }
    }
}
```

## 8.2. Conexión a MySQL
```java
// config.properties
db.url=jdbc:mysql://localhost:3306/users
db.username=root
db.password=
```
```java
Properties p = new Properties();
try(InputStream in = DBCon.class.getResourceAsStream("/config.properties")) {
    p.load(in);
    Connection c = DriverManager.getConnection(
        p.getProperty("db.url"), p.getProperty("db.username"), p.getProperty("db.password"));
    System.out.println("Conectado a MySQL"); c.close();
} catch(Exception e) { e.printStackTrace(); }
```

## 8.3. Docker
```bash
# Terminal para levantar PostgreSQL en Docker
docker pull postgres
docker run --name pg_test -e POSTGRES_PASSWORD=root -p 5432:5432 -d postgres
# Docker encapsula entornos, garantiza portabilidad y aislamiento sin instalar SGBD nativo
```

## 8.4. Conexión a PostgreSQL
```xml
<dependency><groupId>org.postgresql</groupId><artifactId>postgresql</artifactId><version>42.3.1</version></dependency>
```
```java
// Config: db.url=jdbc:postgresql://localhost:5432/users, db.username=postgres, db.password=root
Connection c = DriverManager.getConnection(url, user, pass);
Statement s = c.createStatement();
s.executeUpdate("CREATE TABLE IF NOT EXISTS users(id SERIAL, name VARCHAR(100))");
```

# 9. CRUD con Bases de Datos

## 9.1. CRUD con SQLite
```java
public void insertar(String nombre, Connection c) throws SQLException {
    try(Statement s = c.createStatement()) {
        s.executeUpdate("INSERT INTO users(name) VALUES('" + nombre + "')");
    }
}
public void actualizar(int id, String nombre, Connection c) throws SQLException {
    try(Statement s = c.createStatement()) {
        s.executeUpdate("UPDATE users SET name='" + nombre + "' WHERE id=" + id);
    }
}
public void eliminar(int id, Connection c) throws SQLException {
    try(Statement s = c.createStatement()) {
        s.executeUpdate("DELETE FROM users WHERE id=" + id);
    }
}
```

## 9.2. CRUD con MySQL
```java
// Uso de PreparedStatement para seguridad (inyección SQL) y eficiencia
public void insertarMySQL(String nombre, Connection c) throws SQLException {
    String sql = "INSERT INTO users(name) VALUES(?)";
    try(PreparedStatement ps = c.prepareStatement(sql)) {
        ps.setString(1, nombre); ps.executeUpdate();
    }
}
public void leerMySQL(Connection c) throws SQLException {
    try(PreparedStatement ps = c.prepareStatement("SELECT * FROM users");
        ResultSet rs = ps.executeQuery()) {
        while(rs.next()) System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
    }
}
```

## 9.3. CRUD con PostgreSQL
```java
// Estructura idéntica a MySQL, solo cambia URL y driver
public void deletePG(int id, Connection c) throws SQLException {
    String sql = "DELETE FROM users WHERE id = ?";
    try(PreparedStatement ps = c.prepareStatement(sql)) {
        ps.setInt(1, id);
        int filas = ps.executeUpdate();
        if(filas > 0) System.out.println("Eliminado correctamente");
    }
}
```

## 9.4. CRUD con db4o
```java
import com.db4o.*;
public class CRUDdb4o {
    static String DB = "datos.db";
    public static void insert(Usuario u) {
        try(ObjectContainer db = Db4oEmbedded.openFile(DB)) {
            db.store(u); db.commit(); // Persistencia nativa de objetos
        }
    }
    public static void read() {
        try(ObjectContainer db = Db4oEmbedded.openFile(DB)) {
            ObjectSet<Usuario> res = db.query(Usuario.class);
            for(Usuario u : res) System.out.println(u.getNombre());
        }
    }
    public static void update(String viejo, String nuevo) {
        try(ObjectContainer db = Db4oEmbedded.openFile(DB)) {
            Usuario query = new Usuario(); query.setNombre(viejo);
            ObjectSet<Usuario> res = db.queryByExample(query);
            if(res.hasNext()) {
                Usuario u = res.next(); u.setNombre(nuevo); db.store(u); db.commit();
            }
        }
    }
    public static void delete(String nombre) {
        try(ObjectContainer db = Db4oEmbedded.openFile(DB)) {
            Usuario q = new Usuario(); q.setNombre(nombre);
            ObjectSet<Usuario> res = db.queryByExample(q);
            if(res.hasNext()) { db.delete(res.next()); db.commit(); }
        }
    }
}
```

# 10. Próximos Pasos

## 10.1. Qué puedo hacer con lo aprendido
Con POO, colecciones, JDBC y CRUD puedes desarrollar: agendas de contactos, inventarios con interfaz Swing/JavaFX, sistemas de gestión de usuarios, simuladores básicos y cumplir ~70% de los requisitos de proyectos de ciclo formativo.

## 10.2. Qué es lo siguiente
- **Avanzado Java:** Patrones de diseño (Singleton, Factory), concurrencia (`Thread`, `ExecutorService`), optimización de algoritmos.
- **Web/Móvil:** Spring Boot, REST APIs, Android/Kotlin, Flutter.
- **DevOps/Seguridad:** Git, CI/CD (Docker, Jenkins), prevención de inyecciones, validación de entradas.
- **Metodologías:** Scrum, Kanban, TDD.

## 10.3. Probemos otro lenguaje: Python
```python
# 1. Sintaxis básica y tipos
x, y, txt = 5, 3.14, "Python"
print(f"{x} {y} {txt}")

# 2. Condicionales y bucles
if x > 3: print("Mayor")
for i in range(3): print(i)

# 3. Funciones
def sumar(a, b): return a + b

# Ejercicio: Calculadora básica
def calc(op, a, b):
    ops = {"+": lambda: a+b, "-": lambda: a-b, "*": lambda: a*b}
    return ops.get(op, lambda: "Invalid")()

# Ejercicio: POO con herencia
class Figura:
    def area(self): pass
class Circulo(Figura):
    def __init__(self, r): self.r = r
    def area(self): return 3.1416 * self.r**2

# Ejercicio: Gráfico con matplotlib
import matplotlib.pyplot as plt, numpy as np
x = np.linspace(-5, 5, 100)
y = x**3 + 2*x**2 - 1
plt.plot(x, y, label="y=x³+2x²-1"); plt.legend(); plt.grid(); plt.show()
```
