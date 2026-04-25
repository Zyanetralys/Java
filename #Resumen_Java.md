# JAVA

---

## 1. ARQUITECTURA, EJECUCIÓN
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **JDK** | Kit de desarrollo. Contiene `javac`, `java`, `jdb`, herramientas de profiling, `javadoc`. | `javac Main.java` compila a bytecode. |
| **JRE** | Entorno de ejecución. Bibliotecas estándar + JVM. No incluye compilador. | Necesario solo para ejecutar apps en producción. |
| **JVM** | Máquina virtual. Interpreta/compila JIT el `.class` a código nativo. Abstrae hardware/SO. | Base de "Write Once, Run Anywhere". |
| **Bytecode** | Instrucciones intermedias independientes de plataforma. Extensión `.class`. | Ejecutado por cualquier JVM compatible. |
| **JIT Compiler** | Compilación Just-In-Time. Convierte bytecode "hot" a código máquina nativo en runtime. Tiered: C1 (rápido) + C2 (agresivo). | `-XX:+PrintCompilation` muestra inlining/compilación. Optimiza tras umbrales de ejecución. |
| **Classloader** | Carga clases dinámicamente. Jerarquía delegación: Bootstrap → Platform → Application. | `ClassLoader.getSystemResource()` carga assets/jars. `ClassNotFoundException` vs `NoClassDefFoundError`. |
| **Entry Point** | Método obligatorio para iniciar ejecución. | `public static void main(String[] args) { }` |
| **Paquetes & Imports** | Espacios de nombres lógicos. Mapean estructura de directorios. `import` resuelve clases externas. `*` no incluye subpaquetes. | `package com.ops.intel;` → archivo en `com/ops/intel/`. `import java.util.List;` |
| **JAR/WAR/EAR/Fat JAR** | JAR=lib/app, WAR=web, EAR=enterprise (EJB+WAR). Fat/Uber JAR embebe dependencias + loader autoejecutable. | Spring Boot usa `jar` con `spring-boot-loader` embebido. `jar cvf app.jar -C out/ .` |

---

## 2. SINTAXIS, TIPOS, VARIABLES
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Primitivos** | 8 tipos nativos. Ocupan memoria fija en stack. No son objetos. | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean` |
| **Wrappers** | Clases contenedoras inmutables en heap. Permiten `null` y uso en genéricos. Autoboxing/unboxing automático (costo GC). | `Integer i = 5;` → cuidado en loops masivos. |
| **String Pool & Inmutabilidad** | Literales se cachean en pool. `String` es `final`. Modificación crea nueva instancia. | `String s = "a"; s += "b";` → 3 objetos. Usar `StringBuilder` en bucles. |
| **`var` & Inference** | Inferencia de tipo local. Limitado a ámbito de método. Requiere inicialización. No en campos/parámetros/retorno. | `var msg = "activo";` // tipo `String`. `var list = new ArrayList<String>();` |
| **Ámbito & Scope** | Visibilidad por bloque `{}`. Shadowing no recomendado. | `int x = 1; if(true){ int x = 2; }` // Error de compilación. |
| **`final` & Efectivamente Inmutable** | Inmutabilidad de referencia o valor. Objetos referenciados pueden mutar si no son inmutables. | `final double PI = 3.14;` `final List<String> l = new ArrayList<>(); l.add("x");` // Válido. |
| **Identificadores** | Nombres de variables/clases. Case-sensitive. No inician con número ni keyword. | `int opsCount = 10;` |
| **Comentarios** | Documentación. `//` línea, `/* */` bloque, `/** */` Javadoc. | `/** Ejecuta extracción de datos. @return resultado */` |

---

## 3. CONTROL DE FLUJO, PATRONES
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Condicional** | Ramificación booleana. Cortocircuito `&&`/`||`. | `if(valid && process()) { }` |
| **Switch Moderno** | Expresiones, `yield`, pattern matching, exhaustividad obligatoria en `sealed`. Sin fall-through implícito. | `int r = switch(op) { case "+", "add" -> a+b; case 200 -> 1; default -> throw new IllegalArgumentException(); };` |
| **Bucles Optimizados** | `for` tradicional para índice. `while`/`do-while` por condición. Enhanced `for` para iterables. `forEach` con lambdas (puede ser más lento por allocation). | Preferir bucle clásico en hot paths o `Stream` paralelos si CPU-bound. |
| **Break/Continue/Return/Etiquetas** | `break` sale del bloque. `continue` salta a siguiente iteración. Etiquetas para loops anidados. | `outer: for(...) { for(...) { if(cond) break outer; if(skip) continue; } }` |

