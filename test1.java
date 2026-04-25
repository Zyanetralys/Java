import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(2, 3);
        // Si resultado no es 5, el test falla.
        assertEquals(5, resultado); 
    }
}
