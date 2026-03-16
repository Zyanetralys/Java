public class Main {

  public static void main(String[] args) {



    int suma = 0;

    int[] array = { 1, 2, 3, 5, 7, 43, 56, 34, 21, 87, 12, 67, 8 };



    for (int i = 0; i < array.length; i++) {

      if (array[i] == 7) {

        break;

      }

      suma += array[i];

    }



    System.out.println(suma);

  }

}
