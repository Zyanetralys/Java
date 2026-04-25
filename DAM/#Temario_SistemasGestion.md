# RESUMEN DE SISTEMAS DE GESTIÓN EMPRESARIAL

## 1. IDENTIFICACIÓN DE SISTEMAS ERP-CRM

### 1.1 Conceptos Básicos
- **Informática**: Conjunto de conocimientos y técnicas para el tratamiento automático de información mediante computadoras (RAE).
- **Gestión empresarial**: Actividad interna para mejorar productividad en calidad, tiempos, adquisición de clientes, márgenes, seguridad, competitividad, etc.
- **Sistemas de gestión empresarial**: Software para manejar, controlar y definir actividad empresarial mediante tratamiento de información, visando mejorar rendimiento y productividad.
- **Objetivo**: Visión global de la empresa, comprensión de procesos como conjunto, toma de decisiones acertadas.
- **Sistemas típicos**: ERP (planificación de recursos) y CRM (gestión de relaciones con clientes).

### 1.2 ERP (Enterprise Resource Planning)
- **Definición**: Software modular que gestiona toda la información de una empresa, mejorando rendimiento, operatividad y eficiencia interna/externa, automatizando procesos para mayor control operativo y mejora de relaciones con clientes/proveedores y conocimiento de mercado.
- **Objetivos**: Planificar/automatizar procesos, centralizar información, facilitar tareas, compartir datos entre departamentos, acceso rápido, control interno, mejorar CRM, gestionar áreas específicas (finanzas, logística, producción, contabilidad).
- **Propiedades**:
  - *Integración*: Abarca mayoría de áreas (comercial, logística, producción, contabilidad, etc.).
  - *Modularidad*: Cada módulo gestiona un área; se añaden/eliminan según necesidades.
  - *Adaptabilidad*: Se ajusta a requerimientos específicos de cada empresa.
- **Funcionalidades modernas**: E-commerce, CRM, SCM (cadena de suministro), SRM (proveedores), BI (inteligencia negocio), KM (base conocimiento), PRM (socios), PLM (ciclo vida producto).
- **Nota**: CRM a veces se considera módulo interno del ERP o componente externo.

### 1.3 ERP Actuales
- **Clasificación**: Licencia privativa (pago) vs. Licencia libre (código abierto).
- **SAP** (Alemania, 1972):
  - *Business Suite*: Versátil, interactúa componentes, crea módulos, conecta externos. 6 módulos: ERP, CRM, SRM, SCM, PLM, BI.
  - *SAP ERP*: Módulos: SD (ventas), AA (activos), MM (materiales), PP (producción), WM (almacenes), QM (calidad), FI (financiera), HR (RRHH). Versión estable: 6.0.
  - *S/4 HANA*: ERP para grandes empresas (2015), optimizado para BD en memoria SAP HANA y nube.
  - *Business All-in-One*: Para medianas, arquitectura modular, incluye ERP+CRM+BI+NetWeaver, Windows.
  - *Business One*: Para PYMES, integración Microsoft Office, rápido, Windows/Mac/Linux.
  - *Business ByDesign*: PYMES, coste asequible, intuitivo, aplicaciones online, Windows.
- **Oracle**:
  - *Oracle ERP Cloud*: SaaS privativo, nube. Módulos: finanzas, compras/ventas, proyectos, rendimiento, cadena suministros, análisis.
- **Microsoft**:
  - *Microsoft Dynamics*: ERP+CRM integrado en Business Solutions, compatible Office 365/Outlook/Azure, solo Windows.
- **OpenBravo** (España, Univ. Navarra, 90s):
  - *Commerce Cloud*: Para medianas minoristas, ERP+CRM+BI.
  - *POS*: Punto venta hotelero/comercial, integrado con ERP.
