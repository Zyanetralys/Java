public class Main {
    public static void main(String[] args) {

        int numeroEntero = 100;
        long numeroLargo = numeroEntero;
        
        double numeroDecimal = 9.78;
        int numeroConvertido = (int) numeroDecimal;
        
        System.out.println(numeroConvertido); // Salida: 9 (Pérdida del .78)
    }
}