---

## 4. POO, MODELADO DE DOMINIO
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Clase/Objeto** | Plantilla vs instancia en heap. Constructor inicializa estado. | `class Agent {}` `Agent a = new Agent();` |
| **Encapsulamiento** | Ocultar estado, exponer comportamiento. Modificadores: `private` < `default` < `protected` < `public`. Inmutabilidad preferida. | `private final UUID id; public UUID id() { return id; }` |
| **Herencia vs Composición** | Herencia única, fuerte acoplamiento. Composición: delegar, bajo acoplamiento, flexible. | Preferir `Agent` tiene `Weapon` sobre `Agent extends Weapon`. |
| **`super`/`this`** | Referencia a padre/instancia actual. | `super.init(); this.deploy();` |
| **Polimorfismo** | Múltiples formas. Overloading (mismo nombre, distinta firma) vs Overriding (redefinir método padre con `@Override`). | `@Override void execute() { super.execute(); log(); }` |
| **Clase Abstracta** | No instanciable. Puede tener estado y métodos concretos. | `abstract class Op { abstract void run(); void log(){} }` |
| **Interfaz & `default`** | Contrato puro. Múltiple implementación. Java 8+: `default`/`static` métodos permiten evolución sin romper clientes. | `interface Intel { void analyze(); default void log(){ System.out.println(this); } }` |
| **`enum`** | Tipo seguro de constantes. Soporta campos/métodos/constructores. | `enum Rank { ALPHA(1), BETA(2); private int level; Rank(int l){this.level=l;} }` |
| **Records (Java 16+)** | Clases inmutables de datos. Genera `equals`, `hashCode`, `toString`, accessors compactos. Constructor canónico para validación. | `record User(String name, int age) { public User { if(age<0) throw... } }` |
| **Sealed Classes (Java 17+)** | Jerarquía cerrada. Control total de subtipos con `permits`. Exige exhaustividad en pattern matching. | `sealed interface Event permits Login, Logout {}` |
| **`equals/hashCode` Contract** | Si `equals` true → `hashCode` debe ser igual. Clave para `HashMap`/`HashSet`. Usar campos inmutables. | `Objects.hash(name, age)` vs `31 * result + name.hashCode()`. |

---

## 5. EXCEPCIONES, RESILIENCIA
| Concepto | Definición Directa |  Nota |
|----------|-------------------|----------------------|
| **Jerarquía** | `Throwable` → `Error` (JVM, no capturar) → `Exception` → `RuntimeException`. | `try { risky(); } catch(IOException e) { log(e); }` |
| **Checked vs Unchecked** | Checked: obligatorias (`throws`). Unchecked: `RuntimeException` y subclases, no obligatorias. Moderno: favorecer unchecked. | `throws FileNotFoundException` vs `IllegalArgumentException` por validación. |
| **Try-with-Resources** | Cierre automático de `AutoCloseable`. Orden inverso de declaración. | `try(var con = ds.getConnection(); var ps = con.prepareStatement(sql)) { }` |
| **Multi-Catch & Suppressed** | Captura múltiples tipos en uno. `finally` puede ocultar excepciones originales → usar `addSuppressed()`. | `catch (IOException | SQLException e) { log(e); }` `primary.addSuppressed(secondary);` |
| **Custom Exceptions** | Extender `Exception` o `RuntimeException`. Incluir contexto. Stack trace deshabilitable si costoso. | `class OpsException extends RuntimeException { public OpsException(String m) { super(m); } }` |
| **`finally`** | Ejecución garantizada. Usado si no hay try-with-resources. Cuidado: puede enmascarar excepciones. | `finally { cleanup(); }` |

---

