int[] numeros = {1, 2, 3};
try {
    int numero = numeros[5];
    System.out.println("Número: " + numero);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Error: Índice fuera de los límites del array.");
}