- **Odoo** (Bélgica, 2005, origen TinyERP/OpenERP):
  - Licencia LGPLv3 (libre) + módulos privativos. Único ERP español con gran implantación.
  - Módulos: proyectos, contabilidad, inventario, RRHH, ventas/compras, marketing, almacenes.
  - Arquitectura cliente-servidor: servidor Python, cliente XML-RPC. Desde v6 en nube. Versión manual: 13.0.
  - *Comparativa OpenBravo vs Odoo*: Tecnología (Java/JS vs Python), Arquitectura (WAD/MDD vs MVC/PostgreSQL), Licencia (Mozilla vs GPL), Cliente (Solo Web vs Web/Desktop), Rendimiento (Menor vs Mayor), Personalización (Complicada vs Sencilla).
- **Factores elección ERP**:
  - *Funcionales*: Soporte a áreas, facilidad/rapidez, estándares, migración/adaptación sencilla, informes/análisis/seguridad.
  - *Técnicos*: Compatibilidad hardware/software, SO requerido, BD obligatorias, experiencia/implantación.
  - *Otros*: Formación, garantía, ciclo vida, soporte, mantenimiento.
- **Ventajas ERP**: Adaptable, consistencia datos, tiempo real, elimina redundancia, eficiencia, control interno/externo, reduce ciclos.
- **Desventajas ERP**: Costoso (tiempo/dinero), requiere aprendizaje, cambios estructurales exigen modificación ERP, dificultades integración, fallos difíciles de revertir, desconfianza ante cambios metodológicos.

### 1.4 CRM (Customer Relationship Management)
- **Definición**: Software asociado a ERP centrado en estrategia de negocio enfocada al cliente. Respuesta del sistema a requisitos empresariales sobre clientes.
- **Características**: Visión centrada en cliente; procesos diseñados para mejorar relación; incorpora mecanismos para relaciones duraderas/satisfactorias.
- **Departamentos clave**: Ventas, Marketing, Atención al cliente.
- **Lógica operacional**: Automatización ventas/productos/clientes, automatización marketing/campañas, gestión soporte/atención, organización call center, métricas negocio.
- **Lógica analítica**: Analizar información para campañas, indicadores estado empresa, modificación estrategias según cambios.
- **Estructura**: Dos partes diferenciadas: lógica operacional (organizar/automatizar/gestionar) y lógica analítica (analizar información).

### 1.5 CRM Actuales
- **Categorías**:
  - *Integrados en ERP*: SAP CRM, Oracle CRM, Microsoft Dynamics CRM.
  - *Exclusivos*: Independientes, compatibles con ERP ajenos. Uso en declive.
- **SugarCRM** (EEUU): Web, LAMP. v6.0 libre; posteriores privativas (Enterprise, Professional, Ultimate).
- **SuiteCRM**: Código abierto, surgido tras cierre open source de SugarCRM. PHP. Módulos: meetings, empleados, oportunidades, campañas marketing, calendario, llamadas.

### 1.6 Data Warehouse (Almacenes de Datos)
- **Definición**: Almacén que reúne información de organización/empresa para toma de decisiones. Clave de Business Intelligence. Expediente con info transaccional/operacional en BD diseñada para análisis.
- **Características**: Se divide en unidades lógicas llamadas Data Mart.
- **Funciones**:
  1. Integrar datos de BD distribuidas para descripción global/análisis comprensivo.
  2. Separar datos operativos cotidianos para publicación y apoyo a decisiones.

### 1.7 Data Warehouse Actuales e Implantación
- **Sistemas**:
  - *Teradata* (Privativo): Diferencia info fría/caliente.
  - *Oracle 12c* (Privativo): Escalable, alto rendimiento, optimizado.
  - *Amazon Web Service* (Privativo): Estándar SQL.
  - *Cloudera* (Open Source): Sin servicio mantenimiento oficial.
- **Fases Implantación**:
  1. Definición objetivos.
  2. Definición requerimientos información.
  3. Diseño/modelización (fuentes, transformaciones, modelo lógico → físico, estructura almacenamiento).
  4. Implementación (extracción/transformación, carga validada, explotación via query&reporting/minería datos).
  5. Revisión (actualización/potenciación).
  6. Formación (prácticas/afianzamiento conceptos).
- **Metodología SAS**: Rapid Warehousing Methodology.