## 6. COLECCIONES, GENÉRICOS
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Framework Collections** | Estructuras reutilizables. Raíz: `Collection`, `Map`. | `List<String> agents = new ArrayList<>();` |
| **List** | Ordenada, permite duplicados. `ArrayList` (O(1) acceso, cache-friendly), `LinkedList` (O(1) inserción/remoción en medio). | `list.get(0); list.add(x);` |
| **Set** | Único, sin orden garantizado. `HashSet` (O(1)), `LinkedHashSet` (orden inserción), `TreeSet` (orden natural, O(log n)). | `Set<String> ids = new HashSet<>();` |
| **Map** | Pares clave-valor. `HashMap` (O(1)), `LinkedHashMap` (orden inserción), `TreeMap` (ordenado, O(log n)). Collisiones: lista→árbol (Java 8+). | `map.put("A", 1); map.get("A");` |
| **Queue/Deque** | FIFO/LIFO. `ArrayDeque` recomendado (no thread-safe, más rápido que `LinkedList`). | `queue.offer(x); queue.poll();` |
| **Generics & Erasure** | Seguridad de tipos en compilación. Tipos borrados a `Object` en runtime. No `new T[]`. | `public <T> T process(T data) { return data; }` |
| **Wildcards PECS** | Producer `extends` (solo lectura), Consumer `super` (solo escritura), `?` desconocido. | `void copy(List<? extends Number> src, List<? super Number> dest)` |
| **Inmutabilidad & Fail-Fast** | `List.of()`, `Map.of()`, `Collections.unmodifiable...`. Iterador lanza `ConcurrentModificationException` si mutas durante iteración. | `var locked = List.of("A","B");` // `UnsupportedOperationException` si mutas. |

---

## 7. STREAMS, PROGRAMACIÓN FUNCIONAL
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **FunctionalInterface** | Interfaz con exactamente un método abstracto. Anotación `@FunctionalInterface` opcional pero recomendada. | `@FunctionalInterface interface Action { void run(); }` |
| **Lambdas** | Funciones anónimas. Sintaxis `(params) -> expr`. Capturan variables efectivamente final. | `Runnable r = () -> System.out.println("go");` |
| **Method References** | Referencia directa a método existente. `::` operador. | `list.forEach(System.out::println);` `String::valueOf` |
| **Stream API** | Pipeline funcional sobre colecciones. Evaluación perezosa (lazy). Origen → Intermedias → Terminal. | `list.stream().filter(x->x>5).map(String::valueOf).toList();` |
| **Operaciones Intermedias vs Terminales** | Intermedias: `filter`, `map`, `sorted`, `distinct` (lazy). Terminales: `collect`, `reduce`, `forEach`, `count` (eager, cierra stream). | `Optional<Double> avg = nums.stream().mapToDouble(d->d).average();` |
| **Stateful vs Stateless** | Stateless: `map`, `filter` (procesan elemento a elemento). Stateful: `sorted`, `distinct`, `limit` (requieren buffering completo). | Stateful rompe paralelismo eficiente si dataset grande. |
| **`Optional`** | Contenedor nulo explícito. No usar como campo/parámetro/retorno de colecciones. | `Optional.ofNullable(x).orElseThrow(() -> new IllegalStateException())` |
| **Parallel Streams** | División automática en ForkJoinPool. Útil para CPU-bound. Cuidado con estado compartido y overhead de threading. | `list.parallelStream().filter(...).count();` |
| **Collectors** | Acumulación a estructuras. `groupingBy`, `toSet`, `joining`, `reducing`, `partitioningBy`. | `Collectors.groupingBy(x->x.type, Collectors.counting())` |

---

