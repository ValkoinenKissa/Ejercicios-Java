import org.junit.Test;

import static org.junit.Assert.*;

public class Test2Test {

    @Test
    public void celsiusToFarenheit() {
        System.out.println("CelsiusToFarenheit");
        double celsius = 15;
        Test2 instance = new Test2();
        double expResult = 59;
        double result = instance.CelsiusToFarenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void farenheitToCelsius() {
        System.out.println("FarenheitToCelsius");
        double farenheit = 59;
        Test2 instance = new Test2();
        double expResult = 15;
        double result = instance.FarenheitToCelsius(farenheit);
        assertEquals(expResult, result, 0.0);
    }
}