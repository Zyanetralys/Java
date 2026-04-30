public class Animal {
    public void hacerSonido(String tipo) {
        System.out.println("Sonido genérico");
    }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido(String tipo) {  // ✓ Correcto
        // Mismo nombre: hacerSonido
        // Mismo parámetro: String tipo
        // Mismo retorno: void
        System.out.println("Guau guau");
    }
    
    // INCORRECTO, Diferente parámetro
    // public void hacerSonido(int volumen) { }
    // Esto sería SOBRECARGA, no sobrescritura
}
