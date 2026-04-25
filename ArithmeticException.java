try {
    int resultado = 10 / 0;
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("Error: No se puede dividir por cero.");
}
