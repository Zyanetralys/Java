// 1. FOR: Conteo Fijo (5 suministros)
// (int i = 0) -> Empiezas en 0
// (i < 5)     -> Mientras seas menor a 5
// (i++)       -> Suma 1 cada vuelta
for (int i = 0; i < 5; i++) {
    System.out.println("Marcando paquete número: " + i);
}

// 2. WHILE: Vigilancia (Mientras haya energía)
// int energia = 10; -> Tienes 10 unidades de energía
int energia = 10; 
// Mientras la energía sea mayor a 0
while (energia > 0) {
    System.out.println("Sistema activo. Energía restante: " + energia);
    energia--; // Gastas 1 unidad
}

// 3. DO-WHILE: Verificación Obligatoria (Intentar conexión)
int intentos = 0;
do {
    System.out.println("Intentando conectar...");
    intentos++; // Sumas un intento
} while (intentos < 3); // Verificas SI DEBES repetir después de ejecutar


// 1. FOR (Conteo fijo: 5 granadas)
for (int i = 0; i < 5; i++) {
    // i empieza en 0. Mientras i sea menor que 5. Suma 1 cada vez.
    System.out.println("Granada lanzada: " + i); 
}

// 2. WHILE (Condición: Mientras haya energía)
int energia = 10;
while (energia > 0) {
    System.out.println("Energía restante: " + energia);
    energia--; // Gasta energía
}

// 3. DO-WHILE (Ejecuta primero, pregunta después)
int intentos = 0;
do {
    System.out.println("Intentando conectar...");
    intentos++;
} while (intentos < 3); // Verifica después de intentar
