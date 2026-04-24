package org.example;

import org.example.animales.*;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Perro("Oddy");
        Animal a2 = new Gato("Garfield");
        Animal a3 = new Animal("Criatura");

        a1.hacerSonido(); // Perro guau
        a2.hacerSonido(); // Gato miau
        a3.hacerSonido(); // Sonido genérico

        // Polimorfismo en acción
        Animal[] animales = {a1, a2, a3};
        System.out.println("\nRecorriendo el array de animales: ");
        for(Animal animal:animales){
            animal.hacerSonido(); // Aquí es donde se llama a cada hacerSonido
        }

    }
}