### 1.8 Compatibilidad SO
- **ERP**: SAP (Win/Linux/Mac), MS Dynamics (Win), Oracle (Win/Linux), OpenBravo (Win/Linux/Mac), Odoo (Win/Linux/Android/Mac).
- **CRM**: SugarCRM (Win/Solaris/Mac), SuiteCRM (Win/Linux/Mac).

### 1.9 SGBD Compatibles
- **Problemática**: Respuesta lenta por info repartida en módulos; dificulta análisis/reportes.
- **Solución**: Data Warehouse centralizado para consultas analíticas.
- **Requisitos Hardware**: Alto rendimiento, escalabilidad, arquitectura abierta.
- **Requisitos Software**: SGBD relacional o multidimensional. Mejor opción: **multidimensional** (escalabilidad, prestaciones, consolidación, menos recursos hardware para consultas complejas).
- **Herramientas extracción/manipulación**: Control tiempo respuesta, acceso multi-tecnología, gestión ETL integrada, manejo excepciones/logs.

### 1.10 Configuración y 1.11 Verificación (Ejemplo Odoo)
- **SO soportados**: Linux (paquetes Debian oficiales/RedHat no oficiales), Windows (autoinstalable). Clientes: Win/Linux/iOS.
- **BD recomendada**: PostgreSQL.
- **Instalación PostgreSQL**:
  1. Descargar en http://www.postgresql.org/download/
  2. Windows: ejecutar instalador.
  3. Debian: `apt-get install postgresql` + `apt-get install pgadmin3`
  4. Ejecutar pruebas.
- **Pruebas BD (PgAdmin III)**:
  1. Abrir PgAdmin III.
  2. Comprobar BD existente.
  3. Crear nueva tabla.
  4. Insertar datos.
  5. Buscar elementos.
  6. Modificar datos.
  7. Eliminar tabla.
  8. Crear nueva tabla.
  9. Importar datos.
  10. Listar todos los datos.
  11. Eliminar tabla.
  12. Repetir pasos desde cliente texto `psql` (SQL Shell).
- **Pruebas SO (Local)**:
  1. Seleccionar navegador.
  2. Conectar a página web.
  3. Ping a dirección tarjeta instalada.
  4. Telnet puerto 5432 dirección tarjeta.
  5. Ping localhost (127.0.0.1).
  6. Telnet puerto 5432 localhost.
  7. Ping nombre DNS equipo.
  8. Ping dirección tarjeta desde equipo en red.
- **Pruebas SO (Remoto)**:
  1. Ping nombre equipo desde otra máquina misma red.
  2. Repetir pasos desde redes externas para validación acceso remoto.

## 2. INSTALACIÓN Y CONFIGURACIÓN ERP-CRM

### 2.1 Tipo de Licencia
- **Definición**: Contrato propietario-usuarios que especifica obligaciones, normas uso, modificación y distribución.
- **Clasificación por código**:
  - *Abierta*: Permisivas (sin límite), Robustas (limitaciones: fuertes=distribuir igual, débiles=distribuir similar/licencia distinta como Mozilla).
  - *Cerrada/Propietaria*: Restricciones altas.
  - *Dominio público*: Sin propietario.
- **Clasificación por coste**:
  - *Freeware*: Gratuito.
  - *Payware*: Pago obligatorio.
  - *Shareware*: Prueba temporal, luego pago.

### 2.2 Tipo de Instalación
- **Monopuesto**: BD, gestor e interfaz en mismo PC. Acceso físico requerido. Ideal desarrollo/aprendizaje.
- **Cliente/Servidor**: Datos/gestión en servidor; acceso via cliente instalado. Flexible, buena administración, riesgo fallo comunicaciones.
- **Cliente/Servidor Web**: Interfaz web estándar. Acceso via navegador. Sin instalación cliente previa.
- **Cloud Computing**: Hardware/gestión externo. Terminal remota.
  - *SaaS*: Proveedor gestiona plataforma/software (ej. Google Drive). Más sencillo.
  - *IaaS*: Cliente gestiona infraestructura bajo nivel (RAM, disco, SO, backups).
  - *PaaS*: Intermedio. Cliente gestiona desarrollo/plataforma sin acceso bajo nivel hardware.

