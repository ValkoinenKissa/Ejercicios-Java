import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTestTest {

    @Test
    public void factorial() {
        int expResult = 6;
        int numero = 3;
        FactorialTest instance = new FactorialTest();
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
    }
}