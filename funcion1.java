// 1. Función SIN retorno (void) -> Solo ejecuta una orden
public static void imprimirAlerta(String mensaje) {
    System.out.println("ALERTA: " + mensaje);
}

// 2. Función CON retorno (double) -> Devuelve un dato útil
public static double calcularArea(double radio) {
    double area = 3.1416 * radio * radio;
    return area; // Devuelve el valor al quien llamó
}

// 3. Llamada a las funciones (Desde el main)
public static void main(String[] args) {
    imprimirAlerta("Intruso detectado"); // No guarda resultado
    
    double radio = 5.0;
    double resultado = calcularArea(radio); // Guarda el retorno
    System.out.println("Área: " + resultado);
}
