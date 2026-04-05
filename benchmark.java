// ─────────────────────────────────────────
// PARTE 1: CALENTAMIENTO (WARMUP)
// ─────────────────────────────────────────
for (int i = 0; i < 1000; i++) {
    algoritmo.test();
}

// ─────────────────────────────────────────
// PARTE 2: MEDICIÓN MÚLTIPLE
// ─────────────────────────────────────────
long total = 0;
int iteraciones = 100;
for (int i = 0; i < iteraciones; i++) {
    long inicio = System.nanoTime();
    algoritmo.test();
    long fin = System.nanoTime();
    total += (fin - inicio);
}

// ─────────────────────────────────────────
// PARTE 3: PROMEDIO Y SALIDA
// ─────────────────────────────────────────
long promedio = total / iteraciones;
System.out.println("Tiempo promedio: " + promedio + " ns");
