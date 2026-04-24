package org.example;

import org.example.vehiculos.*;

public class Main {

    public static void main(String[] args) {
        Vehiculo v1 = new Coche("Toyota");
        Vehiculo v2 = new Moto("Yamaha");
        Vehiculo v3 = new Coche("Ford");
        Vehiculo v4 = new Moto("Honda");

        Vehiculo []vehiculos = {v1, v2, v3, v4};
        for(Vehiculo v:vehiculos){
            v.arrancar();
        }

        System.out.println("Vehiculos creados: " + Vehiculo.getTotalVehiculos());
    }
}
