package programacion_modular;

import java.util.*;

public class Calculadora_modular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrancarAplicacion();
		int result = hacerOperacion(int resultado);
		System.out.println("El resultado de la operaccion seleccionada es: " + resultado);
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static void arrancarAplicacion() {
		
		boolean salir = false;
				while (!salir) {
					
					int opcion = menu();
					salir = (opcion ==5);
					if (salir) {
						System.out.println("Fin del programa");
					}
					
					else {
						hacerOperacion(int, opcion, opcion)
					}
					
				}		
	}
	

	///////////////////////////////////////////////////////////////////////////////
	
	public static int menu() {
		System.out.println("\n \nElegir operación");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) División");
		System.out.println("4) Multiplicación");
		System.out.println("5) Salir de la aplicación");
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		boolean opcionValida = false;
		while(!opcionValida) {
			opcion = sc.nextInt();
			opcionValida = (opcion >=1 && opcion <=5);
			if (!opcionValida) {
				System.err.println("Error: La opción tiene que estar entre 1 y 5");
			}
		}
		return opcion;
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	
	public static int introNum1(int num1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el perimer operando");
		num1 = sc.nextInt();
		return num1;
	}
	
	public static int introNum2(int num2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el segundo operando");
		num2 = sc.nextInt();
		return num2;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////
	
	public static int hacerOperacion(int opcion, int num1, int num2) {
		
		int resultado = 0;
		
		switch(opcion) {
		
		case 1:
			resultado = num1 + num2;
			
		case 2:
			resultado = num1 - num2;
			
		case 3:
			resultado = num1 / num2;
			
		case 4:
			resultado = num1 * num2;
			break;					
		}
		return resultado;
	}
	
}