## 8. CONCURRENCIA, PARALELISMO
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Thread/Runnable/Callable** | Hilo nativo OS. `Runnable` sin retorno. `Callable` con retorno + excepción + `Future`. | `new Thread(() -> task()).start();` `executor.submit(() -> 42).get()` bloquea hasta resultado. |
| **ExecutorService** | Pool de hilos gestionado. Reemplaza creación manual. Tipos: `Fixed`, `Cached`, `Scheduled`, `WorkStealing`. | `var pool = Executors.newFixedThreadPool(4); pool.submit(task); pool.shutdown();` |
| **Synchronized vs Locks** | `synchronized` (monitor, reentrante, simple, optimizado por JVM). `ReentrantLock` (tryLock, fairness, interruptible, granular). | Preferir `ReentrantLock` si necesitas tryLock/fairness. `synchronized` suficiente para casos simples. |
| **`volatile` vs Atomic** | `volatile`: visibilidad inmediata entre hilos, no atomicidad compuesta. `AtomicInteger/Long/Reference`: CAS sin bloqueo. | `volatile boolean stop = false;` `count.incrementAndGet()` |
| **Locks (JUC)** | Control granular. `ReentrantLock`, `ReadWriteLock`, `StampedLock` (optimista). Try-finally obligatorio para unlock. | `lock.lock(); try { } finally { lock.unlock(); }` |
| **Atomic Classes** | Operaciones sin bloqueo vía Compare-And-Swap (CAS). `AtomicInteger`, `AtomicReference`, `LongAdder` (alta contención). | `AtomicInteger count = new AtomicInteger(); count.incrementAndGet();` |
| **`CompletableFuture`** | Composición asíncrona. `supplyAsync`, `thenApply`, `thenAccept`, `exceptionally`, `handle`, `allOf`/`anyOf`. | `cf.thenApplyAsync(res -> process(res), customExecutor).exceptionally(log)` |
| **Virtual Threads (Java 21+)** | Hilos ligeros gestionados por JVM (MB→KB por hilo). I/O blocking no consume hilo OS. Ideal masivo I/O. Detectar pinning (synchronized/JNI/bloqueos nativos). | `Executors.newVirtualThreadPerTaskExecutor().submit(() -> blockingIO())` `Thread.startVirtualThread(() -> task())` |
| **Structured Concurrency (Java 21+)** | Alcance léxico de tareas. `ShutdownOnFailure`, `ShutdownOnSuccess`. Cancelación propagada automáticamente. | `try(var scope = new StructuredTaskScope.ShutdownOnFailure()) { scope.fork(t1); scope.join(); scope.throwIfFailed(); }` |
| **Concurrent Collections** | Thread-safe sin `synchronized` externo. `ConcurrentHashMap`, `CopyOnWriteArrayList`, `BlockingQueue`, `ConcurrentLinkedQueue`. | `CHM.computeIfAbsent(key, k -> expensiveInit())` |

---

## 9. I/O, NIO, SERIALIZACIÓN
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Stream I/O (Legacy)** | Bytes (`InputStream/OutputStream`). Bloqueante. | `Files.copy(src, dest);` |
| **Reader/Writer** | Caracteres (UTF-8 por defecto en Java 18+). | `Files.writeString(path, text);` |
| **NIO.2 (`java.nio`)** | `Path`, `Files`, `Channels`, `Buffers`. No bloqueante opcional con `Selector`. | `Files.walk(dir).filter(Files::isRegularFile).forEach(System.out::println);` |
| **Buffered I/O** | Caché en memoria. Reduce llamadas al SO. | `new BufferedReader(new FileReader("log.txt"));` |
| **Memory-Mapped Files** | `FileChannel.map()` mapea archivo a memoria virtual. Alto rendimiento para lectura masiva/aleatoria. | `MappedByteBuffer buf = channel.map(MapMode.READ_ONLY, 0, size);` |
| **Serialización Java** | Convertir objeto a bytes. Implementar `Serializable`. Genera `serialVersionUID`. | `ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.ser")); out.writeObject(agent);` |
| **Riesgos Serialización** | Inseguro por defecto. Expone estructura interna, permite ejecución arbitraria. Reemplazar por JSON/Protobuf. | No deserializar datos externos sin filtro de clases (`ObjectInputFilter`). Usar `readResolve()` para validación. |

---

## 10. JVM, MEMORIA
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Heap** | Memoria de objetos. Dividida en Young (Eden, S0, S1) → Old Generations. | `-Xmx4g` limita tamaño máximo. `-XX:NewRatio=2` controla proporción young/old. |
| **Stack** | Memoria por hilo. Variables locales, frames de llamada. Tamaño fijo por defecto (~1MB). | `StackOverflowError` en recursión infinita. `-Xss256k` ajusta tamaño. |
| **Metaspace** | Almacena metadatos de clases (reemplaza PermGen). Nativa, crece dinámicamente. | `OutOfMemoryError: Metaspace` si carga excesiva. `-XX:MaxMetaspaceSize=256m` |
| **GC Algorithms** | G1 (default, balanceado), ZGC/Shenandoah (baja latencia <1ms), Generational ZGC (Java 21+, young/old separado). | `-XX:+UseGenerationalZGC -XX:MaxGCPauseMillis=50` |
| **Memory Leaks** | Referencias olvidadas impiden GC: listeners no removidos, caches sin TTL, `ThreadLocal`, static collections. | Profiling con `jmap`, `jfr`, `async-profiler`, heap dumps. |
| **JIT Optimizations** | Inlining, escape analysis (stack allocation), loop unrolling, scalar replacement. | `-XX:+PrintInlining` para diagnóstico. Evitar reflection masivo en hot paths. |
| **Tuning Flags Clave** | `-Xms`/`-Xmx` (heap), `-XX:+UseG1GC`/`ZGC`, `-XX:MaxRAMPercentage`, `-XX:+AlwaysPreTouch`, `-XX:+HeapDumpOnOutOfMemoryError`. | En contenedores: `-XX:MaxRAMPercentage=75.0` para respetar cgroups. |

