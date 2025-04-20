import org.junit.Test;

import static org.junit.Assert.*;

public class Test2Test {

    /*
    Dividimos los test en 2 grupos A y B, uno para los metodos que devuelven un valor positivo
     y otro para los que devuelven un valor negativo
     */

    @Test
    public void fahrenheitToCelsiusA() {
        double fahrenheit = -40;
        double expResult = -40;
        Test2 instance = new Test2();
        double result = instance.fahrenheitToCelsius(fahrenheit);
        assertEquals(expResult, result, 0.0); //El tercer parametro sirve para indicar una tolerancia en la comparación
    }


    @Test
    public void fahrenheitToCelsiusB() {
        double fahrenheit = 32;
        double expResult = 0;
        Test2 instance = new Test2();
        double result = instance.fahrenheitToCelsius(fahrenheit);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void celsiusToFahrenheitA() {
        double celsius = -5;
        double expResult = 23;
        Test2 instance = new Test2();
        double result = instance.celsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }


    @Test
    public void celsiusToFahrenheitB() {
        double celsius = 15;
        double expResult = 59;
        Test2 instance = new Test2();
        double result = instance.celsiusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
    }
}