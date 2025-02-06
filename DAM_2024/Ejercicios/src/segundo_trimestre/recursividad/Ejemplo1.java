package segundo_trimestre.recursividad;

public class Ejemplo1{
    public static void main(String[] args) {
        int resultado = factorial(5);
        System.out.println(resultado);

    }

    public static int factorial(int numero){
        if (numero == 0 || numero == 1){
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}
