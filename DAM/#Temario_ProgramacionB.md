# RESUMEN COMPLETO Y ESTRUCTURADO: PROGRAMACIÓN B

## 6. PROGRAMACIÓN ORIENTADA A OBJETOS II
### 6.1. Métodos y variables estáticas
- **Definición:** Pertenecen a la clase, no a instancias. Se inicializan una vez y se comparten entre todos los objetos. Se acceden sin instanciar.
- **Uso en Java:** Palabra clave `static`. Acceso: `Clase.miembro`.
- **Ejemplos:**
  - Contador de objetos: `public static int contador = 0;` incrementado en cada constructor.
  - Método utilitario: `public static int sumar(int a, int b) { return a + b; }` llamado como `Utilidad.sumar(5,3)`.
  - Constante estática: `public static final double PI = 3.14159;` (inmutable por `final`).

### 6.2. Herencia
- **Definición:** Mecanismo donde una subclase hereda atributos y métodos de una superclase. Permite reutilización, extensión y especialización.
- **Uso en Java:** `class SubClase extends SuperClase`. `super` accede a métodos/constructores del padre.
- **Ejemplos:**
  - Básica: `class Perro extends Animal` sobreescribe `hacerSonido()`.
  - Uso de `super`: `Coche` llama `super.describir()` + añade comportamiento propio.
  - Multinivel: `Animal -> Mamifero -> Gato`. `Gato` hereda indirectamente de `Animal` y directamente de `Mamifero`.

### 6.3. Interfaces
- **Definición:** Contrato que define métodos sin implementación. Una clase puede implementar múltiples interfaces. Desde Java 8 permite métodos `default`.
- **Uso en Java:** `interface Nombre { void metodo(); }` -> `class Clase implements Nombre { ... }`
- **Ejemplos:**
  - Contrato básico: `interface Vehiculo { void acelerar(); void frenar(); }` implementada por `Coche`.
  - Múltiple implementación: `class Hidroavion implements Navegable, Volador`.
  - Comportamiento común: `interface Imprimible` implementado por `Documento` e `Imagen` con lógica distinta en cada `imprimir()`.

### 6.4. Métodos y variables abstractas
- **Definición:** Método sin cuerpo que obliga a subclases a implementarlo. Clase con ≥1 método abstracto debe ser `abstract` y no instanciable. No existen variables abstractas en Java.
- **Uso en Java:** `abstract class Clase { public abstract void metodo(); }`
- **Ejemplos:**
  - Clase abstracta: `abstract class Animal { public abstract void hacerSonido(); }`
  - Mixto abstracto/concreto: `abstract class Vehiculo { public abstract void acelerar(); public void detener() { ... } }`
  - Interfaz como contrato: `interface Figura { double calcularArea(); }` implementada por `Circulo`.

### 6.5. Sobreescritura de métodos (Overriding)
- **Definición:** Subclase redefine un método heredado manteniendo firma idéntica para personalizar comportamiento.
- **Uso en Java:** Anotación `@Override`. `super.metodo()` reutiliza lógica padre. Constructores no se sobreescriben, se invocan con `super()`.
- **Ejemplos:**
  - `Perro` sobreescribe `hacerSonido()` de `Animal`.
  - `Coche` sobreescribe `arrancar()` llamando `super.arrancar()` + lógica extra.
  - Constructores: `Empleado(String n, String p) { super(n); this.puesto = p; }`

### 6.6. Polimorfismo
- **Definición:** Capacidad de un objeto de tomar múltiples formas. Mismo método, comportamiento distinto según objeto invocador.
- **Tipos:** Compilación (sobrecarga), Ejecución (sobreescritura + referencias base/interfaz).
- **Ejemplos:**
  - Referencia base: `Animal miPerro = new Perro(); miPerro.hacerSonido();` (ejecuta versión Perro).
  - Interfaces: `Imprimible doc = new Documento(); doc.imprimir();`
  - Sobrecarga: `Calculadora.sumar(int, int)` y `sumar(double, double)`.

### 6.7. Casting entre tipos de referencia
- **Definición:** Conversión de referencias en jerarquía. Upcasting (subclase→base, implícito, seguro). Downcasting (base→subclase, explícito, requiere verificación).
- **Uso en Java:** `SubClase obj = (SubClase) baseObj;` Validar con `instanceof` para evitar `ClassCastException`.
- **Ejemplos:**
  - Upcasting: `Animal a = new Perro(); a.hacerSonido();`
  - Downcasting seguro: `if(a instanceof Perro) { Perro p = (Perro) a; p.ladrar(); }`
  - Interfaz→Clase: `Volador v = new Avion(); if(v instanceof Avion) { Avion a = (Avion) v; a.aterrizar(); }`

---

