public class FactorialTest {
    public int factorial(int numero) {
        int factorial = numero;
        for (int i = (numero - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