### 2.3 Proceso Instalación (Odoo Windows Monopuesto)
1. Web Odoo Community: https://www.odoo.com/es_ES/page/community
2. Descargar versión Community para Windows (datos generales requeridos).
3. Ejecutar instalador.
4. Seleccionar idioma (v13: inglés/francés).
5. Next en bienvenida.
6. Aceptar términos.
7. Seleccionar componentes: "All in One" (todos por defecto).
8. Configurar puerto, usuario, contraseña BD.
9. Seleccionar directorio instalación.
10. Ejecutar instalación (minutos).
11. Next → Finish.

### 2.4 Módulos y Configuración
- **Módulos comunes**: Compras, ventas, marketing, finanzas/contabilidad, RRHH, inventario, cadena suministro.
- **Configuración**: Parametrización inicial crítica. Define flujos trabajo, usuarios/permisos, reglas negocio.
- **Gestión usuarios**: Crear/eliminar usuarios, control acceso, seguridad. Solo administrador tiene acceso total.
- **Actualización**: Nuevas versiones (mejoras), parches (seguridad/bugs). Mantener sistema estable.

### 2.5 Acceso, Datos y Entornos
- **Acceso físico**: Restringido a personal autorizado, registros controlados.
- **Acceso lógico**: Credenciales privadas, permisos por módulo (ej. almacén no ve RRHH).
- **Gestión datos**: Copias seguridad/restore via cliente web o PGAdmin. Contraseña admin requerida.
- **Entornos**:
  - *Desarrollo*: Evolución sin afectar operación.
  - *Pruebas*: Verificación (errores, requisitos, carga datos, permisos módulos, seguridad).
  - *Explotación*: Funcional, integración rutina diaria, mantenimiento continuo.

## 3. ORGANIZACIÓN Y CONSULTA DE INFORMACIÓN

### 3.1 Bases de Datos
- **Modelo relacional**: Tablas (filas=registros, columnas=atributos). Más usado en ERP-CRM.
- **Propiedades**: Integridad (sin redundancia), compartición, seguridad, protección fallos.
- **Conceptos**:
  - *Dato*: Unidad mínima info.
  - *Campo/Atributo*: Columna.
  - *Fila/Registro*: Conjunto atributos.
  - *Tabla*: Estructura mínima, registros relacionados.
  - *Vista*: Muestra info específica repartida en tablas.
  - *Relación*: Condiciones/restricciones datos (clave primaria, foránea).
  - *Consulta*: Extracción controlada con permisos y control concurrencia.
  - *Informe*: Consulta simplificada para análisis/impresión.
  - *Formularios*: Pantallas manejo datos (basadas en vistas).
  - *Procedimientos almacenados*: Órdenes ejecutables almacenadas en BD.
- **Niveles diseño**: Físico (almacenamiento bytes/ficheros), Lógico/Conceptual (tablas/restricciones/esquema), Externo (vistas para usuarios específicos).

### 3.2 Definición Campos (Odoo)
- Acceso: Ajustes → Activar modo desarrollador → Técnico → Campos.
- Permite crear/modificar/eliminar campos. Campos: nombre, modelo/tabla, tipo (entero, booleano, fecha, etc.).

### 3.3 Tablas y Vistas
- **Modelos**: Listado via Ajustes → Técnico → Modelos. Crear/importar (CSV).
- **Vistas**: Ajustes → Técnico → Vistas. Tipos:
  - *Formulario*: Ingreso/edición registro.
  - *Árbol*: Listado registros existentes.
  - *Búsqueda*: Panel filtrado/superior.
  - *Gráfico*: Representación visual datos.