## 7. ESTRUCTURAS DE DATOS
### 7.1. Arrays
- **Definición:** Lineal, tamaño fijo, mismo tipo, memoria contigua, acceso por índice (0).
- **Ejemplos:** `String[] ciudades = {"Madrid", "Barcelona"};` acceso `ciudades[1]`, modificación `calificaciones[2]=80;`, búsqueda lineal con `for`.

### 7.2. Genericidad
- **Definición:** Parámetros `<T>` para clases/métodos independientes del tipo, manteniendo seguridad de tipos en compilación.
- **Ejemplos:**
  - Clase: `class ContenedorArray<T> { private T[] array; public T obtener(int i){ return array[i]; } }`
  - Método: `public static <T> int buscar(T[] arr, T elem) { ... }`
  - Intercambio: `public static <T> void intercambiar(T[] arr, int i, int j) { T temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }`

### 7.3. Listas enlazadas (LinkedList)
- **Definición:** Nodos (dato + referencia siguiente). Dinámicas, inserción/eliminación eficientes, acceso secuencial.
- **Java:** `java.util.LinkedList` (doble enlace). Implementa `List` y `Queue`.
- **Ejemplos:** `addFirst()/addLast()`, `removeFirst()/removeLast()`, uso como cola: `Queue<String> tareas = new LinkedList<>(); tareas.add("T1"); tareas.poll();`

### 7.4. Pilas (Stack)
- **Definición:** LIFO (Last In, First Out). Operaciones: `push`, `pop`, `peek`, `isEmpty`.
- **Java:** `java.util.Stack`.
- **Ejemplos:**
  - Paréntesis balanceados: push `(`, pop al ver `)`. Vacía al final → OK.
  - Decimal a binario: push restos `%2`, pop para invertir orden.
  - Deshacer: `stack.pop()` elimina última operación.

### 7.5. Colas (Queue)
- **Definición:** FIFO (First In, First Out). Operaciones: `offer/enqueue`, `poll/dequeue`, `peek`.
- **Java:** Interfaz `Queue`, implementaciones `LinkedList`, `PriorityQueue`.
- **Ejemplos:**
  - Tareas: `tareas.offer()`, `while(!isEmpty()) tareas.poll();`
  - Fila banco: Orden de llegada.
  - Prioridad: `PriorityQueue<Emergencia>` con `Comparator` inverso para urgencias.

### 7.6. Grafos
- **Definición:** Nodos (vértices) + aristas. Dirigidos/no dirigidos, ponderados/no ponderados.
- **Implementación:** Lista adyacencia (`HashMap<String, List<String>>`) o Matriz.
- **Ejemplos:**
  - No dirigido: `añadirArista(A,B)` añade en ambas listas.
  - Dirigido + DFS: Recorrido profundidad con `Stack` y `Set` visitados.
  - Ponderado + Dijkstra: `PriorityQueue` para ruta mínima. Inicializar distancias `Integer.MAX_VALUE`, actualizar si `nuevaDist < distanciaVecino`.

### 7.7. Otras estructuras
- **HashMap/Diccionario:** Clave-valor únicos. Tabla hash. O(1) promedio. Java: `HashMap<K,V>`. Ej: `map.put("Ana", 25); map.get("Ana");`
- **Árboles:** Jerárquicos, raíz, hijos, sin ciclos. Recorridos: pre/in/postorden. Java: clases manuales `Nodo`.
- **BST (Árbol Binario de Búsqueda):** Máx 2 hijos. `izq < nodo < der`. Inserción/búsqueda recursivas. Java: `NodoBST`, `insertarRecursivo()`, `buscarRecursivo()`.

---

## 8. PROGRAMACIÓN Y BASES DE DATOS
### JDBC y Conexión
- **Componentes:** `DriverManager` (gestiona drivers), `Connection` (sesión), `Statement` (SQL estático), `PreparedStatement` (precompilado, seguro), `CallableStatement` (procedimientos), `ResultSet` (datos `SELECT`).
- **Proceso:** Cargar driver → `DriverManager.getConnection(url,user,pass)` → Crear statement → Ejecutar SQL → Procesar `ResultSet` → Cerrar recursos.

### 8.1. SQLite
- **Características:** Ligera, archivo único, sin servidor.
- **Config:** Maven: `org.xerial:sqlite-jdbc`. Ruta: `jdbc:sqlite:` + `getResource().getPath()`.
- **Ejemplo:** `Class.forName("org.sqlite.JDBC"); Connection conn = DriverManager.getConnection(url);`

### 8.2. MySQL
- **Entorno:** XAMPP (Apache + MySQL + phpMyAdmin en `localhost`).
- **Config:** Maven: `mysql:mysql-connector-java`. URL: `jdbc:mysql://localhost:3306/nombre_db`.
- **Mejora:** `config.properties` para `db.url`, `db.username`, `db.password`. Carga con `Properties` y `getResourceAsStream()`.

