long inicio = System.nanoTime(); // Marca de tiempo inicial

// Código a medir
for (int i = 0; i < 1000000; i++) {
    resultado = i * 2;
}

long fin = System.nanoTime(); // Marca de tiempo final
long duracion = fin - inicio; // Duración en nanosegundos

System.out.println("Tiempo de ejecución: " + duracion + " ns");
