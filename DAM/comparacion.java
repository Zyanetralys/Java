// ═══════════════════════════════════════════
│  NÚMEROS: usar ==                           │
// ═══════════════════════════════════════════
int a = 5;
int b = 5;
if (a == b) {
    System.out.println("Iguales");  // Se imprime
}

// ═══════════════════════════════════════════
│  STRINGS: usar equals()                     │
// ═══════════════════════════════════════════
String s1 = new String("Hola");
String s2 = new String("Hola");

if (s1 == s2) {
    // NO USAR - Compara referencias (direcciones de memoria)
}

if (s1.equals(s2)) {
    System.out.println("Iguales");  // CORRECTO
}
