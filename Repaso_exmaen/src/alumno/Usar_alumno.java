package alumno;

import java.util.Scanner;

public class Usar_alumno {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		Alumnos alumn1 = new Alumnos();
		
		System.out.println("Introduce el nombre del alumno: ");
		String nombreAlumn = entrada.nextLine();
		alumn1.setNombre(nombreAlumn);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println("Introduce la edad del alumno: ");
		int edad = entrada.nextInt();
		alumn1.setEdad(edad);
		
		
		////////////////////////////////////////////////////////////////
		
		
		System.out.println("Introduce las asignaturas del alumno: ");
		int asignaturas = entrada.nextInt();
		alumn1.setNumeroAsignaturas(asignaturas);
		
		
		
		alumn1.mostrarDatos();
	}

}