---

## 11. ANOTACIONES
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Reflection** | Inspección/manipulación de clases/métodos/campos en runtime. Penaliza rendimiento, rompe encapsulamiento. | `Method m = obj.getClass().getMethod("run"); m.invoke(obj);` |
| **Anotaciones** | Metadata compilada. Procesadas por APT (compile-time) o reflection (runtime). | `@Override`, `@Deprecated`, `@SuppressWarnings`, `@FunctionalInterface` |
| **Retention/Target** | `@Retention(SOURCE/CLASS/RUNTIME)` controla visibilidad. `@Target(TYPE/METHOD/FIELD...)` restringe uso. | `@Retention(RUNTIME) @Target(TYPE) public @interface Ops {}` |
| **Processors (APT)** | Generación de código en compilación (Annotation Processing Tool). | Lombok, MapStruct, Dagger, Micronaut usan APT. |

---

## 12. FRAMEWORKS
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Maven** | Gestión de dependencias XML. Ciclo de vida estricto: `clean compile test package install deploy`. | `mvn clean verify -DskipTests=false` |
| **Gradle** | Build scripts (Groovy/Kotlin DSL). Incremental, rápido, flexible. | `gradle build test publish` |
| **Classpath/Modulepath** | Rutas de búsqueda de clases/jars. JPMS usa modulepath con encapsulación fuerte. | `-cp libs/*:config/` vs `--module-path mods/` |
| **JPMS (Java 9+)** | Sistema de módulos. `module-info.java` con `requires`, `exports`, `opens`. Encapsulación fuerte por defecto. | `module com.ops.intel { requires java.logging; exports com.ops.api; }` |
| **Shadow/Fat Jar** | Empaquetado con todas las dependencias. | `maven-shade-plugin` o `spring-boot-maven-plugin` |
| **Spring Core/DI** | Inversión de control. `@Component`, `@Bean`, `@Autowired`. Ciclos: `@PostConstruct`, `@PreDestroy`. | Preferir constructor injection. Evitar `@Autowired` en campos. |
| **Spring Boot** | Auto-configuration, starters, externalized config (`application.yml`), actuator (health/metrics). | `@SpringBootApplication` = `@Configuration` + `@EnableAutoConfiguration` + `@ComponentScan` |
| **AOP & Proxies** | Intercepción transversal (logging, tx, security). JDK (interfaces) vs CGLIB (clases). `@Transactional` bypassea en llamadas internas. | Usar `self` inyección o refactorizar para evitar bypass de proxy. |
| **JPA/Hibernate** | ORM. `EntityManager`, dirty checking, caches L1 (persistence context)/L2 (opcional). Problema N+1: `JOIN FETCH` / `@EntityGraph`. | `@Transactional(readOnly=true)` optimiza flush. |
| **HikariCP** | Pool JDBC rápido. Configurar `connection-timeout`, `maximum-pool-size`, `idle-timeout`, `max-lifetime`. | Default en Spring Boot. Ajustar según throughput esperado y límites DB. |
| **Quarkus/Micronaut/Spring Native** | Compile-time DI, GraalVM AOT. Arranque <100ms, footprint <50MB. Ideal serverless/edge. | Trade-off: startup rápido vs reflexión limitada en runtime. |

---

