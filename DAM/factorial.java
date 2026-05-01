// Factorial de 5 = 5! = 5 × 4 × 3 × 2 × 1 = 120

public int factorial(int n) {
    // CASO BASE (condición de parada)
    if (n == 1) {
        return 1;
    }
    // CASO RECURSIVO (se llama a sí misma)
    else {
        return n * factorial(n - 1);
    }
}

// Ejecución:
// factorial(5)
// = 5 * factorial(4)
// = 5 * 4 * factorial(3)
// = 5 * 4 * 3 * factorial(2)
// = 5 * 4 * 3 * 2 * factorial(1)
// = 5 * 4 * 3 * 2 * 1
// = 120
