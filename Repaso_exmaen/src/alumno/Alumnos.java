package alumno;

public class Alumnos {
	
	private String nombre;
	private int edad;
	private int numeroAsignaturas;
	
	
	public Alumnos() {
		nombre = "Nombre_por_defecto";
		edad = 0;
		numeroAsignaturas = 0;
	}
	
	
	public Alumnos(String nombre, int edad, int numeroAsignaturas) {
		this.nombre = nombre;
		this.edad = edad;
		this.numeroAsignaturas = numeroAsignaturas;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getNumeroAsignaturas() {
		return numeroAsignaturas;
	}


	public void setNumeroAsignaturas(int numeroAsignaturas) {
		this.numeroAsignaturas = numeroAsignaturas;
	}
	
	
	public void mostrarDatos() {
		System.out.println("El nombre del alumno es: "+ nombre + " tiene " + edad + " años " + " y esta matriculado en "+ numeroAsignaturas + " asignaturas ");
	}
	
	
	

}
