import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicaTestTest {

    @Test
    public void multiplica() {
        int expResult = 4;
        MultiplicaTest instance = new MultiplicaTest();
        int a=2;
        int b=2;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
    }
}