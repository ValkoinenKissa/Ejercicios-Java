import org.junit.Test;

import static org.junit.Assert.*;

public class Test3Test {
    private static final double DELTA = 1e-4; // tolerancia de 0.0001 sino da error por la falta de precision en el expResult
    @Test
    public void dolarEuro() {
        double dollar = 10.5;
        double expResult = 8.925;
        Test3 instance = new Test3();
        double result = instance.dolarEuro(dollar);
        assertEquals(expResult, result, DELTA);

    }

    @Test
    public void euroDolar() {
        double euro = 20.30;
        double expResult = 23.8823;
        Test3 instance = new Test3();
        double result = instance.euroDolar(euro);
        assertEquals(expResult, result, DELTA);
    }
}