// Paso 1: Crear ArrayList
ArrayList<String> lista = new ArrayList<>();
// lista = []

// Paso 2: Añadir elementos
lista.add("A");  // lista = ["A"]
lista.add("B");  // lista = ["A", "B"]
lista.add("C");  // lista = ["A", "B", "C"]

// Paso 3: Crear Iterator
Iterator<String> it = lista.iterator();
// El iterator se posiciona ANTES del primer elemento
// Posición: ↑ (antes de "A")

// Paso 4: Primer next()
it.next();
// next() devuelve el elemento actual y AVANZA
// Devuelve: "A" (pero NO se guarda/imprime)
// Posición:   ↑ (ahora está en "B")

// Paso 5: Segundo next() CON println
System.out.println(it.next());
// next() devuelve el elemento actual ("B") y avanza
// Imprime: "B"
// Posición:    ↑ (ahora está en "C")
