package programacion_modular;
import java.util.*;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrancaPrograma();

	}
	
	/////////////////////////////////////////////////////
	
	public static void arrancaPrograma() {
		boolean salir = false;
				while(!salir) {
					int opcion = mostrarMenu();
					salir = opcion == 5;
					if(!salir) {
						int resultado = (int) calculoNum(opcion);
						imprimeResultado(resultado);
					}
					
					else {
						System.out.println("La ejecucion del programa ha finalizado");

					}
				}
					
		}
	
	//////////////////////////////////////////////////////

	public static int mostrarMenu() {
		int opcion =0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienvenido a la calucladora, introduce que opcion quieres ejecutar"
				+ "1- Suma" + "2-Resta" + "3-Multiplicacion" + "4-Division" + "5-Salir");
		
		boolean opcionValida = false;
				while(!opcionValida) {
				opcion = entrada.nextInt();
				opcionValida = opcion > 0 && opcion <=5;
				
				if(!opcionValida) {
					System.out.println("La opcion no es valida, opcion debe estar entre 1 y 5");
				}
				

				}
				
			return opcion;
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	public static double calculoNum(int opcion) {
		Scanner entrada = new Scanner(System.in);
		double resultado =0;
		int num1, num2 =0;
		System.out.println("Introduce el primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2 = entrada.nextInt();
		if(opcion == 4 && num2 == 0) {
		System.out.println("No se puede dividir entre 0");
		System.out.println("Vuelve a introducir el numero: ");
		num2 = entrada.nextInt();
		
		}
		switch(opcion) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			resultado = num1 / num2;
			break;
			
		}
		return resultado;
	}
	
	///////////////////////////////////////////////////////////////////////////////
	
	public static void imprimeResultado(double resultado){
		System.out.println("El resultado de la opcion seleccionada es: " + resultado);
	
	}
	
}