### 8.3. Docker
- **Definición:** Plataforma contenedores ligeros, portátiles, autosuficientes (código, runtime, libs).
- **Docker Desktop:** Engine, CLI, Compose, Kubernetes, GUI.
- **Beneficios:** Portabilidad, consistencia, eficiencia, aislamiento. Usos: Dev, testing, CI/CD, microservicios.

### 8.4. PostgreSQL
- **Características:** Objeto-relacional, ACID, extensible, JSON, replicación, indexación avanzada.
- **Docker:** Pull `postgres`, mapeo `5432:5432`. `docker exec -it contenedor bash` → `psql -U postgres` → `CREATE DATABASE users;`
- **Gestión:** DBeaver. Java: Maven `org.postgresql:postgresql`. URL: `jdbc:postgresql://localhost:5432/users`. Tipos: `SERIAL`, `VARCHAR`.

---

## 9. CRUD CON BASES DE DATOS
- **Definición:** Create (`INSERT`), Read (`SELECT`), Update (`UPDATE`), Delete (`DELETE`). Cierre en `finally` o try-with-resources.

### 9.1. CRUD con SQLite
- **Create:** `stmt.executeUpdate("INSERT INTO users(name) VALUES ('" + nombre + "')");`
- **Read:** `stmt.executeQuery("SELECT * FROM users");` → `while(rs.next()) ...`
- **Update:** `stmt.executeUpdate("UPDATE users SET name='nuevo' WHERE id=" + id);`
- **Delete:** `stmt.executeUpdate("DELETE FROM users WHERE id=" + id);`
- **Nota:** Usa `Statement` directo (menos seguro, vulnerable a inyección).

### 9.2. CRUD con MySQL
- **Conexión:** Clase `DBConnection` con `Properties` y `DriverManager`.
- **Seguridad:** `PreparedStatement` con `?`.
- **Ejemplo:** `String sql = "INSERT INTO users(name) VALUES (?)"; PreparedStatement pstmt = conn.prepareStatement(sql); pstmt.setString(1, nombre); pstmt.executeUpdate();`
- **Try-with-resources:** Cierra automáticamente `Connection`, `PreparedStatement`, `ResultSet`.

### 9.3. CRUD con PostgreSQL
- **Estructura:** Idéntica a MySQL (`PreparedStatement`, `Properties`).
- **Diferencia SQL:** `INSERT INTO users(nombre) VALUES (?)`.
- **Tipos Java:** `pstmt.setString(1, nuevoNombre); pstmt.setInt(2, id);`

### 9.4. CRUD con db4o
- **Definición:** BBDD orientada a objetos nativa. Sin mapeo relacional, ligera, sin servidor. Query por ejemplo o Native Queries.
- **Config:** Maven: `com.db4o:db4o-full-java5`.
- **Conexión:** `ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "usuarios.db");`
- **Operaciones:**
  - Create: `db.store(usuario); db.commit();`
  - Read: `ObjectSet<Usuario> lista = db.query(Usuario.class);`
  - Update: `db.queryByExample(new Usuario(nombre, 0));` → modificar → `db.store(usuario); db.commit();`
  - Delete: `db.delete(usuario); db.commit();`

---

## 10. PRÓXIMOS PASOS
### 10.1. Qué puedo hacer con lo aprendido
- **Aplicaciones:** CRUDs (agenda, inventario), GUIs simples, sistemas gestión usuarios/roles, simulaciones/juegos básicos POO.
- **Cobertura:** ~70% requisitos proyecto final ciclo formativo.

### 10.2. Qué es lo siguiente
- **Avanzado:** Patrones (Singleton, Factory, Observer), concurrencia/multihilo, optimización algoritmos.
- **Web:** Frontend (HTML/CSS/JS), Backend Java (Spring/Java EE), APIs RESTful.
- **Móvil:** Android (Java/Kotlin), multiplataforma (Flutter, React Native).
- **BD:** NoSQL (MongoDB), optimización SQL, replicación/alta disponibilidad.
- **DevOps:** Git, CI/CD (Jenkins, Docker, Kubernetes).
- **Seguridad:** Prevención inyección SQL, manejo datos sensibles, fuerza bruta.
- **Metodologías:** Scrum, Kanban.

### 10.3. Probemos otro lenguaje: Python
- **Definición:** Alto nivel, interpretado, multiparadigma, sintaxis clara, estándar ML/IA.
- **Librerías clave:** `NumPy/SciPy` (cálculo), `Pandas` (datos), `Scikit-learn` (ML), `TensorFlow/PyTorch` (Deep Learning), `Matplotlib/Seaborn` (visualización).
- **Entorno:** `pip install jupyter`, `jupyter notebook`. Verificar: `python --version`.
- **Sintaxis básica:**
  ```python
  x = 5; y = 3.14; nombre = "Python"
  if x > 3: print("Mayor")
  for i in range(5): print(i)
  def suma(a, b): return a + b

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
