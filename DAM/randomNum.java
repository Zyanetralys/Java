import java.util.Random;

import java.util.Scanner;



public class Main {

  public static void main(String[] args) {



    int adivinar, numero;

    Random aleatorio = new Random();

    Scanner scanner = new Scanner(System.in);



    adivinar = aleatorio.nextInt(10); // Genera un número aleatorio entre 0 y 9



    for (int i = 0; i <= 9; i++) {

      System.out.println("Quedan " + (10 - i) + " intentos.");

      System.out.println("Introduce un número:");



      numero = scanner.nextInt();



      if (adivinar == numero) {

        System.out.println("¡Lo adivinaste!");

        break;

      }

    }



    scanner.close();

  }

}
