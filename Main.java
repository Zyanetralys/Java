package codigo;

import java.util.Scanner;

public class Main {
    // CORRECCIÓN: String[] args
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduzca los apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Introduzca su raza (Humano, Elfo, Orco): ");
        String raza = scanner.nextLine();

        Heroe heroe = new Heroe(nombre, apellidos, raza);
        heroe.mostrarInfo();

        scanner.close();
    }
}