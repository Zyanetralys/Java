# RESUMEN COMPLETO: PROGRAMACIÓN B

## 6. PROGRAMACIÓN ORIENTADA A OBJETOS II
### 6.1. Métodos y variables estáticas
- **Definición:** Pertenecen a la clase, no a instancias. Se comparten entre todos los objetos y se acceden sin instanciar.
- **Java:** `static`. Acceso: `Clase.miembro`.
- **Ejemplos:**
  - Contador: `public static int contador;` incrementado en constructor.
  - Utilidad: `public static int sumar(int a, int b) { return a + b; }`
  - Constante: `public static final double PI = 3.14159;`

### 6.2. Herencia
- **Definición:** Subclase hereda atributos/métodos de superclase. Permite reutilización, extensión y especialización.
- **Java:** `class SubClase extends SuperClase`. `super` para acceder a padre.
- **Ejemplos:**
  - Básica: `Perro extends Animal`, sobreescribe `hacerSonido()`.
  - `super`: `Coche` llama `super.describir()` + lógica propia.
  - Multinivel: `Animal -> Mamifero -> Gato`.

### 6.3. Interfaces
- **Definición:** Contrato de métodos sin implementación. Una clase puede implementar múltiples interfaces. Desde Java 8 soporta `default`.
- **Java:** `interface Nombre { void metodo(); }` -> `class Clase implements Nombre`.
- **Ejemplos:**
  - `Vehiculo`: define `acelerar()`, `frenar()`. `Coche` implementa.
  - Múltiple: `Hidroavion implements Navegable, Volador`.
  - Comportamiento común: `Imprimible` implementado por `Documento` e `Imagen`.

### 6.4. Métodos y variables abstractas
- **Definición:** Método sin cuerpo que obliga a subclases a implementarlo. Clase con método abstracto debe ser `abstract` y no instanciable. No existen variables abstractas en Java.
- **Java:** `abstract class Clase { public abstract void metodo(); }`
- **Ejemplos:**
  - `Animal` abstracta con `hacerSonido()` abstracto. `Perro` extiende e implementa.
  - `Vehiculo` abstracta: `acelerar()` abstracto, `detener()` concreto.
  - Interfaz como contrato: `Figura` con `calcularArea()`, implementada por `Circulo`.

### 6.5. Sobreescritura de métodos (Overriding)
- **Definición:** Subclase redefine método heredado con firma idéntica para personalizar comportamiento.
- **Java:** `@Override`. `super.metodo()` para reutilizar lógica padre. Constructores no se sobreescriben, se invocan con `super()`.
- **Ejemplos:**
  - `Perro` sobreescribe `hacerSonido()` de `Animal`.
  - `Coche` sobreescribe `arrancar()` llamando `super.arrancar()` + extra.
  - Constructores: `Empleado` llama `super(nombre)` en su constructor.

### 6.6. Polimorfismo
- **Definición:** Capacidad de un objeto de tomar múltiples formas. Mismo método, comportamiento distinto según objeto invocador.
- **Tipos:** Compilación (sobrecarga), Ejecución (sobreescritura + referencias base/interfaz).
- **Ejemplos:**
  - Referencia base: `Animal miPerro = new Perro(); miPerro.hacerSonido();` (ejecuta versión Perro).
  - Interfaces: `Imprimible doc = new Documento(); doc.imprimir();`
  - Sobrecarga: `Calculadora.sumar(int, int)` y `sumar(double, double)`.

### 6.7. Casting entre tipos de referencia
- **Definición:** Conversión de referencias en jerarquía. Upcasting (subclase→base, implícito, seguro). Downcasting (base→subclase, explícito, requiere verificación).
- **Java:** `SubClase obj = (SubClase) baseObj;` Validar con `instanceof` para evitar `ClassCastException`.
- **Ejemplos:**
  - Upcasting: `Animal a = new Perro(); a.hacerSonido();`
  - Downcasting seguro: `if(a instanceof Perro) { Perro p = (Perro) a; p.ladrar(); }`
  - Interfaz→Clase: `Volador v = new Avion(); if(v instanceof Avion) { Avion a = (Avion) v; a.aterrizar(); }`

