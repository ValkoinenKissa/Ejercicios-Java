package granja.empleados;

import granja.animales.Animal;

public class Granjero extends Empleado{
	private String especializacion;

	public Granjero(String nombreEmpleado, String especializacion) {
		super(nombreEmpleado);
		//Insertar metodo privado para esecializacion que sea final.
		
	}

	public final String getEspecializacion() {
		return especializacion;
	}

	public final void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
	
	public void trabajar(Animal animal) {
		boolean eficiencia;
		String especieAnimal = animal.getNombreEspecie();
		if (especializacion.equalsIgnoreCase(especieAnimal)) {
			eficiencia = true;
			animal.comer(eficiencia);
			animal.producir();
			
		}
		
		else {
			eficiencia = false;
			animal.comer(eficiencia);
			animal.producir();
		}
	}

}
