package segundo_trimestre.granja.empleados;

import segundo_trimestre.granja.animales.Animal;


public class Granjero extends Empleado{
	
	private final String especialidad;
	
	public Granjero (String nombre,String especialidad) {
		super(nombre);
		this.especialidad=especialidad;
	}	

	public String getEspecialidad() {
		return especialidad;
	}
	
	
	public void trabajar() {
		Animal animal = this.getAnimal();
		String especieAnimal = animal.getEspecie();
		boolean eficiente = especialidad.equalsIgnoreCase(especieAnimal);
		animal.comer(eficiente);
		animal.producir();
		super.trabajar();
	}

}