package primer_trimestre.ejercicios_programacion_estructurada;

/*
2.- Debes de crear una calculadora. La aplicación mostrará un menú con las operaciones que
 puede realizar (sumar, restar, multiplicar, dividir y resto).

 También debe pedir al usuario que introduzca los dos números.

 Para la operación de restar debemos de comprobar que reste el número mayor menos el menor, es decir que si el usuario
 introduce, por ejemplo, 5 y 7 deberá hacer 7-5, no puede dar un número negativo. Para la operación división el divisor
 no podrá ser cero, en dicho caso le mostrará un mensaje diciendo que no se puede hacer la división.

 */

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int opcion;
        boolean salir = true;
        System.out.println("Bienvenido a la calculadora, esta es la lista de opciones disponibles, introduce los numeros" +
                " y luego selecciona la opción que desees realizar: ");

        do {

            System.out.println("Introduce la opción que quieras realizar: ");


            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Dividir");
            System.out.println("4. Restar");
            System.out.println("5. Calcular resto");
            System.out.println("6. Salir de la calculadora");

            opcion = sc.nextInt();

            if (opcion == 6) {
                System.out.println("Hasta pronto!!");
                salir = false;
                continue;
            }


            System.out.print("Introduce el primer numero: ");
            num1 = sc.nextDouble();
            System.out.print("Introduce el segundo numero: ");
            num2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 2:
                    resultado = num1 * num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 3:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir algo entre 0");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("El resultado es: " + resultado);
                    }
                    break;
                case 4:
                    if (num1 > num2) {
                        resultado = num1 - num2;
                        System.out.println("El resultado es: " + resultado);
                    } else if (num2 > num1) {
                        resultado = num2 - num1;
                        System.out.println("El resultado es: " + resultado);

                    }
                    break;

                case 5:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir algo entre 0");
                    } else {
                        resultado = num1 % num2;
                        System.out.println("El resultado es: " + resultado);
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (salir);

        sc.close();
    }
}
