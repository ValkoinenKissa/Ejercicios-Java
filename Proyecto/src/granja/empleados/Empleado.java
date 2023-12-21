package granja.empleados;
import granja.animales.Animal;
public class Empleado {
	private String nombreEmpleado;
	private double nomina = 1000;
	private String animal;
	
	public Empleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
		
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public void trabajar(Animal animal) {
		System.out.println("El nombre del empleado es: " + nombreEmpleado + " este empleado ha estado trabajando con el "
				+ "siguiente animal: " + animal.getEtiqueta());
		
		double incrementoNomina = getNomina();
		incrementoNomina *= 0.1;
		setNomina(incrementoNomina);
	}
	
	
}
