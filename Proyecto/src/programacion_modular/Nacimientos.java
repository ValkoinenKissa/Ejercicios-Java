package programacion_modular;
import java.util.*;
public class Nacimientos {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int mes = pedirMes();
		int anno = pedirAnno();
		int dia;
		boolean diaValido;
		do {
			dia = pedirDia();
			diaValido = validarDia(dia, mes, anno);
		}while(!diaValido);
		int nacimientos = introNacimientos();
		datosRegistrados(nacimientos, dia, mes, anno);
		continuarEjecucion(nacimientos, dia, mes, anno);
		

	}
	
	///////////////////////////////////////////////////
	
	public static int pedirMes(){
		boolean mesValido = false;
		int mes;
		System.out.println("Introduce el mes");
		do {
			mes = entrada.nextInt();
			mesValido = (mes>=1 && mes<=12);
			if(!mesValido) {
				System.out.println("ERROR. Introduce un mes correcto (entre 1 y 12)");
			}
		}while(!mesValido);
		return mes;
	}
	
	///////////////////////////////////////////////////

	public static int pedirAnno(){
		boolean annoValido;
		int anno;
		System.out.println("Introduce un año");
		do {
			anno = entrada.nextInt();
			annoValido = (anno >= 1582);
			if(!annoValido) {
				System.out.println("ERROR. Introduce un año correcto (mayor o igual que 1582)");
			}
		}while(!annoValido);
		return anno;
	}
	///////////////////////////////////////////////////

	public static int pedirDia(){
		System.out.println("Introduce el día");
		return entrada.nextInt();
		
	}
	///////////////////////////////////////////////////

	public static boolean validarDia(int dia, int mes, int anno){
		boolean diaValido = false;
		switch(mes)
		{
			case 4:
			case 6:
			case 9:
			case 11:
				diaValido = (dia>=1 && dia<=30);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 30");
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diaValido = (dia>=1 && dia<=31);
				if(!diaValido) {
					System.out.println("ERROR. Introduce un día valido entre 1 y 31");
				}
				break;
			case 2:
				if(esBisiesto(anno)) {
					diaValido = (dia>=1 && dia<=29);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 29");
					}
				}else {
					diaValido = (dia>=1 && dia<=28);
					if(!diaValido) {
						System.out.println("ERROR. Introduce un día valido entre 1 y 28");
					}
				}
				
		}
		return diaValido;
		
	}
	///////////////////////////////////////////////////

	public static boolean esBisiesto(int anno) {
		return ((anno%4 == 0)&&(anno%100!=0)||(anno%400==0));
	}

	
	//fin codigo luis
	//////////////////////////////////////////////////////////////////////////////////////////////////

	public static int introNacimientos() {
		boolean nacimientoValido = false;
		int numNacimientos;
		System.out.println("Introduce el numero de nacimientos que se han producido este día: ");
		do {
			numNacimientos = entrada.nextInt();
			nacimientoValido = (numNacimientos <=10000 && numNacimientos >0);
			if (!nacimientoValido) {
				System.err.println("El numero de nacimientos es incorrecto, introducelos de nuevo");
			}
			
		}while(!nacimientoValido);
		return numNacimientos;
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void datosRegistrados(int numNacimientos, int dia, int mes, int anno) {
		System.out.println("Has registrado " + numNacimientos + " nacimientos " + ""
				+ " en la fecha " +  dia + "/" + mes + "/" + anno);
	}
	
	
	public static void continuarEjecucion(int numNacimientos, int dia, int mes, int anno) {
		boolean continuarEjecucion = false;
		int opcion;
		System.out.println("Si quieres buscar la fecha en el registro, introduce un 1, de lo contrario si quieres "
				+ " finalizar la aplicación introduce un 2");
		
			opcion = entrada.nextInt();
		
		if (opcion == 1 && opcion == 2);
			continuarEjecucion = true;
				while(!continuarEjecucion) {
					System.out.println("La opcion que has introducido es incorrecta, por favor intentalo de nuevo.");
					opcion = entrada.nextInt();
			
		}
				if(opcion == 2) {
				System.out.println("Programa finalizado correctamente");
				
				}
				
				else {
					
					comprobarFecha(numNacimientos, anno, mes, dia);
					
				}	
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	public static void comprobarFecha(int numNacimientos, int dia, int mes, int anno) {
		System.out.println("Introduce una fecha, para verificar el numero de nacimientos: ");
		int year, month, day;
		year = pedirAnno();
		month = pedirMes();
		day = pedirDia();
		
		boolean condicionSalida = false;
		while(condicionSalida) {
			condicionSalida = (year != anno && month != mes && day != dia);
			System.err.println("La fecha no esta registrada en el sistema, prueba de nuevo: ");
			
		}
		
		System.out.println(" En la fecha " +  dia + "/" + mes + "/" + anno + " Se produjeron " + numNacimientos +
				" nacimientos");
		
	}

	
		
}
