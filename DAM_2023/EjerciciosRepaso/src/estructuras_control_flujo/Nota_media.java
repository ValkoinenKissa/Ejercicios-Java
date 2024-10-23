package estructuras_control_flujo;
import java.util.*;

public class Nota_media {
	static Scanner entrada = new Scanner(System.in);
	public static void main (String[] args) {
		
		System.out.println("Introduce por pantalla las calificaciones de ts alumnos para"
				+ " calcular el promedio de su nota, puedes detener el programa tecleando un -99");
		
		System.out.println();
		
		
		int acum = 0;
		int contador=1;
		boolean stop = false;
		
		while(!stop) {
			System.out.println("Introduce la nota del alumno Nº" + contador);
			int nota = entrada.nextInt();
			if(nota == -99) {
				stop = true;
			}
			
			else if(nota > 10 || nota < 1) {
				System.out.println("La nota introducida no es valida, intenta de nuevo: ");
			}
			
			else
				acum += nota;
				contador++;
	
		}
		
		int resultado = acum / (contador -2);
		
		System.out.println("El promedio de las calificaciones de tus alumnos es: " + resultado);
		
	}

}
