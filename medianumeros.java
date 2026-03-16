import java.util.Scanner;

public class MediaNumeros {

  public static void main(String[] args) {

    int num, suma = 0, contador = 0;

    Scanner scanner = new Scanner(System.in);

    do {

      System.out.println("Escribe un número: ");

      num = scanner.nextInt();

      if (num != 0) {

        contador++;
        suma += num;

      }

    } while (num != 0);

    System.out.println("La media de los números es " + (double) suma / contador);

    scanner.close();

  }

}
