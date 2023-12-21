package ies;

public class Alumno {
	private String nombre;
	private int edad;
	private int numMatriculadas;
	private int departamento;
	private int nota;
	
	public Alumno(String nombre,int edad,int numMatriculadas, int departamento) {
		this.nombre=nombre;
		this.edad=edad;
		this.nombre=nombre;	
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public int getNota() {
		return nota;
	}
	public int setNota(int nota) {
		return this.nota = nota;
	}
	public int getNumMatriculadas(int numMatriculadas) {
		return this.numMatriculadas = numMatriculadas;
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
	public void mostrarInformacion() {
		System.out.println("Me llamo "+nombre+",tengo "+edad
				+"años y estoy matriculado en "+numMatriculadas+" asignaturas.");
	}

}