### 3.4 Interfaces y Procesos
- **Contactos (v13)**: Módulo Contactos. Crear → Formulario (particular/empresa) → Guardar. Ejercen como cliente/proveedor según operación.
- **Productos**: Módulo Ventas → Productos → Crear. Campos: nombre, tipo (consumible/almacenable/servicio), precio venta/coste, categorías. Guardar.
- **Almacén**: Estructura basada en Ubicaciones y Almacenes.
  - *Ubicaciones*: Físicas (estructura), Socios (stock vendido/comprado), Virtuales (tránsito fases). Tipos: Vista (organización), Clientes/Proveedores (salida/entrada), Interno (stock), Inventario (correcciones), Producción (material base), Procurement (compraventa), Tránsito (multisede).
  - *Almacén*: Agrupa ubicaciones (entrada, salida, stock).
  - *Configuración*: Crear ubicaciones padre → definir almacenes → asignar entrada/salida/stock → modelar tiendas → añadir categorías/productos/proveedores → crear stock inicial → reglas abastecimiento.
  - *Uso*: Traspaso almacén general → tienda via albarán interno (origen, destino, cantidad, validar) → crear compra/factura.
  - *Informes*: Análisis movimiento (traspasos), análisis inventario (distribución).

### 3.5 Informes y Listados
- Filtros/agrupaciones según necesidad.
- Tipos listado: Bloques (info general) vs Lista técnica (comparable/detallada).
- Compras/Ventas: Documentación procesos, vista gráfica análisis.

### 3.6 Cálculos y Contabilidad
- **Pedidos/Ventas**: Módulo Ventas → Pedidos → Guardar (cliente, producto, plazo pago, unidades).
- **Albaranes**: Justificante entrega. Tipos: Entrada (recepción), Salida (almacén), Externos (movimiento entre almacenes/ubicaciones).
- **Facturas**: Justificante pago. Gestión clientes/proveedores/facturas externas (diario, proveedor, referencia, importe).
- **Asientos contables**: Apuntes movimiento contable. Manual/automático. Operaciones: Asentar (validar), Conciliación.
- **Informes contables**: Libro mayor, balance sumas/saldos, ganancias/pérdidas, hoja balance (PDF). Diarios, modelos Hacienda (340, 347, 349).
- **Cierre fiscal**: Contabilidad verificada, inventario físico, amortizaciones, ajustes cuentas, impuesto sociedades, asientos consecutivos. Cierre: crear apertura/cierre, movimientos pérdidas/ganancias, validar, confirmar.
- **Devoluciones**: Factura no pagada → eliminar/cancelar. Factura pagada → rectificar (crear nueva, devolver importe, aprobar/pagar/validar).
- **Órdenes compra**: Módulo Compras → Crear (proveedor, productos) → Validar → generar factura/albarán entrada.
- **Ejercicios/Periodos**: Ejercicio fiscal (generalmente 1 año, configurable). Periodos (trimestrales/mensuales, sin solapamiento por defecto).
- **Diarios**: Libro registro asientos. Tipos: General, Ventas, Compras, Efectivo/Caja, Abono (devoluciones), Banco/Cheques. Configurar cuentas contables por defecto, numeración.
- **Plan contable**: Estructura jerárquica cuentas. Modificable por necesidades empresa/cambios legales.

### 3.7 RRHH
- Gestión: departamentos, trabajadores, contratos, asistencia, ausencias, nóminas, informes.
- **Contratos**: Nombre empleado, salario, tipo salario/contrato, fecha inicio → Guardar. Asignar directores departamento.
- **Asistencia**: Fichaje justifica presencia/ausencia. Ausencias: vacaciones o justificadas (médica, incapacidad, reuniones, clientes).
- **Nóminas**: Requieren contratos configurados. Sistema cierra/valida hojas trabajo.
- **Informes**: Horario empleado, horarios todos empleados, ausencias/nóminas.

### 3.8 Monitorización e Incidencias
- **Objetivos**: Detectar errores, confirmar funcionamiento correcto.
- **Parámetros**: Tiempos respuesta, ausencia datos clave, disponibilidad continua.
- **PostgreSQL**: `postgresql.conf` → `ERROR REPORTING AND LOGGING` (cliente, sistema, fallos sentencia, duración). `RUNTIME STATISTICS` (estadísticas uso, rendimiento, query/index collector, monitoring).
- **Rendimiento**: Módulo informe tiempos ejecución, llamadas servicios, métodos ORM, registros devueltos. Cambios código optimizan rendimiento.
- **Herramientas externas**: `profile` Python, `EXPLAIN` PostgreSQL.

