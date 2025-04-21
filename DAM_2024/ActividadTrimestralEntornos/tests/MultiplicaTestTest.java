import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicaTestTest {

    @Test
    public void multiplica() {
        int expResult = 4;
        Test1 instance = new Test1();
        int a=2;
        int b=2;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
    }
}