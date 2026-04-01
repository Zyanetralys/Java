// 1. Calentamiento (Warmup)
for (int i = 0; i < 1000; i++) {
    algoritmo.test(); // Ejecuta sin medir para "calentar" la JVM
}

// 2. Medición Múltiple
long total = 0;
int iteraciones = 100;
for (int i = 0; i < iteraciones; i++) {
    long inicio = System.nanoTime();
    algoritmo.test();
    long fin = System.nanoTime();
    total += (fin - inicio);
}

// 3. Promedio
long promedio = total / iteraciones;
System.out.println("Tiempo promedio: " + promedio + " ns");