## 7. ESTRUCTURAS DE DATOS
### 7.1. Arrays
- **Definición:** Lineal, tamaño fijo, mismo tipo, memoria contigua, acceso por índice (0).
- **Java:** `String[] ciudades = {"Madrid", "Barcelona"};` acceso `ciudades[1]`, modificación, búsqueda con `for`.

### 7.2. Genericidad
- **Definición:** Parámetros `<T>` para clases/métodos independientes del tipo, manteniendo seguridad de tipos.
- **Ejemplos:**
  - Clase: `class ContenedorArray<T> { private T[] array; ... }`
  - Método: `public static <T> int buscar(T[] arr, T elem) { ... }`
  - Intercambio: `public static <T> void intercambiar(T[] arr, int i, int j) { ... }`

### 7.3. Listas enlazadas (LinkedList)
- **Definición:** Nodos (dato + referencia siguiente). Dinámica, inserción/eliminación eficientes, acceso secuencial.
- **Java:** `java.util.LinkedList`. Implementa `List` y `Queue`.
- **Ejemplos:** `add()`, `addFirst()/addLast()`, `removeFirst()/removeLast()`, uso como cola: `Queue<String> tareas = new LinkedList<>(); tareas.add("T1"); tareas.poll();`

### 7.4. Pilas (Stack)
- **Definición:** LIFO. Operaciones: `push`, `pop`, `peek`, `isEmpty`.
- **Java:** `java.util.Stack`.
- **Ejemplos:**
  - Paréntesis balanceados: push `(`, pop al ver `)`. Vacía al final → OK.
  - Decimal a binario: push restos `%2`, pop para invertir.
  - Deshacer: `stack.pop()` elimina última operación.

### 7.5. Colas (Queue)
- **Definición:** FIFO. Operaciones: `offer/enqueue`, `poll/dequeue`, `peek`.
- **Java:** Interfaz `Queue`, implementaciones `LinkedList`, `PriorityQueue`.
- **Ejemplos:**
  - Tareas: `tareas.offer()`, `while(!isEmpty()) tareas.poll();`
  - Fila banco: Orden de llegada.
  - Prioridad: `PriorityQueue<Emergencia>` con `Comparator` inverso para urgencias.

### 7.6. Grafos
- **Definición:** Nodos (vértices) + aristas. Dirigidos/no dirigidos, ponderados/no ponderados.
- **Implementación:** Lista adyacencia (`HashMap<String, List<String>>`) o Matriz.
- **Ejemplos:**
  - No dirigido: `añadirArista(A,B)` añade en ambos.
  - Dirigido + DFS: Recorrido profundidad con `Stack` y `Set` visitados.
  - Ponderado + Dijkstra: `PriorityQueue` para ruta mínima. Inicializar distancias `MAX_VALUE`, actualizar si `nuevaDist < distanciaVecino`.

### 7.7. Otras estructuras
- **HashMap/Diccionario:** Clave-valor únicos. Tabla hash. O(1) promedio. Java: `HashMap<K,V>`. Ej: `map.put("Ana", 25); map.get("Ana");`
- **Árboles:** Jerárquicos, raíz, hijos, sin ciclos. Recorridos: pre/in/postorden. Java: clases manuales `Nodo`.
- **BST (Árbol Binario de Búsqueda):** Máx 2 hijos. `izq < nodo < der`. Inserción/búsqueda recursivas. Java: `NodoBST`, `insertarRecursivo()`, `buscarRecursivo()`.

## 8. PROGRAMACIÓN Y BASES DE DATOS
### JDBC y Conexión
- **Pasos:** Elegir BD → Cargar driver → `DriverManager.getConnection(url, user, pass)` → Crear `Statement`/`PreparedStatement` → Ejecutar SQL → Procesar `ResultSet` → Cerrar recursos.
- **Componentes:** `DriverManager`, `Connection`, `Statement`, `PreparedStatement` (precompilado, seguro), `CallableStatement`, `ResultSet`.

### 8.1. SQLite
- **Características:** Ligera, archivo único, sin servidor.
- **Config:** Maven: `org.xerial:sqlite-jdbc`. Ruta: `jdbc:sqlite:` + `getResource().getPath()`.
- **Ejemplo:** `Class.forName("org.sqlite.JDBC"); Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM users");`