### 3.9 Extracción Datos
- Exportación via ERP a Excel/CSV para flujo mixto.
- Odoo v13: Listado productos → icono exportación → seleccionar campos → aceptar → edición en Excel/otro formato.

## 4. IMPLANTACIÓN ERP-CRM EN EMPRESA

### 4.1 Metodología (5 Fases)
- **Fase 1: Iniciación**: Estudio ámbito (reuniones, funciones, planificación), viabilidad económica/técnica/organizativa, nivel cambio/riesgos, organización/proyecto (documentación funcional, planificación).
- **Fase 2: Desarrollo**: Análisis detallado, diseño físico/hardware (redes, ordenadores), diseño lógico/software (módulos, permisos), revisión previsiones. Documentación técnica.
- **Fase 3: Implementación**: Adquisición hardware, desarrollo software, plan pruebas, documentación completa, instalación/configuración módulos.
- **Fase 4: Implantación**: Plan implantación, formación usuarios, conversión/migración datos antiguos, test aceptación cliente, supervisión inicial.
- **Fase 5: Producción/Soporte**: Entrega material, auditoría (si no hay contrato mantenimiento) o resolución errores/modificaciones (si hay contrato). Operación normal, soporte, mantenimiento, documentación final.

### 4.2 Tipo/Necesidades Empresa
- ERP integra planificación, control, recursos. Facilita trazabilidad y respuesta rápida.
- **Adaptación**: Nuevas vistas/informes, modificación/creación informes, programación módulos completos.

### 4.3 Selección Módulos
- Instalar solo necesarios. Evitar conflictos.
- **Crear módulo**: Requiere vistas (árbol/formulario), menús (acciones/ventanas/informes), informes (PDF/HTML), gráficos, asistentes, flujos trabajo.

### 4.4 Tablas y Vistas a Adaptar
- **Modelo MVC**: Separación datos/presentación → independencia entornos acceso.
- **Motor BD**: Tablas relacionales. Interfaces XML dinámicas.
- **Tipos vistas**:
  - *Formulario*: Edición. Etiqueta + campo, izquierda→derecha/arriba→abajo, 4 columnas por defecto.
  - *Árbol*: Listados sencillos.
  - *Búsqueda*: Complementa árbol (panel superior).
  - *Gráfico*: Barras/circular, agrupaciones, operaciones simples.
- **Definición XML**: `<record model="ir.actions.act_window">` → `<menuitem>` → `<record model="ir.ui.view">`. Etiquetas grupales: `<separator>`, `<notebook>/<page>`, `<group>` (colspan/rowspan/expand).

### 4.5 Consultas
- Motor BD permite consultas cruzadas tablas relacionadas. Útil para marketing/conocimiento cliente.

### 4.6 Formularios Personalizados
- Asistentes gráficos intuitivos. Crear campos, subformularios, ejecutar.

### 4.7 Informes Personalizados
- Vistas nuevas para gestión cómoda. Configuración asistente → Informes avanzados → Instalar → seleccionar objeto base → campos obligatorios → secuencia numérica → filtros → guardar.
- **Tableros**: Organización múltiples informes. Crear acción, configurar presentación, entrada menú, asistente nombre objeto padre.

### 4.8 Procedimientos Almacenados
- Código fuente libre permite adaptación total a protocolo empresa. Interfaz/BD a medida. Bajo coste implantación. Requiere personal experto.

## 5. DESARROLLO DE COMPONENTES

