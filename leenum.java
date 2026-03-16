import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;

        do {

            System.out.println("Introduce un número:");
            num = scanner.nextInt();

            if (num > 0)
                System.out.println("POSITIVO");
            else if (num < 0)
                System.out.println("NEGATIVO");

        } while (num != 0);

        scanner.close();
    }
}
