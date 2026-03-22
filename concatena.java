public class Main {
    public static void main(String[] args) {
        int municion = 5;
        int reserva = 5;

        // 1. Suma Matemática (Resultado: 10)
        int total = municion + reserva; 
        System.out.println("Total matemático: " + total);

        // 2. Concatenación (Resultado: "Total: 55")
        // Java lee de izquierda a derecha. Texto + Numero = Texto.
        System.out.println("Total concatenado: " + municion + reserva); 

        // 3. Concatenación con Suma (Resultado: "Total suma: 10")
        // Los paréntesis fuerzan la suma antes de convertir a texto.
        System.out.println("Total suma real: " + (municion + reserva)); 
    }
}