### 5.1 Python para ERP-CRM
- **Características**: Interpretado, multiplataforma, orientado objetos, tipado dinámico (declaración no obligatoria, pero inicialización sí), sin conversión automática (casting necesario), bloques por sangrado (espacios, no tabs), implementaciones: CPython, JPython, IronPython.
- **Tipos básicos**:
  - *Numéricos*: Enteros (corto/largo), octal (027), hex (0x3F), coma flotante (IEEE 754: ±2.22e-308 a ±1.79e308), complejos (2+7j), `decimal` (28 decimales).
  - *Operadores*: +, -, *, /, //, **, %, &, |, ^, ~, <<, >>.
  - *Booleano*: True/False. Operadores: and, or, not, ==, !=, >, >=, <, <=.
  - *Cadenas*: Comillas simples/dobles (no mezclar). Escape: \n, \t, \r. Métodos: capitalize(), center(), ljust/rjust(), count(), find(), upper(), strip(), split(), splitlines(), len(), join(), format().
  - *Diccionarios*: Clave-valor {}. Acceso: dval["clave"]. Extender/eliminar: del dval["clave"], clear().
  - *Listas*: Dinámicas []. Índices positivos/negativos. Operadores: +, *. Métodos: append(), insert(), extends(), pop(), remove(), index(), in.
  - *Tuplas*: Inmutables (). Más ligeras/eficientes. Acceso: tupla[2]. Métodos limitados: index().
- **Variables**: Globales/locales. Asignación múltiple: (x, y, z) = (1, "ABC", True).
- **Control flujo**:
  - *Condicionales*: if/elif/else. Sin switch. Operador ternario: "valor" if cond else "otro".
  - *Bucle for*: for var in iterable.
  - *Bucle while*: while cond. break/continue.
- **POO**: `class Nombre:`, `__init__` (constructor), `__del__` (destructor), `__str__`, `__cmp__`, `__len__`. Operadores: `is` (memoria), `==` (valor).
- **Odoo ORM**: Tablas → objetos. Herencia:
  - *Extensión*: Misma tabla, añade campos (`_name` == `_inherit`).
  - *Prototipo*: Nueva tabla independiente, hereda campos (`_name` nuevo, `_inherit` padre).
  - *Delegación*: Herencia múltiple vía `_inherits` (diccionario objetos).
- **Definición campos (`_columns`)**: Boolean, integer, float (digits=(A,B)), char (size), text, date, datetime, binary, selection. Opciones: required, select, translate, ondelete, readonly.
- **Relaciones**: one2one, one2many, many2one, many2many. `many2one('objeto', 'descripcion')`.

### 5.2 Entornos Desarrollo
- **Instalación**: Python + editor básico o Eclipse + PyDev.
- **PyDev**: Help → Install New Software. Configurar intérprete en Preferencias → PyDev → Interpreter-Python (Auto Config).
- **Primer proyecto**: File/New/PyDev Project → src/New/PyDev Module (HolaMundo, Empty) → `print "Hola Mundo"` → Run → Python Run.

### 5.3 Operaciones con Datos
- **Carga inicial**: XML formato `__odoo__.py` con `<terp><data><record>...`. Cada `<record>` = registro a insertar. Campos requeridos obligatorios.

### 5.4 Extracción/Procesamiento
- Export/import via XML (inicial) y CSV (estándar migración, editable hojas cálculo). Interfaz gráfica facilita migración.

### 5.5 Llamadas a Funciones/API
- **Funciones**: `def nombre(parametros):`. Parámetros optativos: `def func(a=valor):`. Reordenar: `func(param_nombre=valor)`. `return` valor (sino `None`).
- **API**: Repositorio oficial funciones/métodos Python para implementación.

### 5.6 Depuración
- **Sintaxis/XML**: Parser XML o navegador.
- **Python**: Importar `pdb`. Insertar `pdb.set_trace()` en código. Ejecutar en modo debug → consola depuración (puntos ruptura, paso a paso, inspección valores).

### 5.7 Manejo Errores
- **Excepciones**: Objetos informativos. Gestión: `try` → `except` → `else` (sin error) → `finally` (siempre). Lanzar: `raise Exception()`.
- **Tipos**: BaseException, Exception, ArithmeticError (ZeroDivisionError, OverflowError), EOFError, IOError, ImportError, IndexError, KeyError.
- **Documentación**: `#` (línea), `'''` (bloque). Estándar javadoc: `@param`, `@return`, `@author`, `@version`.

---
