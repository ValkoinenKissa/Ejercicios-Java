import org.junit.Test;

import static org.junit.Assert.*;

public class Test3Test {

    @Test
    public void factorialRecursivo() {
        System.out.println("Factorial Recursivo");
        int numACalcular = 5;
        Test3 instance = new Test3();
        int expResult = 120;
        int result = instance.factorialRecursivo(numACalcular);
        assertEquals(expResult, result);
    }
}