public class CalcularPromedio {
    public static void main(String[] args) {
        double nota1 = 6.5;
        double nota2 = 7.0;
        double nota3 = 5.5;
        
        double promedio = (nota1 + nota2 + nota3) / 3;
        
        if (promedio >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}
