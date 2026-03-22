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