## 13. WEB, APIS
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **HTTP Client (Java 11+)** | Nativo, async, multiplexado, soporta HTTP/2, websockets, redirects, timeouts. | `HttpClient.newHttpClient().send(request, BodyHandlers.ofString())` |
| **REST Controllers** | `@RestController`, `@RequestMapping`, `@PathVariable`, `@RequestBody`, `@Valid`. | Validar entrada con Bean Validation (`@NotNull`, `@Size`, `@Email`). |
| **gRPC & Protobuf** | RPC sobre HTTP/2. Serialización binaria eficiente, contratos estrictos `.proto`, streaming bidireccional. | Alto rendimiento microservicios internos. Genera código tipo-seguro. |
| **JSON Serialization** | Jackson (default Spring), Gson, JSON-B. Configurar `FAIL_ON_UNKNOWN_PROPERTIES`, polimorfismo con `@JsonTypeInfo`. | Validar schema. Evitar deserialización masiva sin límites de profundidad/tamaño. |
| **WebSockets/SSE** | WebSockets: bidireccional, estado, handshake HTTP→TCP persistente. SSE: unidireccional server→client, HTTP compatible, auto-reconnect. | `@ServerEndpoint` vs `SseEmitter`/`Flux`. |
| **AuthN/Z** | JWT (stateless, firma RS256/ES256), OAuth2/OIDC (delegated), Spring Security filters, `@PreAuthorize`, `@RolesAllowed`. | Validar `exp`, `iss`, `aud`. Rotar claves. Usar Vault/AWS SM para secrets. |

---

## 14. TESTING
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **JUnit 5** | Framework estándar. Extensiones, `@Test`, `@ParameterizedTest`, `@Nested`, lifecycle `@BeforeEach/@AfterEach`. | `assertThrows`, `assertAll`, `@DisplayName`, `@Timeout`. |
| **Assertions** | Validaciones. `assertEquals`, `assertTrue`, `assertNotNull`, `assertThrows`, `assertDoesNotThrow`. | `assertThrows(IllegalArgumentException.class, () -> parse(null));` |
| **Mocking (Mockito)** | `@Mock`, `@InjectMocks`, `when().thenReturn()`, `verify()`, `ArgumentCaptor`. Spy para parcial. | No mockear value objects. Mockear solo colaboradores externos (DB, APIs). |
| **Testcontainers** | DB, Kafka, Redis, etc. en Docker efímeros para integration tests. Reutilización de contenedores. | `@Container static PostgreSQLContainer pg = new PostgreSQLContainer<>();` |
| **Integration Tests** | Verifican flujo completo (DB, red, contenedores). `@SpringBootTest`, `@WebMvcTest`, `@DataJpaTest`. | Aislar tests, limpiar estado entre ejecuciones. |
| **Coverage & Quality** | JaCoCo (líneas/ramas/complexidad). SonarQube (code smells, bugs, security hotspots, duplicación). | Objetivo >80% líneas, pero priorizar paths críticos y lógica de negocio. |
| **Property-Based Testing** | Generar datos aleatorios para invariantes. jqwik, QuickTheories. | `forall(strings().filter(s -> s.length()>0), s -> !s.trim().isEmpty())` |

---

## 15. CI/CD
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Build Pipeline** | Lint → Build → Unit Test → Integration Test → Scan → Package → Push → Deploy → Smoke Test. | Fail-fast. Caché dependencias. Artefactos firmados. |
| **Docker & JVM** | Imagen slim (`eclipse-temurin:jre-alpine`). Usuario non-root. JVM aware de cgroups (detecta límites contenedor). | `-XX:MaxRAMPercentage=75.0` en contenedores. Evitar imágenes `latest`. |
| **K8s Probes** | Liveness (reiniciar si colgado), Readiness (tráfico si listo), Startup (arranque lento). | `/actuator/health` endpoint estándar. Configurar `initialDelaySeconds`. |
| **Observability** | OpenTelemetry (traces, metrics, logs unificados). Prometheus + Grafana. Structured logging (JSON). | Correlation ID en headers y logs para tracing distribuido. Mtricas custom de negocio. |
| **Logging Estratégico** | Niveles: ERROR, WARN, INFO, DEBUG, TRACE. Evitar logging en hot paths sin guards. | `if(log.isDebugEnabled()) log.debug("Detalles: {}", data);` |

---

