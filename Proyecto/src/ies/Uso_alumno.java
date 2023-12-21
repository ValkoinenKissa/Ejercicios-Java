package ies;
import java.util.*;
public class Uso_alumno {
    static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		Fecha fecha = new Fecha(20,11,2023);
		
		System.out.println("Introduce el nombre del profesor 1");
		String nombre1 = entrada.nextLine();
		Profesores profesor1 = new Profesores(nombre1, 5);
		
		
		System.out.println("Introduce el nombre del profesor 2");
		String nombre2 = entrada.nextLine();
		Profesores profesor2 = new Profesores(nombre2, 5);
		
		
		Alumno alumn1 = new Alumno("Fulanito", 15, 9, profesor1.getDepartamento());
		System.out.println("El alumno 1 se ha dado de alta el dia: ");
		fecha.printFecha();
		Alumno alumn2 = new Alumno("Pepito", 15, 9, profesor2.getDepartamento());
		System.out.println("El alumno 2 se ha dado de alta el dia: ");
		fecha.printFecha();
		
		System.out.println("El profesor asociado a " + alumn1.getNombre() + " es " + profesor1.getNombre());
		System.out.println("El profesor asociado a " + alumn2.getNombre() + " es " + profesor2.getNombre());

		
		System.out.println("Introduce la nota del alumno 1");
		int nota1 = entrada.nextInt();
		
		System.out.println("Introduce la nota del alumno 2");
		int nota2 = entrada.nextInt();
		
		alumn1.setNota(nota1);
		alumn2.setEdad(nota2);
		
		System.out.println("El alumno: " +  alumn1.getNombre() + " tiene la siguinete nota: " + alumn1.getNota());
		System.out.println("El alumno: " +  alumn2.getNombre() + " tiene la siguinete nota: " + alumn2.getNota());
		
		
		
		alumn1.mostrarInformacion();
		System.out.println();
		alumn2.mostrarInformacion();	

	}

}
