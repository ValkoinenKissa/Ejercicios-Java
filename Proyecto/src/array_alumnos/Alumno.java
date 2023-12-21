package array_alumnos;

public class Alumno {
	private String nombre;
	private int edad;
	private int numMatriculadas;
	
	public Alumno(String nombre,int edad,int numMatriculadas) {
		this.nombre=nombre;
		this.edad=edad;
		this.numMatriculadas=numMatriculadas;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int getNumMatriculadas() {
		return numMatriculadas;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setNumMatriculadas(int numMatriculadas) {
		this.numMatriculadas=numMatriculadas;
	}
	public String mostrarInformacion() {
		return "Me llamo "+nombre+",tengo "+edad
				+"años y estoy matriculado en "+numMatriculadas+" asignaturas.";
	}

}