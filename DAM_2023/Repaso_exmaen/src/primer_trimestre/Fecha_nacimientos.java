package primer_trimestre;
import java.util.*;
/*
 * Diseñar un programa que lea desde teclado: el día , el código del mes y el año. Los módulos
 * pueden sr los siguientes:
 * main. Contará con una sola línea que invoque al módulo arrancaraplicacion.
 * arrancarAplicacion. Mediante un bucle controlado por una variable booleana
 * denominada fechaValida, llamará a los módulos que introduzcan los datos, después de
 * este proceso se invocará a un módulo denominado validarDatos que retorne un true si
 * los datos son validos y false en caso contrario. En caso de que el mes se 2., es decir,
 * Febrero, llamaremos a un módulo denominado esBisiesto que retorne un booleano.
 * El año se considera válido si es mayor o igual que 1582, fecha en que se estableció el
 * calendario Gregoriano.
 */
public class Fecha_nacimientos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		arrancarAplicacion();

	}
	
	
	public static void arrancarAplicacion() {
		System.out.println("Introduce una fecha para registrar los nacimientos que se han producido en ese mismo dia: ");
		int anno = pedirAnno();
		int mes = pedirMes();
		int dia;
		boolean diaValido;
		do {
			dia = pedirDia();
			diaValido = validarDia(anno, mes, dia);
		}while(!diaValido);
		imprimirResultados(anno, dia, mes);
		int registroNacimientos = introNacimientos(anno, dia, mes);
		buscarFecha(anno, dia, mes, registroNacimientos);
		buscarNacimientos(anno, dia, mes, registroNacimientos);
		
	}
	
	
	////////////////////////////////////////////////////////////////////////
	
	public static int pedirAnno() {
		int anno=0;
		System.out.println("Introduce el año: ");
		do {
			anno = entrada.nextInt();
			if(anno < 1582) {
				System.err.println("El año que has introducido no es correcto, intentalo de nuevo: ");
				anno = entrada.nextInt();
			}
		}while(anno < 1582);
		
		return anno;
		
	}
	
	
	
	public static int pedirMes() {
		int mes=0;
		System.out.println("Introduce el mes: ");
		do {
			mes = entrada.nextInt();
			if(mes > 12 || mes < 1) {
				System.err.println("El mes que has introducido no es correcto, intentalo de nuevo: ");
				mes = entrada.nextInt();
			}
		}while(mes > 12 || mes < 1);
		
		return mes;
		
	}
	
	
	public static int pedirDia() {
		int dia;
		System.out.println("Introduce el dia: ");
		return dia = entrada.nextInt();
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static boolean validarDia(int anno, int mes, int dia) {
		boolean fechaValida = true;
		switch(mes) {
		//Meses con 31 dias
		case 1:
			
		case 3:
			
		case 5:
			
		case 7:
			
		case 8:
			
		case 10:
			
		case 12:
			if(dia > 31 || dia <1) {
				System.err.println("El dia que has introducido no es correcto, introducelo de nuevo por favor: ");
				fechaValida = false;
			}
			break;
			
			
		//Meses con 30 dias
			
			
		case 4:
		
		case 6:
			
		case 9:
			
		case 11:
			
			if(dia > 30 || dia < 1) {
				
				System.err.println("El dia que has introducido no es correcto, introducelo de nuevo por favor: ");
				fechaValida = false;
				
			}
			break;
			
		
		//Meses con 28 dias
			
			
			
		case 2:
			if(dia > 28 || dia < 1) {
				System.err.println("El dia que has introducido no es correcto, introducelo de nuevo por favor: ");
				fechaValida = false;
			}
			
			
		}
		
		
		return fechaValida;
		
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void imprimirResultados(int anno, int dia, int mes) {
		System.out.println("La fecha que has introducido es: " + anno + " / " + mes + " / " + dia);
		System.out.println();
		System.out.println("El formato de la fecha es timestamp: año, mes, fecha");
	}
	
	
	
	/*
	 * Aqui termina el codigo del programa para validar fechas, ahora comienzan los nacimientos
	 */
	
	
	public static int introNacimientos(int anno, int dia, int mes) {
		int nacimientos;
		System.out.println("Introduce el numero de nacimientos para la fecha: " + anno + " / " + mes + " / " + dia);
		do {
			
			nacimientos = entrada.nextInt();
			
			if(nacimientos > 10000) {
				System.out.println("El numero de nacimientos no es valido, compruebalos e intentalo de nuevo: ");
				nacimientos = entrada.nextInt();
			}
			
		}while(nacimientos > 10000);
		
		
		System.out.println("La fecha como el número de nacimientos asociados a ella han quedado registrados");
		
		return nacimientos;

	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void buscarFecha(int anno, int dia, int mes, int nacimientos) {
		int opcion;
		System.out.println("Quieres buscar la fecha en el registro o finalizar la aplicación");
		System.out.println();
		System.out.println("Introduce un 1 para SI, y un 2 para NO");
		
		do {
			opcion = entrada.nextInt();
			if(opcion > 2 || opcion < 1) {
				System.out.println("La opcion que has introducido no es correcta, prueba de nuevo: ");
			}
			
		}while(opcion > 2 || opcion < 1);
		
		
		
		if(opcion == 2) {
			
			System.out.println("Has abandonado la aplicación correctamnete");
			
		}else {
			buscarNacimientos(anno,  dia,  mes, nacimientos);
		}
		
	}
	
	
	public static void buscarNacimientos(int anno, int dia, int mes, int nacimientos) {
		System.out.println("Introduce una fecha para comprobar los nacimientos de ese mismo dia");
		int queryDia, queryAnno, queryMes;
		
		queryAnno = pedirAnno();
		queryMes = pedirMes();
		queryDia = pedirDia();
		
		
		if(queryAnno != anno || queryMes != mes || queryDia != dia) {
			System.out.println("En la fecha introducida no se registro ningun nacimiento");
			
			
		}else {
			System.out.println("En la fecha que has introducido se registraron " + nacimientos);
		}
		
		
	}

}