### 8.2. MySQL
- **Entorno:** XAMPP (Apache + MySQL + phpMyAdmin en `localhost`).
- **Config:** Maven: `mysql:mysql-connector-java`. URL: `jdbc:mysql://localhost:3306/nombre_db`.
- **Mejora:** `config.properties` para `db.url`, `db.username`, `db.password`. Carga con `Properties` y `getResourceAsStream()`.

### 8.3. Docker
- **Definición:** Plataforma contenedores ligeros, portátiles, autosuficientes (código, runtime, libs).
- **Docker Desktop:** Engine, CLI, Compose, Kubernetes, GUI.
- **Beneficios:** Portabilidad, consistencia, eficiencia, aislamiento.
- **Usos:** Dev, testing, CI/CD, microservicios, modernización.

### 8.4. PostgreSQL
- **Características:** Objeto-relacional, ACID, extensible, JSON, replicación, indexación avanzada.
- **Docker:** Pull `postgres`, mapeo `5432:5432`. `docker exec -it contenedor bash` → `psql -U postgres` → `CREATE DATABASE users;`
- **Gestión:** DBeaver (SGBD universal).
- **Config Java:** Maven: `org.postgresql:postgresql`. URL: `jdbc:postgresql://localhost:5432/users`. Tipos: `SERIAL`, `VARCHAR`.

## 9. CRUD CON BASES DE DATOS
- **Definición:** Create (INSERT), Read (SELECT), Update (UPDATE), Delete (DELETE). Cierre en `finally` o try-with-resources.

### 9.1. CRUD con SQLite
- **Create:** `stmt.executeUpdate("INSERT INTO users(name) VALUES ('" + nombre + "')");`
- **Read:** `stmt.executeQuery("SELECT * FROM users");` → `while(rs.next()) ...`
- **Update:** `stmt.executeUpdate("UPDATE users SET name='nuevo' WHERE id=" + id);`
- **Delete:** `stmt.executeUpdate("DELETE FROM users WHERE id=" + id);`
- **Nota:** Usa `Statement` directo (menos seguro).

### 9.2. CRUD con MySQL
- **Conexión:** Clase `DBConnection` con `Properties` y `DriverManager`.
- **Seguridad:** `PreparedStatement` con `?`.
- **Ejemplo:** `String sql = "INSERT INTO users(name) VALUES (?)"; PreparedStatement pstmt = conn.prepareStatement(sql); pstmt.setString(1, nombre); pstmt.executeUpdate();`
- **Try-with-resources:** Cierra automáticamente `Connection`, `PreparedStatement`, `ResultSet`.

### 9.3. CRUD con PostgreSQL
- **Idéntico a MySQL** en estructura y seguridad (`PreparedStatement`, `Properties`).
- **Diferencia SQL:** `INSERT INTO users(nombre) VALUES (?)`.
- **Tipos Java:** `pstmt.setString(1, nuevoNombre); pstmt.setInt(2, id);`

### 9.4. CRUD con db4o
- **Definición:** BD orientada a objetos nativa. Sin mapeo relacional, ligera, sin servidor. Query por ejemplo o Native Queries.
- **Config:** Maven: `com.db4o:db4o-full-java5`.
- **Conexión:** `ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "usuarios.db");`
- **Operaciones:**
  - Create: `db.store(usuario); db.commit();`
  - Read: `ObjectSet<Usuario> lista = db.query(Usuario.class);`
  - Update: `db.queryByExample(new Usuario(nombre, 0));` → modificar → `db.store(usuario); db.commit();`
  - Delete: `db.delete(usuario); db.commit();`

## 10. PRÓXIMOS PASOS
### 10.1. Qué puedo hacer con lo aprendido
- **Aplicaciones:** CRUDs (agenda, inventario), GUIs simples (calculadoras, gestores), sistemas gestión usuarios/roles, simulaciones/juegos básicos POO.
- **Cobertura:** ~70% requisitos proyecto final ciclo formativo.

### 10.2. Qué es lo siguiente
- **Avanzado:** Patrones (Singleton, Factory, Observer), concurrencia, optimización algoritmos.
- **Web:** Frontend (HTML/CSS/JS), Backend Java (Spring/EE), APIs RESTful.
- **Móvil:** Android (Java/Kotlin), multiplataforma (Flutter, React Native).
- **BD:** NoSQL (MongoDB), optimización SQL, replicación.
- **DevOps:** Git, CI/CD (Jenkins, Docker, Kubernetes).
- **Seguridad:** Prevención inyección SQL, manejo datos sensibles.
- **Metodologías:** Scrum, Kanban.

