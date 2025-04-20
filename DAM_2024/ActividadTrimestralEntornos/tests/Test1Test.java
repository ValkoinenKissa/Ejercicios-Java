import static org.junit.Assert.*;

public class Test1Test {

    @org.junit.Test
    public void multiplica() {
        int expResult = 4; //Cambiamos el resultado esperado para provocar un fallo (2*2 = 4) el 5 provoca un fallo
        Test1 instance = new Test1();
        int a=2;
        int b=2;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void factorial() {
        int expResult = 6;
        int numero = 3;
        Test1 instance = new Test1();
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
    }
}