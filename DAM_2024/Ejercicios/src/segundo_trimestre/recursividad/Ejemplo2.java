package segundo_trimestre.recursividad;

public class Ejemplo2 {
    public static void main(String[] args) {
        int fib_len = 9;

        System.out.print("La serie fibonacci del numero " + fib_len + " es: \n");

        for (int i = 0; i < fib_len; i++) {
            System.out.print(fibRecursion(i) + " ");
        }
    }

    public static int fibRecursion(int count) {
        if (count == 0) {
            return 0;
        } // Oth fibonacci is 0

        if (count == 1 || count == 2) {
            return 1;
        } // 1st and 2nd Fibonacci are 1 and 1 only

        // calling function recursively for nth Fibonacci
        return fibRecursion(count - 1) + fibRecursion(count - 2);
    }
}
