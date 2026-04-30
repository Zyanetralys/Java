// ═══════════════════════════════════════════
│  WILDCARD: ? extends Number                 │
// ═══════════════════════════════════════════

<? extends Number> significa:
" Cualquier tipo que sea Number O subclase de Number "

Jerarquía:
           Number
          /  |  \
         /   |   \
     Integer Double Float
        │
      Long
        │
      Short
        │
      Byte

  // ¿Qué puede aceptar esta función?

  // VÁLIDOS:
ArrayList<Integer> enteros = new ArrayList<>();
sumar(enteros);  // Integer extends Number 

ArrayList<Double> decimales = new ArrayList<>();
sumar(decimales);  // Double extends Number 

ArrayList<Float> flotantes = new ArrayList<>();
sumar(flotantes);  // Float extends Number 

ArrayList<Number> numeros = new ArrayList<>();
sumar(numeros);  // Number es Number 


//  INVÁLIDOS:
ArrayList<String> textos = new ArrayList<>();
sumar(textos);  // String NO es Number 

ArrayList<Object> objetos = new ArrayList<>();
sumar(objetos);  // Object es SUPERCLASE, no subclase 
