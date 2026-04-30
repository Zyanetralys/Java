// ═══════════════════════════════════════════
│  MÉTODOS DE HASHMAP                         │
// ═══════════════════════════════════════════

HashMap<String, Integer> mapa = new HashMap<>();
mapa.put("España", 47);
mapa.put("Italia", 60);
mapa.put("Francia", 67);

// ┌─────────────────────────────────────┐
// │ RECORRER VALORES (values)           │
// └─────────────────────────────────────┘
for (Integer valor : mapa.values()) {
    System.out.println(valor);
}
// Imprime: 47, 60, 67

// ┌─────────────────────────────────────┐
// │ RECORRER CLAVES (keySet)            │
// └─────────────────────────────────────┘
for (String clave : mapa.keySet()) {
    System.out.println(clave);
}
// Imprime: España, Italia, Francia

// ┌─────────────────────────────────────┐
// │ RECORRER ENTRADAS (entrySet)        │
// └─────────────────────────────────────┘
for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
    System.out.println(entrada.getKey() + " = " + entrada.getValue());
}
