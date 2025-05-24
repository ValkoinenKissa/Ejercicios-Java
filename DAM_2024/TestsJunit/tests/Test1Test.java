import org.junit.Test;

import static org.junit.Assert.*;
public class Test1Test {

    @Test
    public void multiplicar() {
        System.out.println("multiplica");
        int a=6;
        int b=6;
        Test1 instance =new Test1();
        int expResult =36;
        int result= instance.multiplicar (a,b);
        assertEquals (expResult, result);
    }

    @Test
    public void factorial() {
        System.out.println("factorial");
        int numero=5;
        Test1 instance =new Test1();
        int expResult =120;
        int result= instance.factorial (numero);
        assertEquals (expResult, result);
    }
}