## 16. SEGURIDAD
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **OWASP Java Top 10** | Injection, Broken Auth, Sensitive Data Exposure, XXE, Deserialization, Security Misconfig, XSS, Insecure Logging, Supply Chain. | Validar entrada, output encode, HTTPS, rotate secrets, dependency scanning. |
| **Validación Entrada** | Nunca confiar en datos externos. Sanitizar, validar tipo/longitud/formato. Whitelist > blacklist. | `if(input.length() > 255) throw new OpsException("Too large");` |
| **SQLi/XXE** | `PreparedStatement` para SQL (nunca concatenar). Desactivar DTD externos en XML: `setFeature("http://apache.org/xml/features/disallow-doctype-decl", true)`. | `conn.prepareStatement("SELECT * FROM t WHERE id=?");` |
| **Crypto & Secrets** | `SecureRandom`, `AES-GCM`, `BCrypt`/`Argon2`. Nunca hardcodear. Usar Vault/AWS SM/GCP SM. `char[]` para passwords + `Arrays.fill()` post-uso. | `SecureRandom.getInstanceStrong();` para keys/tokens. |
| **AuthN/Z Best Practices** | JWT: validar `exp`, `iss`, `aud`, firma. OAuth2: PKCE para públicos. Spring Security: `@PreAuthorize`, method security. | Usar `RS256`/`ES256` no `HS256` en producción. Rotar claves periódicamente. |
| **Dependency Scanning** | OWASP Dependency-Check, Snyk, Renovate, Dependabot. SBOM (CycloneDX/SPDX). Artifacts firmados (GPG). | `mvn dependency-check:check` en CI. Rechazar dependencias con CVEs críticos. |
| **SecurityManager** | Deprecado Java 17, eliminado Java 24+. Reemplazar por isolation OS/containers, JPMS strict, SELinux/AppArmor. | No confiar en JVM sandbox para multi-tenant moderno. |

---

