import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTestTest {

    @Test
    public void factorial() {
        int expResult = 6;
        int numero = 3;
        Test1 instance = new Test1();
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
    }
}