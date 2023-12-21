package primer_trimestre;

import java.util.*;

/*
 * Programar una calculadora que presente un menu con las operaciones aritméticas básicas.
 * Salimos del programa cuando el usuario teclee la opción salir. Utilice un interruptor para
 * salir. El módulo main tendrá una sola línea que invocará a un módulo denominado ejecutar.
 */
public class Calculadora {
	public static void main(String[] args) {
		arrancarAplicacion();
	}

	static Scanner entrada = new Scanner(System.in);

	public static void arrancarAplicacion() {
		System.out.println("Usuario bienvenido a la calculadora, elije una de las siguientes opciones: ");
		System.out.println();
		int opcion = menu();
		if (opcion == 5) {
			System.out.println("Fin del programa, dale al boton de play para ejecutar de nuevo");
		}

		else {

			int numero1 = IntroduceNum1();
			int numero2 = IntroduceNum2();
			int operaccionesNums = operaciones(opcion, numero1, numero2);

		}
	}

	public static int menu() {
		int opcion;
		boolean opcionValida = true;
		System.out.println("1-Suma\n2-Resta\n3-Multiplicacion\n4-Division\n5-Salir");
		do {
			System.out.println("Introduce una opcion: ");
			opcion = entrada.nextInt();
			if (opcion > 5 || opcion < 1) {
				opcionValida = false;
				System.err.println("Error, introduce de nuevo la opcion: ");
			}

			else {

				opcionValida = true;

			}
		} while (!opcionValida);

		return opcion;

	}

	public static int IntroduceNum1() {
		System.out.println("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		return num1;
	}

	public static int IntroduceNum2() {
		System.out.println("Introduce el primer numero: ");
		int num1 = entrada.nextInt();
		return num1;
	}

	public static int operaciones(int opcion, int num1, int num2) {
		int resultado = 0;
		switch (opcion) {
		case 1:
			resultado = num1 + num2;
			System.out.println("El resultado de la operacion seleccionada es: " + resultado);
			break;

		case 2:
			resultado = num1 - num2;
			System.out.println("El resultado de la operacion seleccionada es: " + resultado);
			break;

		case 3:
			resultado = num1 * num2;
			System.out.println("El resultado de la operacion seleccionada es: " + resultado);
			break;

		case 4:
			if (num1 == 0 || num2 == 0) {
				System.out.println("No se puede dividir un numero entre 0, introduce de nuevo los valores: ");
				num1 = entrada.nextInt();
				num2 = entrada.nextInt();
			}
			resultado = num1 / num2;
			break;

		}

		return resultado;

	}

}
