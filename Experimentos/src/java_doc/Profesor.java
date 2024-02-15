package java_doc;
/**
 * Esta clase recoge los datos generales de un profesor
 * para su uso en un programa que gestiona un instituto
 */
public class Profesor {
	//Atributos
	
	/**
	 * Nombre del profesor
	 */
	private String nombre;
	/**
	 * Nombre del departamento
	 */
	private String departamento;
	/**
	 * Nombre del alumno asociado
	 */
	private Alumno alumno;
	
	/**
	 * El constructor del objeto cuenta con tres parametros
	 * @param nombre Nombre profesor
	 * @param departamento Departamento profesor
	 * @param alumno Nombre alumno
	 */

	public Profesor (String nombre, String departamento, Alumno alumno)
	{
	this.nombre = nombre;
	this.departamento = departamento;
	this.alumno = alumno;
	
	}
	/**
	 * Este metodo recibe como parametro una nota y 
	 * la asigna al alumno
	 * @param nota
	 */
	
	public void asignarNota (int nota) {
		alumno.setNota(nota);
	}
	
	/**
	 * Este metodo imprime el valor de los atributos de la clase
	 * Alumno con una breve descripcion
	 */
		
	public void datosAlumno() {
	System.out.println("Nombre del alumno: "+alumno.getNombre());
	System.out.println("Nota del alumno: "+alumno.getNota());
	}

}

