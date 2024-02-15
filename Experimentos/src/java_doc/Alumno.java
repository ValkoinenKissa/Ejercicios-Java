package java_doc;
/**
 * Clase alumno
 * esta clase contiene general informacion sobre 
 * los alumnos de un instituto
 * 
 * @author Alberto bollo
 * @version 1.0
 * @since 15/02/2024
 */

public class Alumno {

	private String nombre;
	private int edad;
	private int matriculas;
	private int nota;
	private Fecha fecha;

/**
 * Este es el constructor de alumno, el cual recibe 4 parametros
 * @param nombre Nombre del alumno
 * @param edad Edad del alumno
 * @param matriculas Num de asignaturas en las que esta matriculadas el alumno
 * @param fecha fecha de matriculacion del alumno
 */
	public Alumno(String nombre, int edad, int matriculas, Fecha fecha) 
	{
		//Atributos
		
		/**
		 * Nombre del alumno
		 */
			this.nombre = nombre;
			/**
			 * Edad del alumno
			 */
			this.edad = edad;
			/**
			 * Num Asignaturas en las que
			 * esta matriculado el alumno
			 */
			this.matriculas = matriculas;
			/**
			 * Nota del alumno
			 */
			this.nota=0;
			/**
			 * Fecha matriculacion
			 */
			this.fecha=fecha;
	}
	/**Setter del nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	/**
	 * Setter de la edad
	 * @param edad
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Setter de la calificacion del alumno
	 * @param nota
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}
	/**
	 * Gtter de la nota del alumno
	 * @return devuelve el valor de la nota
	 */
	public int getNota(){
		return this.nota;
	}
	/**
	 * Gtter de la matricula
	 * @param matriculas devuelve la matricula
	 */
	public void setMatriculas(int matriculas) {
		this.matriculas = matriculas;
	}
	/**
	 * Getter del nombre
	 * @return Devuelve el nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * Getter de edad 
	 * @return devuelve la edad del alumno
	 */
	
	public int getEdad() {
		return this.edad;
	}
	/**
	 * Getter de edad
	 * @return devuelve la edad
	 */
	
	/**
	 * Getter de matriculas
	 * @return devuelve las matriculas
	 */
	public int getMatriculas() {
		return this.matriculas;
		
	}
	/**
	 * Getter de fecha
	 * @return devuelve la fecha
	 */
	public Fecha getFecha() {
		return this.fecha;
	}
	/**
	 * Metodo ver datos, muestra los datos de todos los atributos 
	 * del objeto con una breve descripcion
	 */
	public void getDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Asignaturas: "+matriculas);
		System.out.println("Nota: "+nota);
		System.out.println("Fecha de matriculación: "+fecha.toString());
	}


}


	
