import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

  class CalculadoraTest {
    @Test
    void resolver() {
        Lector reader = new Lector();
        String peticion = reader.readFile();
        Calculadora calc = Calculadora.getInstance();
        calc.setStack("ArrayList", "");
        assertEquals(String.valueOf(27), calc.resolver(peticion));
    }
}