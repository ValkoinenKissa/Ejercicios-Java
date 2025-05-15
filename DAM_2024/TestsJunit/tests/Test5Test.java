import org.junit.Test;

import static org.junit.Assert.*;

public class Test5Test {

    @Test
    public void dividir() {
        int expResult = 5;
        int a = 10;
        int b = 2;
        Test5 instance = new Test5();
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
    }
}