package org.example;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Pila de Strings
        Pila<String> pilaMensajees = new Pila<>();
        pilaMensajees.apilar("Mensaje 1");
        pilaMensajees.apilar("Mensaje 2");
        pilaMensajees.apilar("Mensaje 3");

        System.out.println("Cima de la pila: " + pilaMensajees.cima());
        while(!pilaMensajees.estaVacia()){
            System.out.println("Desapilando: " + pilaMensajees.desapilar());
        }

        System.out.println();

        // Cola de enteros
        Cola<Integer> colaNumeros = new Cola<>();
        colaNumeros.encolar(10);
        colaNumeros.encolar(20);
        colaNumeros.encolar(30);

        System.out.println("Frente de la cola: " + colaNumeros.frente());
        while(!colaNumeros.estaVacia()){
            System.out.println("Desencolando: " + colaNumeros.desencolar());
        }
    }
}

// Clase Pila (Stack - LIFO)
class Pila<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void apilar(T elemento) {
        elementos.addLast(elemento);
    }

    public T desapilar() {
        return elementos.removeLast();
    }

    public T cima() {
        return elementos.peekLast();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public int tamaño() {
        return elementos.size();
    }
}

// Clase Cola (Queue - FIFO)
class Cola<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    public void encolar(T elemento) {
        elementos.addLast(elemento);
    }

    public T desencolar() {
        return elementos.pollFirst();
    }

    public T frente() {
        return elementos.peekFirst();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public int tamaño() {
        return elementos.size();
    }
}
