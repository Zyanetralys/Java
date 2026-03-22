// Bucle de escaneo
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Sale del bucle cuando i es 5. No ejecuta 6, 7, 8, 9.
    }
    System.out.println("Escaneando: " + i);
}

// Bucle de filtrado
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Si es par, salta esta vuelta. No imprime pares.
    }
    System.out.println("Impar: " + i);
}