### 10.3. Probemos otro lenguaje: Python
- **Definición:** Alto nivel, interpretado, multiparadigma, sintaxis clara, estándar ML/IA.
- **Librerías:** `NumPy`/`SciPy` (cálculo), `Pandas` (datos), `Scikit-learn` (ML), `TensorFlow`/`PyTorch` (Deep Learning), `Matplotlib`/`Seaborn` (visualización).
- **Entorno:** `python --version`, `pip`, `jupyter notebook`.
- **Sintaxis básica:**
  ```python
  x = 5; y = 3.14; nombre = "Python"
  if x > 3: print("Mayor")
  for i in range(5): print(i)
  def suma(a, b): return a + b

#### 1. Calculadora Básica
- **Concepto:** Lectura de entrada con `input()`, control de flujo `if/elif/else`, modularidad con `def`.
- **Implementación:**
```python
def sumar(a, b): return a + b
def restar(a, b): return a - b
def multiplicar(a, b): return a * b

def calculadora():
    op = int(input("1:Sumar 2:Restar 3:Multiplicar: "))
    n1, n2 = float(input("N1: ")), float(input("N2: "))
    if op == 1: print("Res:", sumar(n1, n2))
    elif op == 2: print("Res:", restar(n1, n2))
    elif op == 3: print("Res:", multiplicar(n1, n2))
    else: print("Operación no válida")

calculadora()

#### 2. Gráfico de Ecuación (`y = x³ + 2x² - 1`)
- **Concepto:** Vectorización numérica con `numpy`, renderizado gráfico con `matplotlib.pyplot`.
- **Implementación:**
```python
import matplotlib.pyplot as plt
import numpy as np

# Crear rango de valores de x
x = np.linspace(-10, 10, 100)
# Definir ecuación
y = (x**3) + (2 * x**2) - 1

# Graficar
plt.plot(x, y, label='y=x^3+2x^2-1')
plt.title('Gráfico de la ecuación')
plt.xlabel('x'); plt.ylabel('y')
plt.legend(); plt.grid(True)
plt.show()
```

#### 3. POO Figuras (Herencia y Visualización)
- **Concepto:** Clase base `Figura` con `__init__` y `area()`. Hijas `Rectangulo(Figura)` y `Circulo(Figura)` con `super().__init__()`. Implementan `area()` y `dibujar()` usando `plt.Rectangle` y `plt.Circle`. Instanciar y llamar `rect.dibujar()`, `circulo.dibujar()`.
- **Implementación:**
```python
import matplotlib.pyplot as plt
import numpy as np

class Figura:
    def __init__(self, nombre):
        self.nombre = nombre
    def area(self):
        pass

class Rectangulo(Figura):
    def __init__(self, ancho, alto):
        super().__init__("Rectángulo")
        self.ancho = ancho
        self.alto = alto
    def area(self):
        return self.ancho * self.alto
    def dibujar(self):
        fig, ax = plt.subplots()
        rect = plt.Rectangle((0, 0), self.ancho, self.alto, fill=None, edgecolor='r')
        ax.add_patch(rect)
        ax.set_xlim(-1, self.ancho + 1)
        ax.set_ylim(-1, self.alto + 1)
        plt.title(f"{self.nombre} - Área: {self.area()}")
        plt.show()

class Circulo(Figura):
    def __init__(self, radio):
        super().__init__("Círculo")
        self.radio = radio
    def area(self):
        return np.pi * self.radio**2
    def dibujar(self):
        fig, ax = plt.subplots()
        circulo = plt.Circle((0, 0), self.radio, fill=None, edgecolor='b')
        ax.add_patch(circulo)
        ax.set_xlim(-self.radio-1, self.radio+1)
        ax.set_ylim(-self.radio-1, self.radio+1)
        plt.title(f"{self.nombre} - Área: {self.area():.2f}")
        plt.show()

# Instanciación y ejecución
rect = Rectangulo(5, 3)
rect.dibujar()
circulo = Circulo(4)
circulo.dibujar()
```