## 17. JAVA MODERNO (21-2026) 
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Pattern Matching Everywhere** | `instanceof`, `switch`, records, sealed. Exhaustividad obligatoria en `sealed` + `switch`. | `if (obj instanceof String s && s.length() > 5) { log(s); }` `switch(obj) { case Integer i -> log(i); case String s -> log(s); }` |
| **Scoped Values (Java 21+)** | Reemplazo inmutable de `ThreadLocal`. Propagación segura en virtual threads. No mutable, no leakage. | `ScopedValue<String> USER = ScopedValue.newInstance(); ScopedValue.where(USER, "admin").run(() -> process())` |
| **Foreign Function & Memory API** | Acceso nativo sin JNI. `MemorySegment`, `Arena` (auto-gestión), `Linker`, `SymbolLookup`. Seguro, predecible. | Carga librerías C con gestión de memoria segura. Reemplaza `Unsafe`/JNI. |
| **String Templates (Java 21+)** | Interpolación segura en compilación. `STR`, `FMT`, `RAW`. Previene injection. | `String sql = STR."SELECT * FROM users WHERE id = \{id}";` |
| **Sequence Collections (Java 22+)** | `SeqList`, `SeqMap`. Iteración estable, compactación, inmutabilidad por defecto. Mejor rendimiento que wrappers. | Reemplazo moderno para colecciones inmutables con mejor cache locality. |
| **Generational ZGC** | Separa young/old en ZGC. Reduce pausas y overhead de GC en workloads mixtos. Default en muchas distros 21+. | `-XX:+UseGenerationalZGC` |
| **JEP Lifecycle** | Draft → Candidate → Proposed to Target → Integrated (Release). Preview requiere `--enable-preview` (solo staging/testing). | No usar preview en producción. Seguir [openjdk.org/jeps](https://openjdk.org/jeps). |

---

## 18. COMUNICACIÓN
| Concepto | Definición Directa | Nota |
|----------|-------------------|----------------------|
| **Trade-off Framework** | Siempre: Pros, Contras, Cuándo usar, Cuándo evitar. Contexto > regla absoluta. | "ArrayList para lectura frecuente (cache locality), LinkedList para inserción/remoción en medio. Hoy, `ArrayList` gana en la mayoría de casos reales." |
| **Preguntas Trampa Comunes** | String pool, `equals/hashCode`, `volatile` vs `synchronized`, checked/unchecked, `final` semantics, stream lazy, GC pauses, N+1, proxy bypass, autoboxing overhead. | Preparar explicación concisa + ejemplo de fallo real + cómo lo detectaste/arreglaste. |
| **System Design Básico** | CAP theorem, consistencia eventual, caching (write-through/back/aside), partitioning, load balancing, idempotencia, circuit breaker, retry con backoff. | Dibujar flujo: Client → LB → Service → Cache → DB → MQ. Justificar cada decisión. |
| **Debugging Workflow** | Reproducir → Aislar → Logs/Metrics → Profiler → Fix → Test → Deploy → Monitor. No adivinar. Datos > intuición. | Herramientas: `jfr`, `async-profiler`, thread dumps, heap dumps, `jstack`, `jmap`. |
| **Behavioral (STAR)** | Situación, Tarea, Acción, Resultado. Enfocar ownership, aprendizaje, impacto medible (métricas). | "En migración a Java 21, redujimos latencia p99 40% con Virtual Threads. Documenté patrón, traineé equipo, rollout gradual sin downtime." |
| **Code Review Focus** | Legibilidad, testabilidad, seguridad, rendimiento, mantenibilidad. Evitar micro-optimizaciones prematuras. Preguntar, no imponer. | "¿Es thread-safe? ¿Maneja nulls/edge cases? ¿Tiene tests? ¿Cumple SLA? ¿Se puede leer/mantener en 6 meses?" |
| **Comunicación Técnica** | Estructura lógica: problema → opciones → decisión → trade-offs. Humildad técnica: "no sé, pero lo investigo". Enfoque en resolución. | Evitar jerga innecesaria. Adaptar nivel al interlocutor (junior vs staff vs PM). |

---

## 19. CHECKLIST
### Preparación Técnica
1. **Repaso Rápido:** POO, Colecciones, Streams, Concurrencia, JVM Memory, GC, Excepciones.
2. **Práctica Código:** Resolver problemas con `Stream`, `CompletableFuture`, `VirtualThreads`, `Records`, pattern matching.
3. **Entrevista Técnica:** Explicar trade-offs con contexto, dibujar arquitectura, escribir código limpio bajo presión (sin IDE si es necesario).
4. **Debugging Demo:** Leer thread dump, analizar heap dump, identificar bottleneck, proponer fix medible.
5. **Modern Java:** Dominar Java 21 features. Saber qué es preview vs standard vs incubating.
6. **Frameworks:** Spring Boot basics, JPA pitfalls (N+1, lazy loading), HikariCP tuning, Testing strategy (unit/integration/e2e).
7. **Seguridad:** Validar input, manejo secretos, OWASP Top 10, JWT validation, dependency scanning.
8. **Deploy:** Docker JVM tuning, K8s probes, CI/CD pipeline, observability basics (logs/metrics/traces).

### Despliegue
1. **Compilación:** `javac -d out -cp libs/* src/**/*.java` / `mvn clean compile`
2. **Empaquetado:** `jar cvf app.jar -C out .` / `mvn package -DskipTests` / Gradle `build`
3. **Ejecución:** `java -cp app.jar:libs/* com.ops.Main` / `java -jar app.jar`
4. **Perfilado:** `jvisualvm`, `jfr startrecording --duration 60s`, `async-profiler start -e cpu -d 30 -f profile.html <pid>`
5. **Tuning JVM:** `-Xms1g -Xmx2g -XX:+UseGenerationalZGC -XX:MaxRAMPercentage=75.0 -XX:+AlwaysPreTouch -XX:+HeapDumpOnOutOfMemoryError`
6. **Auditoría:** `jdeps --check-deps app.jar`, `mvn dependency:tree`, `dependency-check:check`, `jlink --strip-debug`
7. **Hardening:** Desactivar reflexión innecesaria, límites `Metaspace`, usar JPMS, no root en containers, secrets en vault, deshabilitar endpoints sensibles en prod.
8. **Comunicación:** STAR para behavioral, estructura lógica para technical, humildad técnica, enfoque en resolución, código limpio bajo presión.
9. **Mantenimiento:** Seguir JEPs, leer changelogs, practicar refactoring, mantener portfolio actualizado, ejecutar pruebas bajo carga, dominar base + adoptar moderno.
10. **Post-Mortem:** Documentar incidentes, root cause, acciones correctivas, lecciones aprendidas. Compartir conocimiento.

---
