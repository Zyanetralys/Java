ArrayList<String> lista = new ArrayList<>();
lista.add("A");
lista.add("B");
lista.add("C");

Iterator<String> it = lista.iterator();

// hasNext() → ¿Hay más elementos?
if (it.hasNext()) {
    String elemento = it.next();  // Devuelve "A"
    System.out.println(elemento); // Imprime: A
}

// Segundo next()
String siguiente = it.next();  // Devuelve "B"
