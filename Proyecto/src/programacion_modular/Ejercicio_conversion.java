package programacion_modular;
import java.util.*;
/*
 * Desarrolla una aplicación en JAVA que permita transformar diferentes unidades de medida. 
 * El usuario seleccionará el tipo de cambio que desea realizar y después introducirá el valor. 
 * La aplicación responderá con un mensaje por pantalla cual ha sido la conversión realizada. 
 * Las unidades introducidas por el usuario siempre deben de ser números enteros.
 *-De metros a kilómetros.
 *-De metros a yardas y viceversa.
 *-De m/s a km/h  y viceversa.
 *-De kilómetros a millas y viceversa.
 */
public class Ejercicio_conversion {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int start = arrancarApp();
		double conversion = introDatos(start);
		imprimirResults(conversion, start);
		
	}
	
	public static int arrancarApp() {
		int opcion=0;
		
		System.out.println("Bienvenido al conversor de unidades, selecciona una opción a continuación: ");
		System.out.println();
		System.out.println("1.- Convertir metros a kilometros");
		System.out.println("2.- Convertir metros a yardas");
		System.out.println("3.- Convertir yardas a metros");
		System.out.println("4.- Convertir de m/s a km/h");
		System.out.println("5.- Convertir de km/h a m/s ");
		System.out.println("6.- Convertir kilómetros a millas");
		System.out.println("7.- Convertir millas a kilometros");
		System.out.println("8.- Salir de la Aplicación");
		
		boolean stop = false;
		
		do {
		opcion = entrada.nextInt();

		if(opcion >= 1 && opcion <= 7) {
		stop = true;

			
		}
		
		else if(opcion == 8) {
		System.out.println("Has abandonado el programa crrectamente");
		stop = true;
		}
		
		else {
			System.out.println("La opcion que has seleccionado no es correcta, introducela otra vez: ");
			opcion = entrada.nextInt();
			stop = true;


		}
		
	 }	while(!stop);
		
		
		return opcion;

	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static double introDatos(int opcion) {
		double metros, kilometros, yardas, metrosSegundo, kilometrosHora, millas =0;
		double resultado =0;
		
		switch(opcion) {
		case 1:
			System.out.println("Introduce los metros: ");
			metros = entrada.nextDouble();
			if(metros >0) {
				resultado = metros / 1000;
			}
			else {
			System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
			metros = entrada.nextDouble();
			resultado = metros / 1000;

			}
			break;
			
		case 2:
			System.out.println("Introduce los metros: ");
			metros = entrada.nextDouble();
			if(metros >0) {
				resultado = metros * 1.0936;
			}
			
			else {
				System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
				metros = entrada.nextDouble();
				resultado = metros * 1.0936;
				
			}
			break;
			
		case 3:
			System.out.println("Introduce las yardas: ");
			yardas = entrada.nextDouble();
			if(yardas > 0) {
				
				resultado = yardas / 1.0936;
			}
			
			else {
				System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
				yardas = entrada.nextDouble();
				resultado = yardas / 1.0936;

			}
			
			break;
			
			
		case 4:
			System.out.println("Introduce los metros por segundo: ");
			metrosSegundo = entrada.nextDouble();
			if(metrosSegundo > 0) {
				resultado = metrosSegundo * 3.6;
			}
			
			else {
				System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
				metrosSegundo = entrada.nextDouble();
				resultado = metrosSegundo * 3.6;

			}
			
			break;
			
		case 5:
			System.out.println("Introduce los km/h: ");
			kilometrosHora = entrada.nextDouble();
			if(kilometrosHora > 0) {
				resultado = kilometrosHora / 3.6;
			}
			
			else {
				System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
				kilometrosHora = entrada.nextDouble();
				resultado = kilometrosHora / 3.6;

			}
			
			break;
			
		case 6:
			System.out.println("Introduce los kilometros: ");
			kilometros =entrada.nextDouble();
			if(kilometros > 0) {
				resultado = kilometros / 1.609;
			}
			
			else {
				System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
				kilometros =entrada.nextDouble();
				resultado = kilometros / 1.609;

				
			}
			
			break;
			
		case 7:
			System.out.println("Introduce las millas: ");
			millas = entrada.nextDouble();
			if(millas > 0) {
				resultado = millas * 1.609;

			}
			
			else {
				System.err.println("La unidades que has introducido son incorrectas, por favor compruebalas: ");
				millas = entrada.nextDouble();
				resultado = millas * 1.609;

			}
			
		}
		
		return resultado;

	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void imprimirResults(double resultado, int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("El resultado de la conversión de metros a kilometros es: " + resultado);
			break;
			
		case 2:
			System.out.println("El resultado de la conversión de metros a yardas es: " + resultado);
			break;
			
		case 3:
			System.out.println("El resultado de la conversión de yardas a metros es: " + resultado);
			break;
			
		case 4:
			System.out.println("El resultado de la conversión de m/s a km/h es: " + resultado);
			break;
			
		case 5:
			System.out.println("El resultado de la conversión de km/h a m/s es: " + resultado);
			break;
			
		case 6:
			System.out.println("El resultado de la conversion de kilometros a millas es: " + resultado);
			break;
			
		case 7:
			System.out.println("El resultado de la conversion de millas a kilometros es: " + resultado);
			break;
			
		}
	}


}
