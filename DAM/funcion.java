// ═══════════════════════════════════════════
│  ESTRUCTURA DE UNA FUNCIÓN                  │
// ═══════════════════════════════════════════

public static int sumar(int a, int b) {
    // ─────┬────    ──┬──    ─────┬─────
    //      │          │            │
    //  Modificadores  Tipo      Nombre
    //  (public static) retorno  (sumar)
    //                   (int)
    
    // Parámetros: (int a, int b)
    // Cuerpo de la función
    int resultado = a + b;
    return resultado;  // Valor de retorno
}

// USO:
int suma = sumar(3, 5);  // suma = 8
